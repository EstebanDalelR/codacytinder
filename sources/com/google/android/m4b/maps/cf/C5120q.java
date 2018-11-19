package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.cf.q */
public class C5120q {
    /* renamed from: a */
    private String f19020a;
    /* renamed from: b */
    private String f19021b;
    /* renamed from: c */
    private int f19022c;
    /* renamed from: d */
    private int f19023d;
    /* renamed from: e */
    private boolean f19024e;

    /* renamed from: a */
    protected void m22817a(int i) {
        this.f19023d = C5120q.m22815a(i, "uMVPMatrix");
    }

    /* renamed from: a */
    protected static int m22815a(int i, String str) {
        i = GLES20.glGetUniformLocation(i, str);
        if (i == -1) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append("Unable to get ");
            stringBuilder.append(str);
            stringBuilder.append(" handle");
            throw new IllegalStateException(stringBuilder.toString());
        }
        C5111g.m22796a("ShaderProgram", "glGetUniformLocation");
        return i;
    }

    /* renamed from: a */
    public final boolean m22818a(C5107a c5107a) {
        if (c5107a.f18965d == this.f19024e && !c5107a.f18966e) {
            return false;
        }
        if (!c5107a.f18965d && !c5107a.f18966e) {
            return false;
        }
        this.f19024e = c5107a.f18965d;
        if (this.f19024e) {
            int glCreateProgram;
            if (c5107a.f18966e != null) {
                this.f19022c = 0;
            }
            C5571j.m24303b(this.f19022c == null ? true : null, "Attempt to overwrite existing shader program: %s", Integer.valueOf(this.f19022c));
            c5107a = this.f19020a;
            String str = this.f19021b;
            c5107a = C5120q.m22816b(35633, c5107a);
            if (c5107a != null) {
                int b = C5120q.m22816b(35632, str);
                if (b != 0) {
                    glCreateProgram = GLES20.glCreateProgram();
                    if (glCreateProgram != 0) {
                        GLES20.glAttachShader(glCreateProgram, c5107a);
                        C5111g.m22796a("ShaderState", "glAttachShader");
                        GLES20.glAttachShader(glCreateProgram, b);
                        C5111g.m22796a("ShaderState", "glAttachShader");
                        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
                        C5111g.m22796a("ShaderProgram", "bindAttribute aPosition");
                        GLES20.glBindAttribLocation(glCreateProgram, 1, "aNormal");
                        C5111g.m22796a("ShaderProgram", "bindAttribute aTextureCoord");
                        GLES20.glBindAttribLocation(glCreateProgram, 2, "aColor");
                        C5111g.m22796a("ShaderProgram", "bindAttribute aColor");
                        GLES20.glBindAttribLocation(glCreateProgram, 4, "aTextureCoord");
                        C5111g.m22796a("ShaderProgram", "bindAttribute aTextureCoord");
                        GLES20.glLinkProgram(glCreateProgram);
                        c5107a = new int[1];
                        GLES20.glGetProgramiv(glCreateProgram, 35714, c5107a, 0);
                        if (c5107a[0] != 1) {
                            if (C4728u.m21050a("ShaderProgram", 6) != null) {
                                Log.e("ShaderProgram", "Could not link program: ");
                            }
                            if (C4728u.m21050a("ShaderProgram", 6) != null) {
                                Log.e("ShaderProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
                            }
                            GLES20.glDeleteProgram(glCreateProgram);
                        }
                    }
                    this.f19022c = glCreateProgram;
                    GLES20.glUseProgram(this.f19022c);
                    m22817a(this.f19022c);
                    GLES20.glUseProgram(0);
                }
            }
            glCreateProgram = 0;
            this.f19022c = glCreateProgram;
            GLES20.glUseProgram(this.f19022c);
            m22817a(this.f19022c);
            GLES20.glUseProgram(0);
        } else {
            if (c5107a.f18966e == null) {
                GLES20.glDeleteProgram(this.f19022c);
            }
            this.f19022c = 0;
        }
        return true;
    }

    /* renamed from: b */
    private static int m22816b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        str = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, str, 0);
        if (str[0] != null) {
            return glCreateShader;
        }
        if (C4728u.m21050a("ShaderProgram", 6) != null) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Could not compile shader ");
            stringBuilder.append(i);
            stringBuilder.append(":");
            Log.e("ShaderProgram", stringBuilder.toString());
        }
        if (C4728u.m21050a("ShaderProgram", 6) != 0) {
            Log.e("ShaderProgram", GLES20.glGetShaderInfoLog(glCreateShader));
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
