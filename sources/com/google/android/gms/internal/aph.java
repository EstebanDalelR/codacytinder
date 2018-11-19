package com.google.android.gms.internal;

final /* synthetic */ class aph implements Runnable {
    /* renamed from: a */
    private final apf f15565a;
    /* renamed from: b */
    private final aoz f15566b;
    /* renamed from: c */
    private final iw f15567c;
    /* renamed from: d */
    private final zzrr f15568d;

    aph(apf apf, aoz aoz, iw iwVar, zzrr zzrr) {
        this.f15565a = apf;
        this.f15566b = aoz;
        this.f15567c = iwVar;
        this.f15568d = zzrr;
    }

    public final void run() {
        apf apf = this.f15565a;
        aoz aoz = this.f15566b;
        iw iwVar = this.f15567c;
        try {
            iwVar.m27364b(aoz.m27179c().zza(this.f15568d));
        } catch (Throwable e) {
            hx.m19912b("Unable to obtain a cache service instance.", e);
            iwVar.m27363a(e);
            apf.f23038a.m27181a();
        }
    }
}
