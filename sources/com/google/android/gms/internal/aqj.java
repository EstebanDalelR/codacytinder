package com.google.android.gms.internal;

final class aqj implements Runnable {
    /* renamed from: a */
    private /* synthetic */ aqk f15576a;
    /* renamed from: b */
    private /* synthetic */ aql f15577b;

    aqj(apl apl, aqk aqk, aql aql) {
        this.f15576a = aqk;
        this.f15577b = aql;
    }

    public final void run() {
        try {
            this.f15576a.mo4450a(this.f15577b);
        } catch (Throwable e) {
            hx.m19914c("Could not propagate interstitial ad event.", e);
        }
    }
}
