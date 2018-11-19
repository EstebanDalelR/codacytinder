package com.mapbox.mapboxsdk.maps.renderer.textureview;

import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import p000a.p001a.C0001a;

class TextureViewRenderThread extends Thread implements SurfaceTextureListener {
    private boolean destroyContext;
    private boolean destroySurface;
    private final EGLHolder eglHolder;
    private final ArrayList<Runnable> eventQueue = new ArrayList();
    private boolean exited;
    private int height;
    private final Object lock = new Object();
    private final TextureViewMapRenderer mapRenderer;
    private boolean paused;
    private boolean requestRender;
    private boolean shouldExit;
    private boolean sizeChanged;
    private SurfaceTexture surface;
    private int width;

    private static class EGLHolder {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private EGL10 egl;
        private EGLConfig eglConfig;
        private EGLContext eglContext = EGL10.EGL_NO_CONTEXT;
        private EGLDisplay eglDisplay = EGL10.EGL_NO_DISPLAY;
        private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
        private final WeakReference<TextureView> textureViewWeakRef;
        private boolean translucentSurface;

        EGLHolder(WeakReference<TextureView> weakReference, boolean z) {
            this.textureViewWeakRef = weakReference;
            this.translucentSurface = z;
        }

        void prepare() {
            this.egl = (EGL10) EGLContext.getEGL();
            if (this.eglDisplay == EGL10.EGL_NO_DISPLAY) {
                this.eglDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (this.eglDisplay == EGL10.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglGetDisplay failed");
                }
                if (!this.egl.eglInitialize(this.eglDisplay, new int[2])) {
                    throw new RuntimeException("eglInitialize failed");
                }
            }
            if (this.textureViewWeakRef == null) {
                this.eglConfig = null;
                this.eglContext = EGL10.EGL_NO_CONTEXT;
            } else if (this.eglContext == EGL10.EGL_NO_CONTEXT) {
                this.eglConfig = new EGLConfigChooser(this.translucentSurface).chooseConfig(this.egl, this.eglDisplay);
                this.eglContext = this.egl.eglCreateContext(this.eglDisplay, this.eglConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            }
            if (this.eglContext == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("createContext");
            }
        }

        GL10 createGL() {
            return (GL10) this.eglContext.getGL();
        }

        boolean createSurface() {
            destroySurface();
            TextureView textureView = (TextureView) this.textureViewWeakRef.get();
            if (textureView != null) {
                this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, textureView.getSurfaceTexture(), new int[]{12344});
            } else {
                this.eglSurface = EGL10.EGL_NO_SURFACE;
            }
            if (this.eglSurface != null) {
                if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
                    return makeCurrent();
                }
            }
            if (this.egl.eglGetError() == 12299) {
                C0001a.e("createWindowSurface returned EGL_BAD_NATIVE_WINDOW.", new Object[0]);
            }
            return false;
        }

        boolean makeCurrent() {
            if (this.egl.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                return true;
            }
            C0001a.d("eglMakeCurrent: %s", new Object[]{Integer.valueOf(this.egl.eglGetError())});
            return false;
        }

        int swap() {
            return !this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface) ? this.egl.eglGetError() : 12288;
        }

        private void destroySurface() {
            if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
                if (!this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface)) {
                    C0001a.d("Could not destroy egl surface. Display %s, Surface %s", new Object[]{this.eglDisplay, this.eglSurface});
                }
                this.eglSurface = EGL10.EGL_NO_SURFACE;
            }
        }

        private void destroyContext() {
            if (this.eglContext != EGL10.EGL_NO_CONTEXT) {
                if (!this.egl.eglDestroyContext(this.eglDisplay, this.eglContext)) {
                    C0001a.d("Could not destroy egl context. Display %s, Context %s", new Object[]{this.eglDisplay, this.eglContext});
                }
                this.eglContext = EGL10.EGL_NO_CONTEXT;
            }
        }

        private void terminate() {
            if (this.eglDisplay != EGL10.EGL_NO_DISPLAY) {
                if (!this.egl.eglTerminate(this.eglDisplay)) {
                    C0001a.d("Could not terminate egl. Display %s", new Object[]{this.eglDisplay});
                }
                this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            }
        }

        void cleanup() {
            destroySurface();
            destroyContext();
            terminate();
        }
    }

    @UiThread
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @UiThread
    TextureViewRenderThread(@NonNull TextureView textureView, @NonNull TextureViewMapRenderer textureViewMapRenderer) {
        textureView.setOpaque(textureViewMapRenderer.isTranslucentSurface() ^ 1);
        textureView.setSurfaceTextureListener(this);
        this.mapRenderer = textureViewMapRenderer;
        this.eglHolder = new EGLHolder(new WeakReference(textureView), textureViewMapRenderer.isTranslucentSurface());
    }

    @UiThread
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            this.surface = surfaceTexture;
            this.width = i;
            this.height = i2;
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    @UiThread
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            this.width = i;
            this.height = i2;
            this.sizeChanged = true;
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    @UiThread
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.lock) {
            this.surface = null;
            this.destroySurface = true;
            this.requestRender = false;
            this.lock.notifyAll();
        }
        return true;
    }

    void requestRender() {
        synchronized (this.lock) {
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    void queueEvent(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("runnable must not be null");
        }
        synchronized (this.lock) {
            this.eventQueue.add(runnable);
            this.lock.notifyAll();
        }
    }

    @UiThread
    void onPause() {
        synchronized (this.lock) {
            this.paused = true;
            this.lock.notifyAll();
        }
    }

    @UiThread
    void onResume() {
        synchronized (this.lock) {
            this.paused = false;
            this.lock.notifyAll();
        }
    }

    @android.support.annotation.UiThread
    void onDestroy() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.lock;
        monitor-enter(r0);
        r1 = 1;
        r2.shouldExit = r1;	 Catch:{ all -> 0x001f }
        r1 = r2.lock;	 Catch:{ all -> 0x001f }
        r1.notifyAll();	 Catch:{ all -> 0x001f }
    L_0x000b:
        r1 = r2.exited;	 Catch:{ all -> 0x001f }
        if (r1 != 0) goto L_0x001d;
    L_0x000f:
        r1 = r2.lock;	 Catch:{ InterruptedException -> 0x0015 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0015 }
        goto L_0x000b;
    L_0x0015:
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x001f }
        r1.interrupt();	 Catch:{ all -> 0x001f }
        goto L_0x000b;	 Catch:{ all -> 0x001f }
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x001f }
        return;	 Catch:{ all -> 0x001f }
    L_0x001f:
        r1 = move-exception;	 Catch:{ all -> 0x001f }
        monitor-exit(r0);	 Catch:{ all -> 0x001f }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewRenderThread.onDestroy():void");
    }

    public void run() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
    L_0x0000:
        r0 = 1;
        r1 = r9.lock;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x0004:
        r2 = r9.shouldExit;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x0130 }
    L_0x0008:
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        r1 = r9.eglHolder;
        r1.cleanup();
        r2 = r9.lock;
        monitor-enter(r2);
        r9.exited = r0;	 Catch:{ all -> 0x001a }
        r0 = r9.lock;	 Catch:{ all -> 0x001a }
        r0.notifyAll();	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r0 = move-exception;	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r2 = r9.eventQueue;	 Catch:{ all -> 0x0130 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0130 }
        r3 = -1;	 Catch:{ all -> 0x0130 }
        r4 = 0;	 Catch:{ all -> 0x0130 }
        r5 = 0;	 Catch:{ all -> 0x0130 }
        if (r2 != 0) goto L_0x0035;	 Catch:{ all -> 0x0130 }
    L_0x0028:
        r2 = r9.eventQueue;	 Catch:{ all -> 0x0130 }
        r2 = r2.remove(r5);	 Catch:{ all -> 0x0130 }
        r2 = (java.lang.Runnable) r2;	 Catch:{ all -> 0x0130 }
    L_0x0030:
        r3 = 0;	 Catch:{ all -> 0x0130 }
        r6 = 0;	 Catch:{ all -> 0x0130 }
        r7 = -1;	 Catch:{ all -> 0x0130 }
        r8 = -1;	 Catch:{ all -> 0x0130 }
        goto L_0x0085;	 Catch:{ all -> 0x0130 }
    L_0x0035:
        r2 = r9.destroySurface;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ all -> 0x0130 }
    L_0x0039:
        r2 = r9.eglHolder;	 Catch:{ all -> 0x0130 }
        r2.destroySurface();	 Catch:{ all -> 0x0130 }
        r9.destroySurface = r5;	 Catch:{ all -> 0x0130 }
        goto L_0x004c;	 Catch:{ all -> 0x0130 }
    L_0x0041:
        r2 = r9.destroyContext;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x004e;	 Catch:{ all -> 0x0130 }
    L_0x0045:
        r2 = r9.eglHolder;	 Catch:{ all -> 0x0130 }
        r2.destroyContext();	 Catch:{ all -> 0x0130 }
        r9.destroyContext = r5;	 Catch:{ all -> 0x0130 }
    L_0x004c:
        r2 = r4;	 Catch:{ all -> 0x0130 }
        goto L_0x0030;	 Catch:{ all -> 0x0130 }
    L_0x004e:
        r2 = r9.surface;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x0129;	 Catch:{ all -> 0x0130 }
    L_0x0052:
        r2 = r9.paused;	 Catch:{ all -> 0x0130 }
        if (r2 != 0) goto L_0x0129;	 Catch:{ all -> 0x0130 }
    L_0x0056:
        r2 = r9.requestRender;	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x0129;	 Catch:{ all -> 0x0130 }
    L_0x005a:
        r3 = r9.width;	 Catch:{ all -> 0x0130 }
        r2 = r9.height;	 Catch:{ all -> 0x0130 }
        r6 = r9.eglHolder;	 Catch:{ all -> 0x0130 }
        r6 = r6.eglContext;	 Catch:{ all -> 0x0130 }
        r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;	 Catch:{ all -> 0x0130 }
        if (r6 != r7) goto L_0x006e;	 Catch:{ all -> 0x0130 }
    L_0x0068:
        r8 = r2;	 Catch:{ all -> 0x0130 }
        r7 = r3;	 Catch:{ all -> 0x0130 }
        r2 = r4;	 Catch:{ all -> 0x0130 }
        r3 = 1;	 Catch:{ all -> 0x0130 }
    L_0x006c:
        r6 = 0;	 Catch:{ all -> 0x0130 }
        goto L_0x0085;	 Catch:{ all -> 0x0130 }
    L_0x006e:
        r6 = r9.eglHolder;	 Catch:{ all -> 0x0130 }
        r6 = r6.eglSurface;	 Catch:{ all -> 0x0130 }
        r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;	 Catch:{ all -> 0x0130 }
        if (r6 != r7) goto L_0x007e;	 Catch:{ all -> 0x0130 }
    L_0x0078:
        r8 = r2;	 Catch:{ all -> 0x0130 }
        r7 = r3;	 Catch:{ all -> 0x0130 }
        r2 = r4;	 Catch:{ all -> 0x0130 }
        r3 = 0;	 Catch:{ all -> 0x0130 }
        r6 = 1;	 Catch:{ all -> 0x0130 }
        goto L_0x0085;	 Catch:{ all -> 0x0130 }
    L_0x007e:
        r9.requestRender = r5;	 Catch:{ all -> 0x0130 }
        r8 = r2;	 Catch:{ all -> 0x0130 }
        r7 = r3;	 Catch:{ all -> 0x0130 }
        r2 = r4;	 Catch:{ all -> 0x0130 }
        r3 = 0;	 Catch:{ all -> 0x0130 }
        goto L_0x006c;	 Catch:{ all -> 0x0130 }
    L_0x0085:
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        if (r2 == 0) goto L_0x008d;
    L_0x0088:
        r2.run();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x008d:
        r1 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = r1.createGL();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r3 == 0) goto L_0x00bf;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x0095:
        r2 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.prepare();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = r2.createSurface();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r2 != 0) goto L_0x00ad;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00a2:
        r1 = r9.lock;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r9.destroySurface = r0;	 Catch:{ all -> 0x00aa }
        monitor-exit(r1);	 Catch:{ all -> 0x00aa }
        goto L_0x0000;	 Catch:{ all -> 0x00aa }
    L_0x00aa:
        r2 = move-exception;	 Catch:{ all -> 0x00aa }
        monitor-exit(r1);	 Catch:{ all -> 0x00aa }
        throw r2;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00ad:
        r2 = r9.mapRenderer;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r3 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r3 = r3.eglConfig;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.onSurfaceCreated(r1, r3);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = r9.mapRenderer;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.onSurfaceChanged(r1, r7, r8);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00bf:
        if (r6 == 0) goto L_0x00cd;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00c1:
        r2 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.createSurface();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = r9.mapRenderer;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.onSurfaceChanged(r1, r7, r8);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00cd:
        r2 = r9.sizeChanged;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r2 == 0) goto L_0x00da;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00d1:
        r2 = r9.mapRenderer;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.onSurfaceChanged(r1, r7, r8);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r9.sizeChanged = r5;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00da:
        r2 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = r2.eglSurface;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r2 != r3) goto L_0x00e6;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00e4:
        goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00e6:
        r2 = r9.mapRenderer;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2.onDrawFrame(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = r9.eglHolder;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = r1.swap();	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r1 == r2) goto L_0x0000;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00f5:
        r2 = 12302; // 0x300e float:1.7239E-41 double:6.078E-320;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        if (r1 == r2) goto L_0x0113;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x00f9:
        r2 = "eglSwapBuffer error: %s. Waiting or new surface";	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r3 = new java.lang.Object[r0];	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r3[r5] = r1;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        p000a.p001a.C0001a.d(r2, r3);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = r9.lock;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r9.surface = r4;	 Catch:{ all -> 0x0110 }
        r9.destroySurface = r0;	 Catch:{ all -> 0x0110 }
        monitor-exit(r1);	 Catch:{ all -> 0x0110 }
        goto L_0x0000;	 Catch:{ all -> 0x0110 }
    L_0x0110:
        r2 = move-exception;	 Catch:{ all -> 0x0110 }
        monitor-exit(r1);	 Catch:{ all -> 0x0110 }
        throw r2;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x0113:
        r1 = "Context lost. Waiting for re-aquire";	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r2 = new java.lang.Object[r5];	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        p000a.p001a.C0001a.d(r1, r2);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r1 = r9.lock;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
        r9.surface = r4;	 Catch:{ all -> 0x0126 }
        r9.destroySurface = r0;	 Catch:{ all -> 0x0126 }
        r9.destroyContext = r0;	 Catch:{ all -> 0x0126 }
        monitor-exit(r1);	 Catch:{ all -> 0x0126 }
        goto L_0x0000;	 Catch:{ all -> 0x0126 }
    L_0x0126:
        r2 = move-exception;	 Catch:{ all -> 0x0126 }
        monitor-exit(r1);	 Catch:{ all -> 0x0126 }
        throw r2;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x0129:
        r2 = r9.lock;	 Catch:{ all -> 0x0130 }
        r2.wait();	 Catch:{ all -> 0x0130 }
        goto L_0x0004;	 Catch:{ all -> 0x0130 }
    L_0x0130:
        r2 = move-exception;	 Catch:{ all -> 0x0130 }
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        throw r2;	 Catch:{ InterruptedException -> 0x0148, all -> 0x0133 }
    L_0x0133:
        r1 = move-exception;
        r2 = r9.eglHolder;
        r2.cleanup();
        r2 = r9.lock;
        monitor-enter(r2);
        r9.exited = r0;	 Catch:{ all -> 0x0145 }
        r0 = r9.lock;	 Catch:{ all -> 0x0145 }
        r0.notifyAll();	 Catch:{ all -> 0x0145 }
        monitor-exit(r2);	 Catch:{ all -> 0x0145 }
        throw r1;
    L_0x0145:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0145 }
        throw r0;
    L_0x0148:
        r1 = r9.eglHolder;
        r1.cleanup();
        r1 = r9.lock;
        monitor-enter(r1);
        r9.exited = r0;	 Catch:{ all -> 0x0159 }
        r0 = r9.lock;	 Catch:{ all -> 0x0159 }
        r0.notifyAll();	 Catch:{ all -> 0x0159 }
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
        return;	 Catch:{ all -> 0x0159 }
    L_0x0159:
        r0 = move-exception;	 Catch:{ all -> 0x0159 }
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewRenderThread.run():void");
    }
}
