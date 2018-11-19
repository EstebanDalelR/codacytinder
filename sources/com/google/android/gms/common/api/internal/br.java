package com.google.android.gms.common.api.internal;

final class br implements Runnable {
    /* renamed from: a */
    private /* synthetic */ LifecycleCallback f7504a;
    /* renamed from: b */
    private /* synthetic */ String f7505b;
    /* renamed from: c */
    private /* synthetic */ bq f7506c;

    br(bq bqVar, LifecycleCallback lifecycleCallback, String str) {
        this.f7506c = bqVar;
        this.f7504a = lifecycleCallback;
        this.f7505b = str;
    }

    public final void run() {
        if (this.f7506c.f13977c > 0) {
            this.f7504a.mo2548a(this.f7506c.f13978d != null ? this.f7506c.f13978d.getBundle(this.f7505b) : null);
        }
        if (this.f7506c.f13977c >= 2) {
            this.f7504a.mo2549b();
        }
        if (this.f7506c.f13977c >= 3) {
            this.f7504a.mo3578c();
        }
        if (this.f7506c.f13977c >= 4) {
            this.f7504a.mo2551d();
        }
        if (this.f7506c.f13977c >= 5) {
            this.f7504a.m8925e();
        }
    }
}
