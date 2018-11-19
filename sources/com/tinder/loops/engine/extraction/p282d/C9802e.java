package com.tinder.loops.engine.extraction.p282d;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.view.Surface;
import com.google.android.gms.gcm.Task;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.loops.engine.common.opengl.C9772b;
import com.tinder.loops.engine.common.opengl.C9773c;
import com.tinder.p260i.C9706a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.collections.C19282g;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\u0006\u0010\u001c\u001a\u00020\fJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0006\u0010\u001e\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/loops/engine/extraction/opengl/OutputTextureRenderer;", "", "()V", "mvpMatrix", "", "renderContext", "Lcom/tinder/loops/engine/extraction/opengl/OutputTextureRenderer$OutputRenderContext;", "surfaceTextureMatrix", "triangleVertices", "Ljava/nio/FloatBuffer;", "triangleVerticesData", "checkLocation", "", "location", "", "label", "", "createRenderContext", "createSurface", "Landroid/view/Surface;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "createSurfaceTexture", "drawFrame", "rotationDegrees", "initializeTextureRenderer", "invertSurfaceTextureMatrixHorizontally", "invertSurfaceTextureMatrixVertically", "release", "rotateSurfaceTexture", "setup", "OutputRenderContext", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.d.e */
public final class C9802e {
    /* renamed from: a */
    private final float[] f32494a = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    /* renamed from: b */
    private final float[] f32495b = new float[16];
    /* renamed from: c */
    private final float[] f32496c = new float[16];
    /* renamed from: d */
    private FloatBuffer f32497d;
    /* renamed from: e */
    private C9801a f32498e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/tinder/loops/engine/extraction/opengl/OutputTextureRenderer$OutputRenderContext;", "", "programHandle", "", "uMVPMatrixHandle", "uSTMatrixHandle", "positionHandle", "textureCoordHandle", "textureHandle", "(IIIIII)V", "getPositionHandle", "()I", "getProgramHandle", "getTextureCoordHandle", "getTextureHandle", "getUMVPMatrixHandle", "getUSTMatrixHandle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.d.e$a */
    private static final class C9801a {
        /* renamed from: a */
        private final int f32488a;
        /* renamed from: b */
        private final int f32489b;
        /* renamed from: c */
        private final int f32490c;
        /* renamed from: d */
        private final int f32491d;
        /* renamed from: e */
        private final int f32492e;
        /* renamed from: f */
        private final int f32493f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9801a) {
                C9801a c9801a = (C9801a) obj;
                if ((this.f32488a == c9801a.f32488a ? 1 : null) != null) {
                    if ((this.f32489b == c9801a.f32489b ? 1 : null) != null) {
                        if ((this.f32490c == c9801a.f32490c ? 1 : null) != null) {
                            if ((this.f32491d == c9801a.f32491d ? 1 : null) != null) {
                                if ((this.f32492e == c9801a.f32492e ? 1 : null) != null) {
                                    if ((this.f32493f == c9801a.f32493f ? 1 : null) != null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f32488a * 31) + this.f32489b) * 31) + this.f32490c) * 31) + this.f32491d) * 31) + this.f32492e) * 31) + this.f32493f;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OutputRenderContext(programHandle=");
            stringBuilder.append(this.f32488a);
            stringBuilder.append(", uMVPMatrixHandle=");
            stringBuilder.append(this.f32489b);
            stringBuilder.append(", uSTMatrixHandle=");
            stringBuilder.append(this.f32490c);
            stringBuilder.append(", positionHandle=");
            stringBuilder.append(this.f32491d);
            stringBuilder.append(", textureCoordHandle=");
            stringBuilder.append(this.f32492e);
            stringBuilder.append(", textureHandle=");
            stringBuilder.append(this.f32493f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9801a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f32488a = i;
            this.f32489b = i2;
            this.f32490c = i3;
            this.f32491d = i4;
            this.f32492e = i5;
            this.f32493f = i6;
        }

        /* renamed from: a */
        public final int m40407a() {
            return this.f32488a;
        }

        /* renamed from: b */
        public final int m40408b() {
            return this.f32489b;
        }

        /* renamed from: c */
        public final int m40409c() {
            return this.f32490c;
        }

        /* renamed from: d */
        public final int m40410d() {
            return this.f32491d;
        }

        /* renamed from: e */
        public final int m40411e() {
            return this.f32492e;
        }

        /* renamed from: f */
        public final int m40412f() {
            return this.f32493f;
        }
    }

    /* renamed from: a */
    public final void m40421a() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(this.f32494a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C2668g.a(asFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
        this.f32497d = asFloatBuffer;
        asFloatBuffer = this.f32497d;
        if (asFloatBuffer == null) {
            C2668g.b("triangleVertices");
        }
        asFloatBuffer.put(this.f32494a).position(0);
        Matrix.setIdentityM(this.f32496c, 0);
        this.f32498e = m40418f();
    }

    @NotNull
    /* renamed from: b */
    public final SurfaceTexture m40423b() {
        C9801a c9801a = this.f32498e;
        if (c9801a == null) {
            C2668g.b("renderContext");
        }
        return new SurfaceTexture(c9801a.m40412f());
    }

    @NotNull
    /* renamed from: a */
    public final Surface m40420a(@NotNull SurfaceTexture surfaceTexture) {
        C2668g.b(surfaceTexture, "surfaceTexture");
        return new Surface(surfaceTexture);
    }

    /* renamed from: c */
    public final void m40424c() {
        C9801a c9801a = this.f32498e;
        if (c9801a == null) {
            C2668g.b("renderContext");
        }
        GLES20.glDeleteTextures(1, C19282g.a(new Integer[]{Integer.valueOf(c9801a.m40412f())}), 0);
        GLES20.glDeleteProgram(c9801a.m40407a());
    }

    /* renamed from: a */
    public final void m40422a(@NotNull SurfaceTexture surfaceTexture, int i) {
        C2668g.b(surfaceTexture, "surfaceTexture");
        C9772b.m40324a("onDrawFrame start");
        m40415b(surfaceTexture, i);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glUseProgram(surfaceTexture.m40407a());
        C9772b.m40324a("glUseProgram");
        GLES20.glActiveTexture(33984);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glBindTexture(36197, surfaceTexture.m40412f());
        surfaceTexture = this.f32497d;
        if (surfaceTexture == null) {
            C2668g.b("triangleVertices");
        }
        surfaceTexture.position(0);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        int d = surfaceTexture.m40410d();
        surfaceTexture = this.f32497d;
        if (surfaceTexture == null) {
            C2668g.b("triangleVertices");
        }
        GLES20.glVertexAttribPointer(d, 3, 5126, false, 20, (Buffer) surfaceTexture);
        C9772b.m40324a("glVertexAttribPointer maPosition");
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glEnableVertexAttribArray(surfaceTexture.m40410d());
        C9772b.m40324a("glEnableVertexAttribArray positionHandle");
        surfaceTexture = this.f32497d;
        if (surfaceTexture == null) {
            C2668g.b("triangleVertices");
        }
        surfaceTexture.position(3);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        d = surfaceTexture.m40411e();
        surfaceTexture = this.f32497d;
        if (surfaceTexture == null) {
            C2668g.b("triangleVertices");
        }
        GLES20.glVertexAttribPointer(d, 2, 5126, false, 20, (Buffer) surfaceTexture);
        C9772b.m40324a("glVertexAttribPointer textureCoordHandle");
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glEnableVertexAttribArray(surfaceTexture.m40411e());
        C9772b.m40324a("glEnableVertexAttribArray textureCoordHandle");
        Matrix.setIdentityM(this.f32495b, 0);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glUniformMatrix4fv(surfaceTexture.m40408b(), 1, false, this.f32495b, 0);
        surfaceTexture = this.f32498e;
        if (surfaceTexture == null) {
            C2668g.b("renderContext");
        }
        GLES20.glUniformMatrix4fv(surfaceTexture.m40409c(), 1, false, this.f32496c, 0);
        GLES20.glDrawArrays(5, 0, 4);
        C9772b.m40324a("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
    }

    /* renamed from: b */
    private final void m40415b(SurfaceTexture surfaceTexture, int i) {
        surfaceTexture.getTransformMatrix(this.f32496c);
        if (VERSION.SDK_INT == 19) {
            m40413a(i);
        }
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return;
                    }
                }
            }
            m40417e();
            return;
        }
        m40416d();
    }

    /* renamed from: a */
    private final void m40413a(int i) {
        Matrix.rotateM(this.f32496c, 0, (float) i, 0.0f, 0.0f, 1.0f);
        if (i == 90) {
            Matrix.translateM(this.f32496c, 0, 0.0f, -1.0f, 0.0f);
        } else if (i == 180) {
            Matrix.translateM(this.f32496c, 0, -1.0f, -1.0f, 0.0f);
        } else if (i == 270) {
            Matrix.translateM(this.f32496c, 0, -1.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: d */
    private final void m40416d() {
        this.f32496c[5] = -this.f32496c[5];
        this.f32496c[13] = 1.0f - this.f32496c[13];
    }

    /* renamed from: e */
    private final void m40417e() {
        this.f32496c[4] = -this.f32496c[4];
        this.f32496c[12] = 1.0f - this.f32496c[12];
    }

    /* renamed from: f */
    private final C9801a m40418f() {
        C9801a g = m40419g();
        GLES20.glBindTexture(36197, g.m40412f());
        C9772b.m40324a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, (float) 9728);
        GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, (float) 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C9772b.m40324a("glTexParameter");
        return g;
    }

    /* renamed from: g */
    private final C9801a m40419g() {
        int a = C9773c.m40326a("\n        uniform mat4 uMVPMatrix;\n        uniform mat4 uSTMatrix;\n        attribute vec4 aPosition;\n        attribute vec4 aTextureCoord;\n        varying vec2 vTextureCoord;\n        void main() {\n            gl_Position = uMVPMatrix * aPosition;\n            vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        precision mediump float;\n        varying vec2 vTextureCoord;\n        uniform samplerExternalOES sTexture;\n        void main() {\n            gl_FragColor = texture2D(sTexture, vTextureCoord);\n        }\n        ");
        if (a == 0) {
            throw new RuntimeException("failed creating program");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(a, "aPosition");
        m40414a(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(a, "aTextureCoord");
        m40414a(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(a, "uMVPMatrix");
        m40414a(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(a, "uSTMatrix");
        m40414a(glGetUniformLocation2, "uSTMatrix");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        return new C9801a(a, glGetUniformLocation, glGetUniformLocation2, glGetAttribLocation, glGetAttribLocation2, C19282g.b(iArr));
    }

    /* renamed from: a */
    private final void m40414a(int i, String str) {
        boolean z = i >= 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to locate '");
        stringBuilder.append(str);
        stringBuilder.append("' in program");
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException(stringBuilder.toString()));
    }
}
