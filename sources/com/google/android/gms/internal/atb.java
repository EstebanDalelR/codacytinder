package com.google.android.gms.internal;

final class atb implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15701a;

    atb(asr asr) {
        this.f15701a = asr;
    }

    public final void run() {
        try {
            this.f15701a.f23120a.onAdClosed();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }
}
