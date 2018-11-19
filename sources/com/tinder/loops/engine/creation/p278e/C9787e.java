package com.tinder.loops.engine.creation.p278e;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.loops.engine.common.opengl.C9772b;
import com.tinder.loops.engine.common.opengl.C9773c;
import com.tinder.loops.engine.creation.p277d.C9781a;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.p260i.C9706a;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.collections.C19282g;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/loops/engine/creation/opengl/InputTextureRenderer;", "", "()V", "cropRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "hasAllocatedTextureMemory", "", "renderContext", "Lcom/tinder/loops/engine/creation/opengl/InputTextureRenderer$InputRenderContext;", "createRenderContext", "vertexSource", "", "fragmentSource", "initialize", "", "release", "renderBitmap", "bitmap", "Landroid/graphics/Bitmap;", "renderTexture", "textureHandle", "", "textureResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "setupTexture", "updateTextureContentsFromBitmap", "InputRenderContext", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.e.e */
public final class C9787e {
    /* renamed from: a */
    private C9786a f32446a;
    /* renamed from: b */
    private boolean f32447b;
    /* renamed from: c */
    private C9781a f32448c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/tinder/loops/engine/creation/opengl/InputTextureRenderer$InputRenderContext;", "", "programHandle", "", "texSamplerHandle", "texCoordHandle", "posCoordHandle", "texVertices", "Ljava/nio/FloatBuffer;", "posVertices", "textureHandle", "(IIIILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;I)V", "getPosCoordHandle", "()I", "getPosVertices", "()Ljava/nio/FloatBuffer;", "getProgramHandle", "getTexCoordHandle", "getTexSamplerHandle", "getTexVertices", "getTextureHandle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.creation.e.e$a */
    private static final class C9786a {
        /* renamed from: a */
        private final int f32439a;
        /* renamed from: b */
        private final int f32440b;
        /* renamed from: c */
        private final int f32441c;
        /* renamed from: d */
        private final int f32442d;
        @NotNull
        /* renamed from: e */
        private final FloatBuffer f32443e;
        @NotNull
        /* renamed from: f */
        private final FloatBuffer f32444f;
        /* renamed from: g */
        private final int f32445g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9786a) {
                C9786a c9786a = (C9786a) obj;
                if ((this.f32439a == c9786a.f32439a ? 1 : null) != null) {
                    if ((this.f32440b == c9786a.f32440b ? 1 : null) != null) {
                        if ((this.f32441c == c9786a.f32441c ? 1 : null) != null) {
                            if ((this.f32442d == c9786a.f32442d ? 1 : null) != null && C2668g.a(this.f32443e, c9786a.f32443e) && C2668g.a(this.f32444f, c9786a.f32444f)) {
                                if ((this.f32445g == c9786a.f32445g ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((((((this.f32439a * 31) + this.f32440b) * 31) + this.f32441c) * 31) + this.f32442d) * 31;
            FloatBuffer floatBuffer = this.f32443e;
            int i2 = 0;
            i = (i + (floatBuffer != null ? floatBuffer.hashCode() : 0)) * 31;
            floatBuffer = this.f32444f;
            if (floatBuffer != null) {
                i2 = floatBuffer.hashCode();
            }
            return ((i + i2) * 31) + this.f32445g;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("InputRenderContext(programHandle=");
            stringBuilder.append(this.f32439a);
            stringBuilder.append(", texSamplerHandle=");
            stringBuilder.append(this.f32440b);
            stringBuilder.append(", texCoordHandle=");
            stringBuilder.append(this.f32441c);
            stringBuilder.append(", posCoordHandle=");
            stringBuilder.append(this.f32442d);
            stringBuilder.append(", texVertices=");
            stringBuilder.append(this.f32443e);
            stringBuilder.append(", posVertices=");
            stringBuilder.append(this.f32444f);
            stringBuilder.append(", textureHandle=");
            stringBuilder.append(this.f32445g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9786a(int i, int i2, int i3, int i4, @NotNull FloatBuffer floatBuffer, @NotNull FloatBuffer floatBuffer2, int i5) {
            C2668g.b(floatBuffer, "texVertices");
            C2668g.b(floatBuffer2, "posVertices");
            this.f32439a = i;
            this.f32440b = i2;
            this.f32441c = i3;
            this.f32442d = i4;
            this.f32443e = floatBuffer;
            this.f32444f = floatBuffer2;
            this.f32445g = i5;
        }

        /* renamed from: a */
        public final int m40358a() {
            return this.f32439a;
        }

        /* renamed from: b */
        public final int m40359b() {
            return this.f32440b;
        }

        /* renamed from: c */
        public final int m40360c() {
            return this.f32441c;
        }

        /* renamed from: d */
        public final int m40361d() {
            return this.f32442d;
        }

        @NotNull
        /* renamed from: e */
        public final FloatBuffer m40362e() {
            return this.f32443e;
        }

        @NotNull
        /* renamed from: f */
        public final FloatBuffer m40363f() {
            return this.f32444f;
        }

        /* renamed from: g */
        public final int m40364g() {
            return this.f32445g;
        }
    }

    /* renamed from: a */
    public final void m40370a(@NotNull Bitmap bitmap) {
        C2668g.b(bitmap, "bitmap");
        C9786a c9786a = this.f32446a;
        if (c9786a == null) {
            C2668g.b("renderContext");
        }
        GLES20.glBindTexture(3553, c9786a.m40364g());
        m40368b(bitmap);
        C9772b.m40324a("texImage2D");
        C9797e c9797e = new C9797e(bitmap.getWidth(), bitmap.getHeight());
        bitmap = this.f32448c;
        if (bitmap == null) {
            C2668g.b("cropRectangle");
        }
        C9797e a = bitmap.m40339a(c9797e);
        c9786a = this.f32446a;
        if (c9786a == null) {
            C2668g.b("renderContext");
        }
        m40366a(c9786a.m40364g(), a);
    }

    /* renamed from: a */
    public final void m40369a() {
        C9786a c9786a = this.f32446a;
        if (c9786a == null) {
            C2668g.b("renderContext");
        }
        GLES20.glDeleteTextures(1, C19282g.a(new Integer[]{Integer.valueOf(c9786a.m40364g())}), 0);
        GLES20.glDeleteProgram(c9786a.m40358a());
        this.f32447b = false;
    }

    /* renamed from: a */
    public final void m40371a(@NotNull C9781a c9781a) {
        C2668g.b(c9781a, "cropRectangle");
        this.f32448c = c9781a;
        this.f32446a = m40365a("\n        attribute vec4 a_position;\n        attribute vec2 a_texcoord;\n        varying vec2 v_texcoord;\n        void main() {\n          gl_Position = a_position;\n          v_texcoord = a_texcoord;\n        }\n        ", "\n        precision mediump float;\n        uniform sampler2D tex_sampler;\n        varying vec2 v_texcoord;\n        void main() {\n          gl_FragColor = texture2D(tex_sampler, v_texcoord);\n        }\n        ");
        m40367b();
    }

    /* renamed from: b */
    private final void m40368b(Bitmap bitmap) {
        if (this.f32447b) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            return;
        }
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        this.f32447b = true;
    }

    /* renamed from: a */
    private final void m40366a(int i, C9797e c9797e) {
        C9786a c9786a = this.f32446a;
        if (c9786a == null) {
            C2668g.b("renderContext");
        }
        GLES20.glUseProgram(c9786a.m40358a());
        GLES20.glViewport(0, 0, c9797e.m40389a(), c9797e.m40390b());
        GLES20.glDisable(3042);
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        int c = c9797e.m40360c();
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        GLES20.glVertexAttribPointer(c, 2, 5126, false, 0, c9797e.m40362e());
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        GLES20.glEnableVertexAttribArray(c9797e.m40360c());
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        c = c9797e.m40361d();
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        GLES20.glVertexAttribPointer(c, 2, 5126, false, 0, c9797e.m40363f());
        c9797e = this.f32446a;
        if (c9797e == null) {
            C2668g.b("renderContext");
        }
        GLES20.glEnableVertexAttribArray(c9797e.m40361d());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        i = this.f32446a;
        if (i == 0) {
            C2668g.b("renderContext");
        }
        GLES20.glUniform1i(i.m40359b(), 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: a */
    private final C9786a m40365a(String str, String str2) {
        int a = C9773c.m40326a(str, str2);
        C9706a.m40168a(a != 0, (Exception) new LoopsEngineCreationException("Error creating open gl program"));
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, null);
        int b = C19282g.b(iArr);
        int glGetUniformLocation = GLES20.glGetUniformLocation(a, "tex_sampler");
        int glGetAttribLocation = GLES20.glGetAttribLocation(a, "a_texcoord");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(a, "a_position");
        str2 = this.f32448c;
        if (str2 == null) {
            C2668g.b("cropRectangle");
        }
        return new C9786a(a, glGetUniformLocation, glGetAttribLocation, glGetAttribLocation2, C9773c.m40327a(str2.m40340a()), C9773c.m40327a(C9788f.f32449a), b);
    }

    /* renamed from: b */
    private final void m40367b() {
        C9786a c9786a = this.f32446a;
        if (c9786a == null) {
            C2668g.b("renderContext");
        }
        GLES20.glBindTexture(3553, c9786a.m40364g());
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }
}
