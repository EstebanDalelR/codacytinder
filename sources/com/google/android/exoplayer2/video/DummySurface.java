package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

@TargetApi(17)
public final class DummySurface extends Surface {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final C2318a thread;
    private boolean threadReleased;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$a */
    private static class C2318a extends HandlerThread implements Callback {
        @MonotonicNonNull
        /* renamed from: a */
        private EGLSurfaceTexture f6965a;
        @MonotonicNonNull
        /* renamed from: b */
        private Handler f6966b;
        @Nullable
        /* renamed from: c */
        private Error f6967c;
        @Nullable
        /* renamed from: d */
        private RuntimeException f6968d;
        @Nullable
        /* renamed from: e */
        private DummySurface f6969e;

        public C2318a() {
            super("dummySurface");
        }

        /* renamed from: a */
        public com.google.android.exoplayer2.video.DummySurface m8511a(int r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r3.start();
            r0 = new android.os.Handler;
            r1 = r3.getLooper();
            r0.<init>(r1, r3);
            r3.f6966b = r0;
            r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture;
            r1 = r3.f6966b;
            r0.<init>(r1);
            r3.f6965a = r0;
            monitor-enter(r3);
            r0 = r3.f6966b;	 Catch:{ all -> 0x0056 }
            r1 = 1;	 Catch:{ all -> 0x0056 }
            r2 = 0;	 Catch:{ all -> 0x0056 }
            r4 = r0.obtainMessage(r1, r4, r2);	 Catch:{ all -> 0x0056 }
            r4.sendToTarget();	 Catch:{ all -> 0x0056 }
        L_0x0023:
            r4 = r3.f6969e;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0035;	 Catch:{ all -> 0x0056 }
        L_0x0027:
            r4 = r3.f6968d;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0035;	 Catch:{ all -> 0x0056 }
        L_0x002b:
            r4 = r3.f6967c;	 Catch:{ all -> 0x0056 }
            if (r4 != 0) goto L_0x0035;
        L_0x002f:
            r3.wait();	 Catch:{ InterruptedException -> 0x0033 }
            goto L_0x0023;
        L_0x0033:
            r2 = 1;
            goto L_0x0023;
        L_0x0035:
            monitor-exit(r3);	 Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x003f;
        L_0x0038:
            r4 = java.lang.Thread.currentThread();
            r4.interrupt();
        L_0x003f:
            r4 = r3.f6968d;
            if (r4 == 0) goto L_0x0046;
        L_0x0043:
            r4 = r3.f6968d;
            throw r4;
        L_0x0046:
            r4 = r3.f6967c;
            if (r4 == 0) goto L_0x004d;
        L_0x004a:
            r4 = r3.f6967c;
            throw r4;
        L_0x004d:
            r4 = r3.f6969e;
            r4 = com.google.android.exoplayer2.util.C2289a.m8309a(r4);
            r4 = (com.google.android.exoplayer2.video.DummySurface) r4;
            return r4;
        L_0x0056:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0056 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.a.a(int):com.google.android.exoplayer2.video.DummySurface");
        }

        /* renamed from: a */
        public void m8512a() {
            C2289a.m8309a(this.f6966b);
            this.f6966b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    try {
                        m8510b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Message message2) {
                        Log.e(DummySurface.TAG, "Failed to initialize dummy surface", message2);
                        this.f6968d = message2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Message message22) {
                        try {
                            Log.e(DummySurface.TAG, "Failed to initialize dummy surface", message22);
                            this.f6967c = message22;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th) {
                            synchronized (this) {
                                notify();
                            }
                        }
                    }
                    return true;
                case 2:
                    try {
                        m8509b();
                    } catch (Throwable th2) {
                        quit();
                    }
                    quit();
                    return true;
                default:
                    return true;
            }
        }

        /* renamed from: b */
        private void m8510b(int i) {
            C2289a.m8309a(this.f6965a);
            this.f6965a.m8304a(i);
            this.f6969e = new DummySurface(this, this.f6965a.m8305b(), i != 0 ? 1 : 0);
        }

        /* renamed from: b */
        private void m8509b() {
            C2289a.m8309a(this.f6965a);
            this.f6965a.m8303a();
        }
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!secureModeInitialized) {
                secureMode = C2314v.f6956a < 24 ? null : getSecureModeV24(context);
                secureModeInitialized = true;
            }
            if (secureMode == null) {
                z = false;
            }
        }
        return z;
    }

    public static DummySurface newInstanceV17(Context context, boolean z) {
        assertApiLevel17OrHigher();
        int i = 0;
        if (z) {
            if (isSecureSupported(context) == null) {
                context = null;
                C2289a.m8313b(context);
                context = new C2318a();
                if (z) {
                    i = secureMode;
                }
                return context.m8511a(i);
            }
        }
        context = true;
        C2289a.m8313b(context);
        context = new C2318a();
        if (z) {
            i = secureMode;
        }
        return context.m8511a(i);
    }

    private DummySurface(C2318a c2318a, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = c2318a;
        this.secure = z;
    }

    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.m8512a();
                this.threadReleased = true;
            }
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (C2314v.f6956a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    private static int getSecureModeV24(Context context) {
        if (C2314v.f6956a < 26 && ("samsung".equals(C2314v.f6958c) || "XT1650".equals(C2314v.f6959d))) {
            return 0;
        }
        if (C2314v.f6956a < 26 && context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") == null) {
            return 0;
        }
        context = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (context == null || !context.contains(EXTENSION_PROTECTED_CONTENT)) {
            return 0;
        }
        return context.contains(EXTENSION_SURFACELESS_CONTEXT) != null ? true : 2;
    }
}
