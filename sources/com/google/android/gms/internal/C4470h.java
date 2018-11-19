package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.h */
final class C4470h implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzalh f16125a;
    /* renamed from: b */
    private /* synthetic */ awe f16126b;

    C4470h(awe awe, zzalh zzalh) {
        this.f16126b = awe;
        this.f16125a = zzalh;
    }

    public final void run() {
        synchronized (this.f16126b.f26843d) {
            this.f16126b.f26840a = this.f16126b.m31535a(this.f16126b.f26842c.f16490j, this.f16125a);
            if (this.f16126b.f26840a == null) {
                this.f16126b.m31531a(0, "Could not start the ad request service.");
                fk.f16060a.removeCallbacks(this.f16126b.f26848i);
            }
        }
    }
}
