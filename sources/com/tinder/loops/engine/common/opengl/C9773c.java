package com.tinder.loops.engine.common.opengl;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"createProgram", "", "vertexSource", "", "fragmentSource", "createVerticesBuffer", "Ljava/nio/FloatBuffer;", "vertices", "", "loadShader", "shaderType", "source", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.common.opengl.c */
public final class C9773c {
    /* renamed from: a */
    private static final int m40325a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("glCreateShader type=");
        stringBuilder.append(i);
        C9772b.m40324a(stringBuilder.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(58);
        C0001a.e(stringBuilder.toString(), new Object[0]);
        C0001a.e(" %s", new Object[]{GLES20.glGetShaderInfoLog(glCreateShader)});
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    public static final int m40326a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "vertexSource");
        C2668g.b(str2, "fragmentSource");
        str = C9773c.m40325a(35633, str);
        int i = 0;
        if (str == null) {
            return 0;
        }
        str2 = C9773c.m40325a(35632, str2);
        if (str2 == null) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            C0001a.e("Could not create program", new Object[0]);
        }
        GLES20.glAttachShader(glCreateProgram, str);
        C9772b.m40324a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, str2);
        C9772b.m40324a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        str2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, str2, 0);
        if (str2[0] != 1) {
            C0001a.e("Could not link program: ", new Object[0]);
            C0001a.e(GLES20.glGetProgramInfoLog(glCreateProgram), new Object[0]);
            GLES20.glDeleteProgram(glCreateProgram);
        } else {
            i = glCreateProgram;
        }
        return i;
    }

    @NotNull
    /* renamed from: a */
    public static final FloatBuffer m40327a(@NotNull float[] fArr) {
        C2668g.b(fArr, "vertices");
        if ((fArr.length == 8 ? 1 : null) == null) {
            throw new IllegalStateException("Number of vertices should be eight".toString());
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        C2668g.a(asFloatBuffer, "buffer");
        return asFloatBuffer;
    }
}
