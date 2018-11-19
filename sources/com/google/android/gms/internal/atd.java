package com.google.android.gms.internal;

final class atd implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15704a;

    atd(asr asr) {
        this.f15704a = asr;
    }

    public final void run() {
        try {
            this.f15704a.f23120a.onAdLeftApplication();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }
}
