package com.google.android.gms.internal;

final class asv implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15693a;

    asv(asr asr) {
        this.f15693a = asr;
    }

    public final void run() {
        try {
            this.f15693a.f23120a.onAdLoaded();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLoaded.", e);
        }
    }
}
