package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.C4275c;

final class kx implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ku f16328a;

    kx(ku kuVar) {
        this.f16328a = kuVar;
    }

    public final void run() {
        this.f16328a.f16298a.zzth();
        C4275c zzsv = this.f16328a.f16298a.zzsv();
        if (zzsv != null) {
            zzsv.c();
        }
        if (this.f16328a.f16307l != null) {
            this.f16328a.f16307l.zzdc();
            this.f16328a.f16307l = null;
        }
    }
}
