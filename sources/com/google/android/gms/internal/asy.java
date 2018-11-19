package com.google.android.gms.internal;

final class asy implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15697a;

    asy(asr asr) {
        this.f15697a = asr;
    }

    public final void run() {
        try {
            this.f15697a.f23120a.onAdLeftApplication();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdLeftApplication.", e);
        }
    }
}
