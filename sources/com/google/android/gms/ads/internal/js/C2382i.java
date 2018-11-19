package com.google.android.gms.ads.internal.js;

/* renamed from: com.google.android.gms.ads.internal.js.i */
final class C2382i implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzc f7275a;
    /* renamed from: b */
    private /* synthetic */ C3764h f7276b;

    C2382i(C3764h c3764h, zzc zzc) {
        this.f7276b = c3764h;
        this.f7275a = zzc;
    }

    public final void run() {
        this.f7276b.f11816a.f13895b.zzf(this.f7275a);
        this.f7275a.destroy();
    }
}
