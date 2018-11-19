package com.google.android.m4b.maps.cb;

import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.ca.C5052d;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.cb.i */
public class C7492i extends C6579g {
    /* renamed from: k */
    private final int[] f27656k;
    /* renamed from: l */
    private volatile long f27657l;

    /* renamed from: com.google.android.m4b.maps.cb.i$a */
    public static final class C8079a extends C7492i {
        public C8079a(int[] iArr) {
            super(4, true);
            this.b = iArr;
            this.c = 4;
            this.d = this.c;
            this.i = 8;
        }

        /* renamed from: a */
        public final void mo5254a(int i, int i2) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: a */
        public final void mo5251a(float f, float f2) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: a */
        public final void mo5260a(int[] iArr, int i, int i2) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: a */
        public final void mo7114a(C5052d c5052d) {
            throw new UnsupportedOperationException("Immutable");
        }
    }

    public C7492i(int i) {
        super(i);
        this.f27656k = new int[1];
        this.f27657l = -1;
    }

    public C7492i(int i, boolean z) {
        super(i, true);
        this.f27656k = new int[1];
        this.f27657l = -1;
    }

    private C7492i(int i, int i2, int i3) {
        super(i, 5122, i3, true);
        this.f27656k = new int[1];
        this.f27657l = -1;
    }

    /* renamed from: b */
    public static C7492i m32565b(int i, int i2) {
        return new C7492i(i, 5122, 1);
    }

    /* renamed from: a */
    public void mo7114a(C5052d c5052d) {
        super.mo7114a(c5052d);
        this.f27656k[0] = null;
    }

    /* renamed from: b */
    public final void mo7116b(C5052d c5052d) {
        if (this.f27656k[0] != 0) {
            C5052d b = C5052d.m22596b(this.f27657l);
            if (b == c5052d && b != null) {
                ((GL11) b.m22635x()).glDeleteBuffers(1, this.f27656k, 0);
            }
            this.f27656k[0] = 0;
            this.a = 0;
        }
        this.f27657l = C5052d.m22594a(c5052d);
    }

    /* renamed from: e */
    protected final void mo7119e(C5052d c5052d) {
        if (c5052d.m22602F()) {
            int i = this.d * 2;
            if (this.f == 5122) {
                this.e = c5052d.m22606J().m22694b();
                if (this.j == null) {
                    m29333a((ShortBuffer) this.e, i);
                } else {
                    m29326a();
                    this.j.m28318a((ShortBuffer) this.e, this.h);
                }
            } else {
                if (this.f != 5121) {
                    if (this.f != 5120) {
                        this.e = c5052d.m22606J().m22695c();
                        if (this.j == null) {
                            ((IntBuffer) this.e).put(this.b, 0, i);
                        } else {
                            m29326a();
                            this.j.m28317a((IntBuffer) this.e);
                        }
                    }
                }
                this.e = c5052d.m22606J().m22693a();
                if (this.j == null) {
                    m29332a((ByteBuffer) this.e, i);
                } else {
                    m29326a();
                    this.j.m28316a((ByteBuffer) this.e, this.h);
                }
            }
            this.e.limit(i);
            this.e.position(0);
            if (C4743b.f17387a == null) {
                if (this.j != null) {
                    this.j.m21159c();
                    this.j = null;
                }
                this.b = null;
            }
            return;
        }
        super.mo7119e(c5052d);
    }

    /* renamed from: d */
    public final void mo7118d(C5052d c5052d) {
        this.f27657l = C5052d.m22594a(c5052d);
        if (!c5052d.m22602F()) {
            super.mo7118d(c5052d);
        } else if (this.f27656k[0] != 0 || m32566f(c5052d)) {
            GL11 gl11 = (GL11) c5052d.m22635x();
            gl11.glBindBuffer(34962, this.f27656k[0]);
            gl11.glTexCoordPointer(2, this.f, 0, 0);
            gl11.glBindBuffer(34962, 0);
        }
    }

    /* renamed from: a */
    public final void mo7115a(C5052d c5052d, int i) {
        this.f27657l = C5052d.m22594a(c5052d);
        if (!c5052d.m22602F()) {
            super.mo7115a(c5052d, i);
        } else if (this.f27656k[0] != 0 || m32566f(c5052d)) {
            GL11 gl11 = (GL11) c5052d.m22635x();
            gl11.glBindBuffer(34962, this.f27656k[0]);
            gl11.glTexCoordPointer(2, this.f, 0, (i * 2) * this.g);
            gl11.glBindBuffer(34962, 0);
        }
    }

    /* renamed from: f */
    private boolean m32566f(C5052d c5052d) {
        if (this.e == null) {
            mo7119e(c5052d);
        }
        if (this.e.limit() == 0) {
            return false;
        }
        GL11 gl11 = (GL11) c5052d.m22635x();
        gl11.glGenBuffers(1, this.f27656k, 0);
        gl11.glBindBuffer(34962, this.f27656k[0]);
        this.a = this.e.limit() * this.g;
        gl11.glBufferData(34962, this.a, this.e, 35044);
        this.e = null;
        return true;
    }

    /* renamed from: c */
    public final int mo7117c() {
        if (this.j != null) {
            return 56 + (this.j.m21157b() * 4);
        }
        if (this.b != null) {
            return 56 + ((this.b.length * 4) + 16);
        }
        return 56;
    }
}
