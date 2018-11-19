package com.google.android.gms.internal;

final class akq implements Runnable {
    /* renamed from: a */
    private /* synthetic */ akp f15401a;

    akq(akp akp) {
        this.f15401a = akp;
    }

    public final void run() {
        if (this.f15401a.f26661a.f26660a != null) {
            try {
                this.f15401a.f26661a.f26660a.onAdFailedToLoad(1);
            } catch (Throwable e) {
                hx.m19914c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
