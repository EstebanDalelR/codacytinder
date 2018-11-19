package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class bm implements Runnable {
    /* renamed from: a */
    private /* synthetic */ bl f7501a;

    bm(bl blVar) {
        this.f7501a = blVar;
    }

    public final void run() {
        this.f7501a.f14579h.zzh(new ConnectionResult(4));
    }
}
