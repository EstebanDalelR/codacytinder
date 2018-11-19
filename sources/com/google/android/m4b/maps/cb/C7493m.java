package com.google.android.m4b.maps.cb;

import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.ca.C5052d;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.cb.m */
public class C7493m extends C6580k {
    /* renamed from: h */
    private final int[] f27658h;
    /* renamed from: i */
    private volatile long f27659i;

    /* renamed from: com.google.android.m4b.maps.cb.m$a */
    public static final class C8080a extends C7493m {
        public C8080a(int[] iArr) {
            super(4, true);
            this.b = iArr;
            this.c = 4;
            this.d = this.c;
            this.f = 12;
        }

        /* renamed from: a */
        public final void mo5257a(af afVar, int i) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: a */
        public final void mo5252a(float f, float f2, float f3) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: a */
        public final void mo7120a(C5052d c5052d) {
            throw new UnsupportedOperationException("Immutable");
        }
    }

    public C7493m(int i) {
        super(i);
        this.f27658h = new int[1];
        this.f27659i = -1;
    }

    public C7493m(int i, boolean z) {
        super(i, true);
        this.f27658h = new int[1];
        this.f27659i = -1;
    }

    /* renamed from: a */
    public void mo7120a(C5052d c5052d) {
        super.mo7120a(c5052d);
        this.f27658h[0] = null;
    }

    /* renamed from: b */
    public final void mo7121b(C5052d c5052d) {
        if (this.f27658h[0] != 0) {
            C5052d b = C5052d.m22596b(this.f27659i);
            if (b == c5052d && b != null) {
                ((GL11) b.m22635x()).glDeleteBuffers(1, this.f27658h, 0);
            }
            this.f27658h[0] = 0;
            this.a = 0;
        }
        this.f27659i = C5052d.m22594a(c5052d);
    }

    /* renamed from: e */
    protected final void mo7124e(C5052d c5052d) {
        if (c5052d.m22602F()) {
            int i = this.d * 3;
            this.e = c5052d.m22606J().m22695c();
            if (this.g == null) {
                this.e.put(this.b, 0, i);
            } else {
                m29351b();
                this.g.m28317a(this.e);
            }
            this.e.limit(i);
            this.e.position(0);
            if (C4743b.f17387a == null) {
                if (this.g != null) {
                    this.g.m21159c();
                    this.g = null;
                }
                this.b = null;
            }
            return;
        }
        super.mo7124e(c5052d);
    }

    /* renamed from: d */
    public final void mo7123d(C5052d c5052d) {
        this.f27659i = C5052d.m22594a(c5052d);
        if (c5052d.m22602F()) {
            GL11 gl11 = (GL11) c5052d.m22635x();
            if (this.f27658h[0] == 0) {
                if (this.e == null) {
                    mo7124e(c5052d);
                }
                if (this.e.limit() != null) {
                    gl11.glGenBuffers(1, this.f27658h, 0);
                    gl11.glBindBuffer(34962, this.f27658h[0]);
                    this.a = this.e.limit() * 4;
                    gl11.glBufferData(34962, this.a, this.e, 35044);
                    this.e = null;
                } else {
                    return;
                }
            }
            gl11.glBindBuffer(34962, this.f27658h[0]);
            gl11.glVertexPointer(3, 5132, 0, 0);
            gl11.glBindBuffer(34962, 0);
            return;
        }
        super.mo7123d(c5052d);
    }

    /* renamed from: d */
    public final int mo7122d() {
        if (this.g != null) {
            return 56 + (this.g.m21157b() * 4);
        }
        if (this.b != null) {
            return 56 + ((this.b.length * 4) + 16);
        }
        return 56;
    }
}
