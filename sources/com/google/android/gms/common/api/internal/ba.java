package com.google.android.gms.common.api.internal;

final class ba implements Runnable {
    /* renamed from: a */
    private /* synthetic */ LifecycleCallback f7484a;
    /* renamed from: b */
    private /* synthetic */ String f7485b;
    /* renamed from: c */
    private /* synthetic */ az f7486c;

    ba(az azVar, LifecycleCallback lifecycleCallback, String str) {
        this.f7486c = azVar;
        this.f7484a = lifecycleCallback;
        this.f7485b = str;
    }

    public final void run() {
        if (this.f7486c.f11924c > 0) {
            this.f7484a.mo2548a(this.f7486c.f11925d != null ? this.f7486c.f11925d.getBundle(this.f7485b) : null);
        }
        if (this.f7486c.f11924c >= 2) {
            this.f7484a.mo2549b();
        }
        if (this.f7486c.f11924c >= 3) {
            this.f7484a.mo3578c();
        }
        if (this.f7486c.f11924c >= 4) {
            this.f7484a.mo2551d();
        }
        if (this.f7486c.f11924c >= 5) {
            this.f7484a.m8925e();
        }
    }
}
