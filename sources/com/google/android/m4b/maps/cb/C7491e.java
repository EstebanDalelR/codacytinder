package com.google.android.m4b.maps.cb;

import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.ca.C5052d;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.cb.e */
public final class C7491e extends C6577c {
    /* renamed from: f */
    private final int[] f27654f;
    /* renamed from: g */
    private volatile long f27655g;

    public C7491e(int i) {
        super(i);
        this.f27654f = new int[1];
        this.f27655g = -1;
    }

    public C7491e(int i, boolean z) {
        super(i, true);
        this.f27654f = new int[1];
        this.f27655g = -1;
    }

    /* renamed from: a */
    public final void mo7109a(C5052d c5052d) {
        super.mo7109a(c5052d);
        this.f27654f[0] = null;
    }

    /* renamed from: b */
    public final void mo7111b(C5052d c5052d) {
        if (this.f27654f[0] != 0) {
            C5052d b = C5052d.m22596b(this.f27655g);
            if (b == c5052d && b != null) {
                ((GL11) b.m22635x()).glDeleteBuffers(1, this.f27654f, 0);
            }
            this.f27654f[0] = 0;
            this.d = 0;
        }
        this.f27655g = C5052d.m22594a(c5052d);
    }

    /* renamed from: d */
    protected final void mo7113d(C5052d c5052d) {
        if (c5052d.m22602F()) {
            this.c = c5052d.m22606J().m22694b();
            if (this.e == null) {
                this.c.put(this.a, 0, this.b);
            } else {
                m29307a();
                this.e.m28320a(this.c);
            }
            this.c.limit(this.b);
            this.c.position(0);
            if (C4743b.f17387a == null) {
                if (this.e != null) {
                    this.e.m21159c();
                    this.e = null;
                }
                this.a = null;
                return;
            }
        }
        super.mo7113d(c5052d);
    }

    /* renamed from: a */
    public final void mo7110a(C5052d c5052d, int i) {
        this.f27655g = C5052d.m22594a(c5052d);
        if (c5052d.m22602F()) {
            GL11 gl11 = (GL11) c5052d.m22635x();
            if (this.f27654f[0] == 0) {
                if (this.c == null) {
                    mo7113d(c5052d);
                }
                if (this.c.limit() != null) {
                    gl11.glGenBuffers(1, this.f27654f, 0);
                    gl11.glBindBuffer(34963, this.f27654f[0]);
                    this.d = this.c.limit() * 2;
                    gl11.glBufferData(34963, this.d, this.c, 35044);
                    this.c = null;
                } else {
                    return;
                }
            }
            gl11.glBindBuffer(34963, this.f27654f[0]);
            gl11.glDrawElements(i, this.b, 5123, 0);
            gl11.glBindBuffer(34963, 0);
            return;
        }
        super.mo7110a(c5052d, i);
    }

    /* renamed from: d */
    public final int mo7112d() {
        if (this.e != null) {
            return 56 + (this.e.m21157b() * 2);
        }
        if (this.a != null) {
            return 56 + ((this.a.length * 2) + 16);
        }
        return 56;
    }
}
