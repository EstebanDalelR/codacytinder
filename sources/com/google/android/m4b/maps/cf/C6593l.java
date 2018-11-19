package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.cf.l */
public final class C6593l extends C5122u {
    /* renamed from: a */
    private ByteBuffer f24726a;
    /* renamed from: b */
    private int f24727b;
    /* renamed from: c */
    private int f24728c;
    /* renamed from: d */
    private final ShortBuffer f24729d;
    /* renamed from: e */
    private final int f24730e;
    /* renamed from: f */
    private int[] f24731f;
    /* renamed from: g */
    private int[] f24732g;

    /* renamed from: a */
    public final boolean mo5294a(C5111g c5111g, C5107a c5107a) {
        c5111g = super.mo5294a(c5111g, c5107a);
        if (c5111g != null) {
            if (c5107a.f18965d != null) {
                GLES20.glGenBuffers(1, this.f24731f, 0);
                GLES20.glBindBuffer(34962, this.f24731f[0]);
                this.f24726a.position(0);
                GLES20.glBufferData(34962, this.f24727b * this.f24728c, this.f24726a, 35044);
                GLES20.glBindBuffer(34962, 0);
                C5111g.m22796a("InterleavedVertexData", "glBindBuffers");
                if (this.f24729d != null) {
                    GLES20.glGenBuffers(1, this.f24732g, 0);
                    GLES20.glBindBuffer(34963, this.f24732g[0]);
                    this.f24729d.position(0);
                    GLES20.glBufferData(34963, this.f24730e * 2, this.f24729d, 35044);
                    GLES20.glBindBuffer(34963, 0);
                    C5111g.m22796a("InterleavedVertexData", "glBindBuffers");
                }
            } else {
                GLES20.glDeleteBuffers(1, this.f24731f, 0);
                this.f24731f[0] = null;
                if (this.f24729d != null) {
                    GLES20.glDeleteBuffers(1, this.f24732g, 0);
                    this.f24732g[0] = null;
                }
            }
        }
        return c5111g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6593l)) {
            return false;
        }
        C6593l c6593l = (C6593l) obj;
        if (this.f24731f[0] == c6593l.f24731f[0] && this.f24732g[0] == c6593l.f24732g[0]) {
            return true;
        }
        return false;
    }
}
