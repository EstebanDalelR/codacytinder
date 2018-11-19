package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2400j;

final class ath implements Runnable {
    /* renamed from: a */
    private /* synthetic */ AdOverlayInfoParcel f15707a;
    /* renamed from: b */
    private /* synthetic */ zzwl f15708b;

    ath(zzwl zzwl, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f15708b = zzwl;
        this.f15707a = adOverlayInfoParcel;
    }

    public final void run() {
        ar.c();
        C2400j.a(this.f15708b.f27078a, this.f15707a, true);
    }
}
