package com.google.android.gms.internal;

final class asz implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15698a;

    asz(asr asr) {
        this.f15698a = asr;
    }

    public final void run() {
        try {
            this.f15698a.f23120a.onAdOpened();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }
}
