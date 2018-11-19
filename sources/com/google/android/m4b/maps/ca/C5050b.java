package com.google.android.m4b.maps.ca;

import com.google.android.m4b.maps.ca.C5049a.C5048a;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C7492i;

/* renamed from: com.google.android.m4b.maps.ca.b */
public final class C5050b {
    /* renamed from: a */
    private C7490k f18667a;
    /* renamed from: b */
    private final C6579g f18668b;
    /* renamed from: c */
    private final C5048a f18669c = new C5048a();
    /* renamed from: d */
    private final C5049a f18670d;

    public C5050b(int i, C5049a c5049a) {
        this.f18668b = C7492i.m32565b(i, 1);
        this.f18670d = c5049a;
    }

    /* renamed from: a */
    public final void m22585a(int i, int i2) {
        if (i2 > 0) {
            this.f18670d.m22581a(i, this.f18669c);
            this.f18668b.m29329a(this.f18669c.f18661a, this.f18669c.f18662b, i2);
        }
    }

    /* renamed from: a */
    public final void m22586a(C5052d c5052d) {
        if (!(this.f18667a == null || this.f18667a.m32540a() == c5052d.f18683a)) {
            m22583c();
        }
        this.f18670d.m22582b(c5052d);
        if (this.f18667a == null) {
            this.f18667a = this.f18670d.m22579a(c5052d);
            this.f18667a.m32556e();
        }
        this.f18667a.m32544a(c5052d.f18683a);
        this.f18668b.mo7118d(c5052d);
    }

    /* renamed from: b */
    public final void m22588b(C5052d c5052d) {
        this.f18668b.mo7116b(c5052d);
        m22583c();
    }

    /* renamed from: c */
    public final void m22589c(C5052d c5052d) {
        this.f18668b.m29340c(c5052d);
        m22583c();
    }

    /* renamed from: a */
    public final int m22584a() {
        return this.f18668b.m29336b();
    }

    /* renamed from: b */
    public final int m22587b() {
        return this.f18668b.mo7117c() + 24;
    }

    /* renamed from: c */
    private void m22583c() {
        if (this.f18667a != null) {
            this.f18667a.m32557f();
            this.f18667a = null;
        }
    }
}
