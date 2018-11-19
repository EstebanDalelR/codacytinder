package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: jp.co.cyberagent.android.gpuimage.e */
public class C15792e {
    /* renamed from: a */
    Renderer f48992a;
    /* renamed from: b */
    int f48993b;
    /* renamed from: c */
    int f48994c;
    /* renamed from: d */
    Bitmap f48995d;
    /* renamed from: e */
    EGL10 f48996e = ((EGL10) EGLContext.getEGL());
    /* renamed from: f */
    EGLDisplay f48997f = this.f48996e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    /* renamed from: g */
    EGLConfig[] f48998g;
    /* renamed from: h */
    EGLConfig f48999h;
    /* renamed from: i */
    EGLContext f49000i;
    /* renamed from: j */
    EGLSurface f49001j;
    /* renamed from: k */
    GL10 f49002k;
    /* renamed from: l */
    String f49003l;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15792e(int r5, int r6) {
        /*
        r4 = this;
        r4.<init>();
        r4.f48993b = r5;
        r4.f48994c = r6;
        r5 = 2;
        r6 = new int[r5];
        r0 = 5;
        r0 = new int[r0];
        r1 = 0;
        r2 = 12375; // 0x3057 float:1.7341E-41 double:6.114E-320;
        r0[r1] = r2;
        r1 = r4.f48993b;
        r2 = 1;
        r0[r2] = r1;
        r1 = 12374; // 0x3056 float:1.734E-41 double:6.1136E-320;
        r0[r5] = r1;
        r5 = r4.f48994c;
        r1 = 3;
        r0[r1] = r5;
        r5 = 4;
        r2 = 12344; // 0x3038 float:1.7298E-41 double:6.0987E-320;
        r0[r5] = r2;
        r5 = javax.microedition.khronos.egl.EGLContext.getEGL();
        r5 = (javax.microedition.khronos.egl.EGL10) r5;
        r4.f48996e = r5;
        r5 = r4.f48996e;
        r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        r5 = r5.eglGetDisplay(r2);
        r4.f48997f = r5;
        r5 = r4.f48996e;
        r2 = r4.f48997f;
        r5.eglInitialize(r2, r6);
        r5 = r4.m59796c();
        r4.f48999h = r5;
        r5 = new int[r1];
        r5 = {12440, 2, 12344};
        r6 = r4.f48996e;
        r1 = r4.f48997f;
        r2 = r4.f48999h;
        r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r5 = r6.eglCreateContext(r1, r2, r3, r5);
        r4.f49000i = r5;
        r5 = r4.f48996e;
        r6 = r4.f48997f;
        r1 = r4.f48999h;
        r5 = r5.eglCreatePbufferSurface(r6, r1, r0);
        r4.f49001j = r5;
        r5 = r4.f48996e;
        r6 = r4.f48997f;
        r0 = r4.f49001j;
        r1 = r4.f49001j;
        r2 = r4.f49000i;
        r5.eglMakeCurrent(r6, r0, r1, r2);
        r5 = r4.f49000i;
        r5 = r5.getGL();
        r5 = (javax.microedition.khronos.opengles.GL10) r5;
        r4.f49002k = r5;
        r5 = java.lang.Thread.currentThread();
        r5 = r5.getName();
        r4.f49003l = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.co.cyberagent.android.gpuimage.e.<init>(int, int):void");
    }

    /* renamed from: a */
    public void m59799a(Renderer renderer) {
        this.f48992a = renderer;
        if (Thread.currentThread().getName().equals(this.f49003l) == null) {
            Log.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
            return;
        }
        this.f48992a.onSurfaceCreated(this.f49002k, this.f48999h);
        this.f48992a.onSurfaceChanged(this.f49002k, this.f48993b, this.f48994c);
    }

    /* renamed from: a */
    public Bitmap m59798a() {
        if (this.f48992a == null) {
            Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
            return null;
        } else if (Thread.currentThread().getName().equals(this.f49003l)) {
            this.f48992a.onDrawFrame(this.f49002k);
            this.f48992a.onDrawFrame(this.f49002k);
            m59797d();
            return this.f48995d;
        } else {
            Log.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
            return null;
        }
    }

    /* renamed from: b */
    public void m59800b() {
        this.f48992a.onDrawFrame(this.f49002k);
        this.f48992a.onDrawFrame(this.f49002k);
        this.f48996e.eglMakeCurrent(this.f48997f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.f48996e.eglDestroySurface(this.f48997f, this.f49001j);
        this.f48996e.eglDestroyContext(this.f48997f, this.f49000i);
        this.f48996e.eglTerminate(this.f48997f);
    }

    /* renamed from: c */
    private EGLConfig m59796c() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[]{12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr3 = iArr;
        this.f48996e.eglChooseConfig(this.f48997f, iArr2, null, 0, iArr3);
        int i = iArr[0];
        this.f48998g = new EGLConfig[i];
        this.f48996e.eglChooseConfig(this.f48997f, iArr2, this.f48998g, i, iArr3);
        return this.f48998g[0];
    }

    /* renamed from: d */
    private void m59797d() {
        int[] iArr = new int[(this.f48993b * this.f48994c)];
        Buffer allocate = IntBuffer.allocate(this.f48993b * this.f48994c);
        this.f49002k.glReadPixels(0, 0, this.f48993b, this.f48994c, 6408, 5121, allocate);
        int[] array = allocate.array();
        for (int i = 0; i < this.f48994c; i++) {
            for (int i2 = 0; i2 < this.f48993b; i2++) {
                iArr[(((this.f48994c - i) - 1) * this.f48993b) + i2] = array[(this.f48993b * i) + i2];
            }
        }
        this.f48995d = Bitmap.createBitmap(this.f48993b, this.f48994c, Config.ARGB_8888);
        this.f48995d.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
    }
}
