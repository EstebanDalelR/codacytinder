package com.google.android.gms.internal;

final class ass implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15687a;

    ass(asr asr) {
        this.f15687a = asr;
    }

    public final void run() {
        try {
            this.f15687a.f23120a.onAdClicked();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdClicked.", e);
        }
    }
}
