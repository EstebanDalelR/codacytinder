package com.google.android.m4b.maps.bv;

/* renamed from: com.google.android.m4b.maps.bv.g */
public final class C4927g {
    /* renamed from: a */
    private boolean f18175a;
    /* renamed from: b */
    private int f18176b;
    /* renamed from: c */
    private boolean f18177c;
    /* renamed from: d */
    private C6552x f18178d;

    public C4927g() {
        m22083b();
    }

    /* renamed from: a */
    public final void m22085a(C6552x c6552x) {
        this.f18178d = c6552x;
        m22083b();
    }

    /* renamed from: a */
    public final boolean m22086a() {
        return this.f18175a;
    }

    /* renamed from: a */
    public final boolean m22087a(float f, float f2) {
        if (!m22084c()) {
            return false;
        }
        f = this.f18178d.m28963a((int) f, (int) f2);
        if (f != Float.NaN) {
            this.f18175a = true;
            this.f18176b = f;
            this.f18178d.m28976b(this.f18176b);
            this.f18177c = true;
        } else {
            m22083b();
        }
        return this.f18175a;
    }

    /* renamed from: b */
    public final boolean m22088b(float f, float f2) {
        if (m22084c() && this.f18175a) {
            f = this.f18178d.m28963a((int) f, (int) f2) == this.f18176b ? Float.MIN_VALUE : 0.0f;
            if (f != this.f18177c) {
                this.f18177c = f;
                if (f != null) {
                    this.f18178d.m28976b(this.f18176b);
                } else {
                    this.f18178d.m28976b((int) Float.NaN);
                }
            }
        }
        return this.f18175a;
    }

    /* renamed from: c */
    public final int m22089c(float f, float f2) {
        if (m22084c() && this.f18175a) {
            if (this.f18177c) {
                this.f18178d.m28976b(-1);
            }
            f = this.f18178d.m28963a((int) f, (int) f2);
            if (f == this.f18176b) {
                m22083b();
                return f;
            }
        }
        m22083b();
        return -1;
    }

    /* renamed from: b */
    private void m22083b() {
        this.f18175a = false;
        this.f18176b = -1;
        this.f18177c = false;
    }

    /* renamed from: c */
    private boolean m22084c() {
        return this.f18178d != null;
    }
}
