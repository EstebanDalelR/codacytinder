package com.google.android.gms.internal;

final class ast implements Runnable {
    /* renamed from: a */
    private /* synthetic */ asr f15688a;

    ast(asr asr) {
        this.f15688a = asr;
    }

    public final void run() {
        try {
            this.f15688a.f23120a.onAdOpened();
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdOpened.", e);
        }
    }
}
