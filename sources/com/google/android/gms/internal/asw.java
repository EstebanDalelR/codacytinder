package com.google.android.gms.internal;

final class asw implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15694a;

    asw(asr asr) {
        this.f15694a = asr;
    }

    public final void run() {
        try {
            this.f15694a.f23120a.onAdClosed();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClosed.", e);
        }
    }
}
