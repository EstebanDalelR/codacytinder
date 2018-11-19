package com.google.android.gms.internal;

final class ata implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15700a;

    ata(asr asr) {
        this.f15700a = asr;
    }

    public final void run() {
        try {
            this.f15700a.f23120a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }
}
