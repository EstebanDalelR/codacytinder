package com.google.android.gms.internal;

final class ud implements Runnable {
    /* renamed from: a */
    private /* synthetic */ int f16569a;
    /* renamed from: b */
    private /* synthetic */ boolean f16570b;
    /* renamed from: c */
    private /* synthetic */ ub f16571c;

    ud(ub ubVar, int i, boolean z) {
        this.f16571c = ubVar;
        this.f16569a = i;
        this.f16570b = z;
    }

    public final void run() {
        nx b = this.f16571c.m20208b(this.f16569a, this.f16570b);
        this.f16571c.f16559k = b;
        if (ub.m20200b(this.f16569a, b)) {
            this.f16571c.m20206a(this.f16569a + 1, this.f16570b);
        }
    }
}
