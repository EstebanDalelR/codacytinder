package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzaj;

final class ah implements zzalk<zzaj> {
    /* renamed from: a */
    private /* synthetic */ ag f22948a;

    ah(ag agVar) {
        this.f22948a = agVar;
    }

    public final /* synthetic */ void zzf(Object obj) {
        try {
            ((zzaj) obj).zzb("AFMA_getAdapterLessMediationAd", this.f22948a.f15154a);
        } catch (Throwable e) {
            hx.m19912b("Error requesting an ad url", e);
            ae.f26544f.b(this.f22948a.f15155b);
        }
    }
}
