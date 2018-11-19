package com.google.android.gms.internal;

final class aru implements Runnable {
    /* renamed from: a */
    private /* synthetic */ aro f15673a;

    aru(art art, aro aro) {
        this.f15673a = aro;
    }

    public final void run() {
        try {
            this.f15673a.f15664c.destroy();
        } catch (Throwable e) {
            hx.m19914c("Could not destroy mediation adapter.", e);
        }
    }
}
