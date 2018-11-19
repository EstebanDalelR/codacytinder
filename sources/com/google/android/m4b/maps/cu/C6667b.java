package com.google.android.m4b.maps.cu;

/* renamed from: com.google.android.m4b.maps.cu.b */
public class C6667b<M extends C6667b<M>> extends C5306g {
    /* renamed from: m */
    protected C5303d f24953m;

    public /* synthetic */ Object clone() {
        return mo7021c();
    }

    /* renamed from: d */
    public /* synthetic */ C5306g mo5395d() {
        return mo7021c();
    }

    /* renamed from: b */
    protected int mo5393b() {
        if (this.f24953m == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f24953m.m23523a(); i2++) {
            i += this.f24953m.m23524a(i2).m23527a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo5392a(C5301a c5301a) {
        if (this.f24953m != null) {
            for (int i = 0; i < this.f24953m.m23523a(); i++) {
                this.f24953m.m23524a(i).m23528a(c5301a);
            }
        }
    }

    /* renamed from: c */
    public M mo7021c() {
        C6667b c6667b = (C6667b) super.mo5395d();
        C5305f.m23530a(this, c6667b);
        return c6667b;
    }
}
