package com.google.android.m4b.maps.cb;

import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.ca.C5052d;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.cb.b */
public final class C6576b extends C5062a {
    /* renamed from: f */
    private final int[] f24614f;
    /* renamed from: g */
    private volatile long f24615g;

    public C6576b(int i) {
        super(i);
        this.f24614f = new int[1];
        this.f24615g = -1;
    }

    public C6576b(int i, boolean z) {
        super(i, true);
        this.f24614f = new int[1];
        this.f24615g = -1;
    }

    /* renamed from: a */
    public final void mo5267a(C5052d c5052d) {
        if (this.f24614f[0] != 0) {
            C5052d b = C5052d.m22596b(this.f24615g);
            if (b == c5052d && b != null) {
                ((GL11) b.m22635x()).glDeleteBuffers(1, this.f24614f, 0);
            }
            this.f24614f[0] = 0;
            this.d = 0;
        }
        this.f24615g = C5052d.m22594a(c5052d);
    }

    /* renamed from: d */
    protected final void mo5270d(C5052d c5052d) {
        if (c5052d.m22602F()) {
            int i = this.b * 4;
            this.c = c5052d.m22606J().m22693a();
            m22669a(i, (boolean) C4743b.f17387a ^ 1);
            return;
        }
        super.mo5270d(c5052d);
    }

    /* renamed from: c */
    public final void mo5269c(C5052d c5052d) {
        this.f24615g = C5052d.m22594a(c5052d);
        if (c5052d.m22602F()) {
            GL11 gl11 = (GL11) c5052d.m22635x();
            if (this.f24614f[0] == 0) {
                if (this.c == null) {
                    mo5270d(c5052d);
                }
                if (this.c.limit() != null) {
                    gl11.glGenBuffers(1, this.f24614f, 0);
                    gl11.glBindBuffer(34962, this.f24614f[0]);
                    this.d = this.c.limit();
                    gl11.glBufferData(34962, this.d, this.c, 35044);
                    this.c = null;
                } else {
                    return;
                }
            }
            gl11.glBindBuffer(34962, this.f24614f[0]);
            gl11.glColorPointer(4, 5121, 0, 0);
            gl11.glBindBuffer(34962, 0);
            return;
        }
        super.mo5269c(c5052d);
    }

    /* renamed from: b */
    public final int mo5268b() {
        if (this.e != null) {
            return 56 + this.e.m21157b();
        }
        if (this.a != null) {
            return 56 + (this.a.length + 16);
        }
        return 56;
    }
}
