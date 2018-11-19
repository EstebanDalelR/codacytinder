package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzzv
@TargetApi(14)
public final class kb extends Thread implements OnFrameAvailableListener, ka {
    /* renamed from: a */
    private static final float[] f23364a = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    /* renamed from: A */
    private volatile boolean f23365A;
    /* renamed from: B */
    private volatile boolean f23366B;
    /* renamed from: b */
    private final jy f23367b;
    /* renamed from: c */
    private final float[] f23368c;
    /* renamed from: d */
    private final float[] f23369d;
    /* renamed from: e */
    private final float[] f23370e;
    /* renamed from: f */
    private final float[] f23371f;
    /* renamed from: g */
    private final float[] f23372g;
    /* renamed from: h */
    private final float[] f23373h;
    /* renamed from: i */
    private final float[] f23374i;
    /* renamed from: j */
    private float f23375j;
    /* renamed from: k */
    private float f23376k;
    /* renamed from: l */
    private float f23377l;
    /* renamed from: m */
    private int f23378m;
    /* renamed from: n */
    private int f23379n;
    /* renamed from: o */
    private SurfaceTexture f23380o;
    /* renamed from: p */
    private SurfaceTexture f23381p;
    /* renamed from: q */
    private int f23382q;
    /* renamed from: r */
    private int f23383r;
    /* renamed from: s */
    private int f23384s;
    /* renamed from: t */
    private FloatBuffer f23385t = ByteBuffer.allocateDirect(f23364a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    /* renamed from: u */
    private final CountDownLatch f23386u;
    /* renamed from: v */
    private final Object f23387v;
    /* renamed from: w */
    private EGL10 f23388w;
    /* renamed from: x */
    private EGLDisplay f23389x;
    /* renamed from: y */
    private EGLContext f23390y;
    /* renamed from: z */
    private EGLSurface f23391z;

    public kb(Context context) {
        super("SphericalVideoProcessor");
        this.f23385t.put(f23364a).position(0);
        this.f23368c = new float[9];
        this.f23369d = new float[9];
        this.f23370e = new float[9];
        this.f23371f = new float[9];
        this.f23372g = new float[9];
        this.f23373h = new float[9];
        this.f23374i = new float[9];
        this.f23375j = Float.NaN;
        this.f23367b = new jy(context);
        this.f23367b.m19955a((ka) this);
        this.f23386u = new CountDownLatch(1);
        this.f23387v = new Object();
    }

    /* renamed from: a */
    private static int m27402a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m27403a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m27403a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m27403a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m27403a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        Log.e("SphericalVideoRenderer", stringBuilder.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m27403a("deleteShader");
        return 0;
    }

    /* renamed from: a */
    private static void m27403a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(glGetError);
            Log.e("SphericalVideoRenderer", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static void m27404a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: a */
    private static void m27405a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: b */
    private static void m27406b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: d */
    private final void m27407d() {
        float[] fArr;
        float f;
        while (this.f23384s > 0) {
            this.f23380o.updateTexImage();
            this.f23384s--;
        }
        if (this.f23367b.m19956a(this.f23368c)) {
            if (Float.isNaN(this.f23375j)) {
                fArr = this.f23368c;
                float[] fArr2 = new float[]{0.0f, 1.0f, 0.0f};
                float[] fArr3 = new float[]{((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]), ((fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[5] * fArr2[2]), ((fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1])) + (fArr[8] * fArr2[2])};
                this.f23375j = -(((float) Math.atan2((double) fArr3[1], (double) fArr3[0])) - 1.5707964f);
            }
            fArr = this.f23373h;
            f = this.f23375j + this.f23376k;
        } else {
            m27404a(this.f23368c, -1.5707964f);
            fArr = this.f23373h;
            f = this.f23376k;
        }
        m27406b(fArr, f);
        m27404a(this.f23369d, 1.5707964f);
        m27405a(this.f23370e, this.f23373h, this.f23369d);
        m27405a(this.f23371f, this.f23368c, this.f23370e);
        m27404a(this.f23372g, this.f23377l);
        m27405a(this.f23374i, this.f23372g, this.f23371f);
        GLES20.glUniformMatrix3fv(this.f23383r, 1, false, this.f23374i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m27403a("drawArrays");
        GLES20.glFinish();
        this.f23388w.eglSwapBuffers(this.f23389x, this.f23391z);
    }

    /* renamed from: e */
    private final boolean m27408e() {
        boolean z = false;
        if (!(this.f23391z == null || this.f23391z == EGL10.EGL_NO_SURFACE)) {
            z = this.f23388w.eglDestroySurface(this.f23389x, this.f23391z) | (this.f23388w.eglMakeCurrent(this.f23389x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | 0);
            this.f23391z = null;
        }
        if (this.f23390y != null) {
            z |= this.f23388w.eglDestroyContext(this.f23389x, this.f23390y);
            this.f23390y = null;
        }
        if (this.f23389x == null) {
            return z;
        }
        z |= this.f23388w.eglTerminate(this.f23389x);
        this.f23389x = null;
        return z;
    }

    /* renamed from: a */
    public final void mo4646a() {
        synchronized (this.f23387v) {
            this.f23387v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m27410a(float f, float f2) {
        int i;
        if (this.f23379n > this.f23378m) {
            f = (f * 1.7453293f) / ((float) this.f23379n);
            f2 *= 1.7453293f;
            i = this.f23379n;
        } else {
            f = (f * 1.7453293f) / ((float) this.f23378m);
            f2 *= 1.7453293f;
            i = this.f23378m;
        }
        f2 /= (float) i;
        this.f23376k -= f;
        this.f23377l -= f2;
        if (this.f23377l < -1.5707964f) {
            this.f23377l = -1.5707964f;
        }
        if (this.f23377l > 1.5707964f) {
            this.f23377l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public final void m27411a(int i, int i2) {
        synchronized (this.f23387v) {
            this.f23379n = i;
            this.f23378m = i2;
            this.f23365A = true;
            this.f23387v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void m27412a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f23379n = i;
        this.f23378m = i2;
        this.f23381p = surfaceTexture;
    }

    /* renamed from: b */
    public final void m27413b() {
        synchronized (this.f23387v) {
            this.f23366B = true;
            this.f23381p = null;
            this.f23387v.notifyAll();
        }
    }

    /* renamed from: c */
    public final android.graphics.SurfaceTexture m27414c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f23381p;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
        return r0;
    L_0x0006:
        r0 = r1.f23386u;	 Catch:{ InterruptedException -> 0x000b }
        r0.await();	 Catch:{ InterruptedException -> 0x000b }
    L_0x000b:
        r0 = r1.f23380o;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.kb.c():android.graphics.SurfaceTexture");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f23384s++;
        synchronized (this.f23387v) {
            this.f23387v.notifyAll();
        }
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = r12.f23381p;
        if (r0 != 0) goto L_0x000f;
    L_0x0004:
        r0 = "SphericalVideoProcessor started with no output texture.";
        com.google.android.gms.internal.hx.m19913c(r0);
        r0 = r12.f23386u;
        r0.countDown();
        return;
    L_0x000f:
        r0 = javax.microedition.khronos.egl.EGLContext.getEGL();
        r0 = (javax.microedition.khronos.egl.EGL10) r0;
        r12.f23388w = r0;
        r0 = r12.f23388w;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        r0 = r0.eglGetDisplay(r1);
        r12.f23389x = r0;
        r0 = r12.f23389x;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        if (r0 != r1) goto L_0x002d;
    L_0x002a:
        r0 = 0;
        goto L_0x00a4;
    L_0x002d:
        r0 = 2;
        r0 = new int[r0];
        r1 = r12.f23388w;
        r5 = r12.f23389x;
        r0 = r1.eglInitialize(r5, r0);
        if (r0 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x002a;
    L_0x003b:
        r0 = new int[r3];
        r1 = new javax.microedition.khronos.egl.EGLConfig[r3];
        r5 = 11;
        r7 = new int[r5];
        r7 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344};
        r5 = r12.f23388w;
        r6 = r12.f23389x;
        r9 = 1;
        r8 = r1;
        r10 = r0;
        r5 = r5.eglChooseConfig(r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x005a;
    L_0x0053:
        r0 = r0[r4];
        if (r0 <= 0) goto L_0x005a;
    L_0x0057:
        r0 = r1[r4];
        goto L_0x005b;
    L_0x005a:
        r0 = r2;
    L_0x005b:
        if (r0 != 0) goto L_0x005e;
    L_0x005d:
        goto L_0x002a;
    L_0x005e:
        r1 = 3;
        r1 = new int[r1];
        r1 = {12440, 2, 12344};
        r5 = r12.f23388w;
        r6 = r12.f23389x;
        r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r1 = r5.eglCreateContext(r6, r0, r7, r1);
        r12.f23390y = r1;
        r1 = r12.f23390y;
        if (r1 == 0) goto L_0x002a;
    L_0x0074:
        r1 = r12.f23390y;
        r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        if (r1 != r5) goto L_0x007b;
    L_0x007a:
        goto L_0x002a;
    L_0x007b:
        r1 = r12.f23388w;
        r5 = r12.f23389x;
        r6 = r12.f23381p;
        r0 = r1.eglCreateWindowSurface(r5, r0, r6, r2);
        r12.f23391z = r0;
        r0 = r12.f23391z;
        if (r0 == 0) goto L_0x002a;
    L_0x008b:
        r0 = r12.f23391z;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        if (r0 != r1) goto L_0x0092;
    L_0x0091:
        goto L_0x002a;
    L_0x0092:
        r0 = r12.f23388w;
        r1 = r12.f23389x;
        r5 = r12.f23391z;
        r6 = r12.f23391z;
        r7 = r12.f23390y;
        r0 = r0.eglMakeCurrent(r1, r5, r6, r7);
        if (r0 != 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x002a;
    L_0x00a3:
        r0 = 1;
    L_0x00a4:
        r1 = 35633; // 0x8b31 float:4.9932E-41 double:1.7605E-319;
        r5 = com.google.android.gms.internal.alo.aV;
        r6 = com.google.android.gms.internal.aja.m19221f();
        r6 = r6.m19334a(r5);
        r6 = (java.lang.String) r6;
        r7 = r5.m19324b();
        r6 = r6.equals(r7);
        if (r6 != 0) goto L_0x00c8;
    L_0x00bd:
        r6 = com.google.android.gms.internal.aja.m19221f();
        r5 = r6.m19334a(r5);
        r5 = (java.lang.String) r5;
        goto L_0x00ca;
    L_0x00c8:
        r5 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    L_0x00ca:
        r1 = m27402a(r1, r5);
        if (r1 != 0) goto L_0x00d3;
    L_0x00d0:
        r6 = 0;
        goto L_0x0155;
    L_0x00d3:
        r5 = 35632; // 0x8b30 float:4.9931E-41 double:1.76045E-319;
        r6 = com.google.android.gms.internal.alo.aW;
        r7 = com.google.android.gms.internal.aja.m19221f();
        r7 = r7.m19334a(r6);
        r7 = (java.lang.String) r7;
        r8 = r6.m19324b();
        r7 = r7.equals(r8);
        if (r7 != 0) goto L_0x00f7;
    L_0x00ec:
        r7 = com.google.android.gms.internal.aja.m19221f();
        r6 = r7.m19334a(r6);
        r6 = (java.lang.String) r6;
        goto L_0x00f9;
    L_0x00f7:
        r6 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    L_0x00f9:
        r5 = m27402a(r5, r6);
        if (r5 != 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x00d0;
    L_0x0100:
        r6 = android.opengl.GLES20.glCreateProgram();
        r7 = "createProgram";
        m27403a(r7);
        if (r6 == 0) goto L_0x0155;
    L_0x010b:
        android.opengl.GLES20.glAttachShader(r6, r1);
        r1 = "attachShader";
        m27403a(r1);
        android.opengl.GLES20.glAttachShader(r6, r5);
        r1 = "attachShader";
        m27403a(r1);
        android.opengl.GLES20.glLinkProgram(r6);
        r1 = "linkProgram";
        m27403a(r1);
        r1 = new int[r3];
        r5 = 35714; // 0x8b82 float:5.0046E-41 double:1.7645E-319;
        android.opengl.GLES20.glGetProgramiv(r6, r5, r1, r4);
        r5 = "getProgramiv";
        m27403a(r5);
        r1 = r1[r4];
        if (r1 == r3) goto L_0x014d;
    L_0x0134:
        r1 = "SphericalVideoRenderer";
        r5 = "Could not link program: ";
        android.util.Log.e(r1, r5);
        r1 = "SphericalVideoRenderer";
        r5 = android.opengl.GLES20.glGetProgramInfoLog(r6);
        android.util.Log.e(r1, r5);
        android.opengl.GLES20.glDeleteProgram(r6);
        r1 = "deleteProgram";
        m27403a(r1);
        goto L_0x00d0;
    L_0x014d:
        android.opengl.GLES20.glValidateProgram(r6);
        r1 = "validateProgram";
        m27403a(r1);
    L_0x0155:
        r12.f23382q = r6;
        r1 = r12.f23382q;
        android.opengl.GLES20.glUseProgram(r1);
        r1 = "useProgram";
        m27403a(r1);
        r1 = r12.f23382q;
        r5 = "aPosition";
        r1 = android.opengl.GLES20.glGetAttribLocation(r1, r5);
        r7 = 3;
        r8 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
        r9 = 0;
        r10 = 12;
        r11 = r12.f23385t;
        r6 = r1;
        android.opengl.GLES20.glVertexAttribPointer(r6, r7, r8, r9, r10, r11);
        r5 = "vertexAttribPointer";
        m27403a(r5);
        android.opengl.GLES20.glEnableVertexAttribArray(r1);
        r1 = "enableVertexAttribArray";
        m27403a(r1);
        r1 = new int[r3];
        android.opengl.GLES20.glGenTextures(r3, r1, r4);
        r5 = "genTextures";
        m27403a(r5);
        r1 = r1[r4];
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r5, r1);
        r6 = "bindTextures";
        m27403a(r6);
        r6 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        r7 = 9729; // 0x2601 float:1.3633E-41 double:4.807E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        m27403a(r6);
        r6 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        m27403a(r6);
        r6 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        r7 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        m27403a(r6);
        r6 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r5 = "texParameteri";
        m27403a(r5);
        r5 = r12.f23382q;
        r6 = "uVMat";
        r5 = android.opengl.GLES20.glGetUniformLocation(r5, r6);
        r12.f23383r = r5;
        r5 = 9;
        r5 = new float[r5];
        r5 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216};
        r6 = r12.f23383r;
        android.opengl.GLES20.glUniformMatrix3fv(r6, r3, r4, r5, r4);
        r5 = r12.f23382q;
        if (r5 == 0) goto L_0x01e2;
    L_0x01e0:
        r5 = 1;
        goto L_0x01e3;
    L_0x01e2:
        r5 = 0;
    L_0x01e3:
        if (r0 == 0) goto L_0x02c1;
    L_0x01e5:
        if (r5 != 0) goto L_0x01e9;
    L_0x01e7:
        goto L_0x02c1;
    L_0x01e9:
        r0 = new android.graphics.SurfaceTexture;
        r0.<init>(r1);
        r12.f23380o = r0;
        r0 = r12.f23380o;
        r0.setOnFrameAvailableListener(r12);
        r0 = r12.f23386u;
        r0.countDown();
        r0 = r12.f23367b;
        r0.m19954a();
        r12.f23365A = r3;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0201:
        r0 = r12.f23366B;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        if (r0 != 0) goto L_0x026b;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0205:
        r12.m27407d();	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = r12.f23365A;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        if (r0 == 0) goto L_0x0252;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x020c:
        r0 = r12.f23379n;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r1 = r12.f23378m;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        android.opengl.GLES20.glViewport(r4, r4, r0, r1);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = "viewport";	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        m27403a(r0);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = r12.f23382q;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r1 = "uFOVx";	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r1 = r12.f23382q;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = "uFOVy";	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r1 = android.opengl.GLES20.glGetUniformLocation(r1, r3);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = r12.f23379n;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r5 = r12.f23378m;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r6 = 1063216883; // 0x3f5f66f3 float:0.87266463 double:5.25298936E-315;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        if (r3 <= r5) goto L_0x0241;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0231:
        android.opengl.GLES20.glUniform1f(r0, r6);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = r12.f23378m;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = r0 * r6;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = r12.f23379n;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r0 = r0 / r3;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        android.opengl.GLES20.glUniform1f(r1, r0);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        goto L_0x0250;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0241:
        r3 = r12.f23379n;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = r3 * r6;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r5 = r12.f23378m;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        r3 = r3 / r5;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        android.opengl.GLES20.glUniform1f(r0, r3);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
        android.opengl.GLES20.glUniform1f(r1, r6);	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0250:
        r12.f23365A = r4;	 Catch:{ IllegalStateException -> 0x029c, Throwable -> 0x027d }
    L_0x0252:
        r0 = r12.f23387v;	 Catch:{ InterruptedException -> 0x0201 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0201 }
        r1 = r12.f23366B;	 Catch:{ all -> 0x0268 }
        if (r1 != 0) goto L_0x0266;	 Catch:{ all -> 0x0268 }
    L_0x0259:
        r1 = r12.f23365A;	 Catch:{ all -> 0x0268 }
        if (r1 != 0) goto L_0x0266;	 Catch:{ all -> 0x0268 }
    L_0x025d:
        r1 = r12.f23384s;	 Catch:{ all -> 0x0268 }
        if (r1 != 0) goto L_0x0266;	 Catch:{ all -> 0x0268 }
    L_0x0261:
        r1 = r12.f23387v;	 Catch:{ all -> 0x0268 }
        r1.wait();	 Catch:{ all -> 0x0268 }
    L_0x0266:
        monitor-exit(r0);	 Catch:{ all -> 0x0268 }
        goto L_0x0201;	 Catch:{ all -> 0x0268 }
    L_0x0268:
        r1 = move-exception;	 Catch:{ all -> 0x0268 }
        monitor-exit(r0);	 Catch:{ all -> 0x0268 }
        throw r1;	 Catch:{ InterruptedException -> 0x0201 }
    L_0x026b:
        r0 = r12.f23367b;
        r0.m19957b();
        r0 = r12.f23380o;
        r0.setOnFrameAvailableListener(r2);
        r12.f23380o = r2;
        r12.m27408e();
        return;
    L_0x027b:
        r0 = move-exception;
        goto L_0x02b1;
    L_0x027d:
        r0 = move-exception;
        r1 = "SphericalVideoProcessor died.";	 Catch:{ all -> 0x027b }
        com.google.android.gms.internal.hx.m19912b(r1, r0);	 Catch:{ all -> 0x027b }
        r1 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x027b }
        r3 = "SphericalVideoProcessor.run.2";	 Catch:{ all -> 0x027b }
        r1.m27296a(r0, r3);	 Catch:{ all -> 0x027b }
        r0 = r12.f23367b;
        r0.m19957b();
        r0 = r12.f23380o;
        r0.setOnFrameAvailableListener(r2);
        r12.f23380o = r2;
        r12.m27408e();
        return;
    L_0x029c:
        r0 = "SphericalVideoProcessor halted unexpectedly.";	 Catch:{ all -> 0x027b }
        com.google.android.gms.internal.hx.m19916e(r0);	 Catch:{ all -> 0x027b }
        r0 = r12.f23367b;
        r0.m19957b();
        r0 = r12.f23380o;
        r0.setOnFrameAvailableListener(r2);
        r12.f23380o = r2;
        r12.m27408e();
        return;
    L_0x02b1:
        r1 = r12.f23367b;
        r1.m19957b();
        r1 = r12.f23380o;
        r1.setOnFrameAvailableListener(r2);
        r12.f23380o = r2;
        r12.m27408e();
        throw r0;
    L_0x02c1:
        r0 = r12.f23388w;
        r0 = r0.eglGetError();
        r0 = android.opengl.GLUtils.getEGLErrorString(r0);
        r1 = "EGL initialization failed: ";
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x02dc;
    L_0x02d7:
        r0 = r1.concat(r0);
        goto L_0x02e1;
    L_0x02dc:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x02e1:
        com.google.android.gms.internal.hx.m19913c(r0);
        r1 = com.google.android.gms.ads.internal.ar.i();
        r2 = new java.lang.Throwable;
        r2.<init>(r0);
        r0 = "SphericalVideoProcessor.run.1";
        r1.m27296a(r2, r0);
        r12.m27408e();
        r0 = r12.f23386u;
        r0.countDown();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.kb.run():void");
    }
}
