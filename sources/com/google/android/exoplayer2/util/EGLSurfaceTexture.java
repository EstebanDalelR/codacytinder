package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.support.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TargetApi(17)
public final class EGLSurfaceTexture implements OnFrameAvailableListener, Runnable {
    /* renamed from: a */
    private static final int[] f6879a = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    /* renamed from: b */
    private final Handler f6880b;
    /* renamed from: c */
    private final int[] f6881c = new int[1];
    @Nullable
    /* renamed from: d */
    private EGLDisplay f6882d;
    @Nullable
    /* renamed from: e */
    private EGLContext f6883e;
    @Nullable
    /* renamed from: f */
    private EGLSurface f6884f;
    @Nullable
    /* renamed from: g */
    private SurfaceTexture f6885g;

    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f6880b = handler;
    }

    /* renamed from: a */
    public void m8304a(int i) {
        this.f6882d = m8302c();
        EGLConfig a = m8298a(this.f6882d);
        this.f6883e = m8299a(this.f6882d, a, i);
        this.f6884f = m8300a(this.f6882d, a, this.f6883e, i);
        m8301a(this.f6881c);
        this.f6885g = new SurfaceTexture(this.f6881c[0]);
        this.f6885g.setOnFrameAvailableListener(this);
    }

    /* renamed from: a */
    public void m8303a() {
        this.f6880b.removeCallbacks(this);
        try {
            if (this.f6885g != null) {
                this.f6885g.release();
                GLES20.glDeleteTextures(1, this.f6881c, 0);
            }
            if (!(this.f6884f == null || this.f6884f.equals(EGL14.EGL_NO_SURFACE))) {
                EGL14.eglDestroySurface(this.f6882d, this.f6884f);
            }
            if (this.f6883e != null) {
                EGL14.eglDestroyContext(this.f6882d, this.f6883e);
            }
            this.f6882d = null;
            this.f6883e = null;
            this.f6884f = null;
            this.f6885g = null;
        } catch (Throwable th) {
            if (!(this.f6884f == null || this.f6884f.equals(EGL14.EGL_NO_SURFACE))) {
                EGL14.eglDestroySurface(this.f6882d, this.f6884f);
            }
            if (this.f6883e != null) {
                EGL14.eglDestroyContext(this.f6882d, this.f6883e);
            }
            this.f6882d = null;
            this.f6883e = null;
            this.f6884f = null;
            this.f6885g = null;
        }
    }

    /* renamed from: b */
    public SurfaceTexture m8305b() {
        return (SurfaceTexture) C2289a.m8309a(this.f6885g);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6880b.post(this);
    }

    public void run() {
        if (this.f6885g != null) {
            this.f6885g.updateTexImage();
        }
    }

    /* renamed from: c */
    private static EGLDisplay m8302c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    /* renamed from: a */
    private static EGLConfig m8298a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, f6879a, 0, eGLConfigArr, 0, 1, iArr, 0) != null && iArr[0] > 0) {
            if (eGLConfigArr[0] != null) {
                return eGLConfigArr[0];
            }
        }
        throw new GlException(C2314v.m8466a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eGLDisplay), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static android.opengl.EGLContext m8299a(android.opengl.EGLDisplay r2, android.opengl.EGLConfig r3, int r4) {
        /*
        if (r4 != 0) goto L_0x0009;
    L_0x0002:
        r4 = 3;
        r4 = new int[r4];
        r4 = {12440, 2, 12344};
        goto L_0x000f;
    L_0x0009:
        r4 = 5;
        r4 = new int[r4];
        r4 = {12440, 2, 12992, 1, 12344};
    L_0x000f:
        r0 = android.opengl.EGL14.EGL_NO_CONTEXT;
        r1 = 0;
        r2 = android.opengl.EGL14.eglCreateContext(r2, r3, r0, r4, r1);
        if (r2 != 0) goto L_0x0021;
    L_0x0018:
        r2 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
        r3 = "eglCreateContext failed";
        r4 = 0;
        r2.<init>(r3);
        throw r2;
    L_0x0021:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.EGLSurfaceTexture.a(android.opengl.EGLDisplay, android.opengl.EGLConfig, int):android.opengl.EGLContext");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static android.opengl.EGLSurface m8300a(android.opengl.EGLDisplay r2, android.opengl.EGLConfig r3, android.opengl.EGLContext r4, int r5) {
        /*
        r0 = 0;
        r1 = 1;
        if (r5 != r1) goto L_0x0007;
    L_0x0004:
        r3 = android.opengl.EGL14.EGL_NO_SURFACE;
        goto L_0x0026;
    L_0x0007:
        r1 = 2;
        if (r5 != r1) goto L_0x0011;
    L_0x000a:
        r5 = 7;
        r5 = new int[r5];
        r5 = {12375, 1, 12374, 1, 12992, 1, 12344};
        goto L_0x0017;
    L_0x0011:
        r5 = 5;
        r5 = new int[r5];
        r5 = {12375, 1, 12374, 1, 12344};
    L_0x0017:
        r1 = 0;
        r3 = android.opengl.EGL14.eglCreatePbufferSurface(r2, r3, r5, r1);
        if (r3 != 0) goto L_0x0026;
    L_0x001e:
        r2 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
        r3 = "eglCreatePbufferSurface failed";
        r2.<init>(r3);
        throw r2;
    L_0x0026:
        r2 = android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4);
        if (r2 != 0) goto L_0x0034;
    L_0x002c:
        r2 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
        r3 = "eglMakeCurrent failed";
        r2.<init>(r3);
        throw r2;
    L_0x0034:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.EGLSurfaceTexture.a(android.opengl.EGLDisplay, android.opengl.EGLConfig, android.opengl.EGLContext, int):android.opengl.EGLSurface");
    }

    /* renamed from: a */
    private static void m8301a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        iArr = GLES20.glGetError();
        if (iArr != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("glGenTextures failed. Error: ");
            stringBuilder.append(Integer.toHexString(iArr));
            throw new GlException(stringBuilder.toString());
        }
    }
}
