package com.google.android.gms.internal;

final class akw implements Runnable {
    /* renamed from: a */
    private /* synthetic */ akv f15403a;

    akw(akv akv) {
        this.f15403a = akv;
    }

    public final void run() {
        if (this.f15403a.f26663a != null) {
            try {
                this.f15403a.f26663a.onRewardedVideoAdFailedToLoad(1);
            } catch (Throwable e) {
                hx.m19914c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
