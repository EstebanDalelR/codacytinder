package com.google.android.m4b.maps.cu;

/* renamed from: com.google.android.m4b.maps.cu.g */
public class C5306g {
    /* renamed from: n */
    protected volatile int f19696n = -1;

    /* renamed from: a */
    public void mo5392a(C5301a c5301a) {
    }

    /* renamed from: b */
    protected int mo5393b() {
        return 0;
    }

    public /* synthetic */ Object clone() {
        return mo5395d();
    }

    /* renamed from: e */
    public final int m23535e() {
        if (this.f19696n < 0) {
            m23536f();
        }
        return this.f19696n;
    }

    /* renamed from: f */
    public final int m23536f() {
        int b = mo5393b();
        this.f19696n = b;
        return b;
    }

    /* renamed from: a */
    public static final byte[] m23531a(C5306g c5306g) {
        byte[] bArr = new byte[c5306g.m23536f()];
        try {
            C5301a a = C5301a.m23490a(bArr, 0, bArr.length);
            c5306g.mo5392a(a);
            a.m23505a();
            return bArr;
        } catch (C5306g c5306g2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", c5306g2);
        }
    }

    public String toString() {
        return C5307h.m23537a(this);
    }

    /* renamed from: d */
    public C5306g mo5395d() {
        return (C5306g) super.clone();
    }
}
