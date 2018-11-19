package com.google.android.gms.internal;

final class aks implements Runnable {
    /* renamed from: a */
    private /* synthetic */ akr f15402a;

    aks(akr akr) {
        this.f15402a = akr;
    }

    public final void run() {
        if (this.f15402a.f26662a != null) {
            try {
                this.f15402a.f26662a.onAdFailedToLoad(1);
            } catch (Throwable e) {
                hx.m19914c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
