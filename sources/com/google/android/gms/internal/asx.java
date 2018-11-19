package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class asx implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ErrorCode f15695a;
    /* renamed from: b */
    private /* synthetic */ asr f15696b;

    asx(asr asr, ErrorCode errorCode) {
        this.f15696b = asr;
        this.f15695a = errorCode;
    }

    public final void run() {
        try {
            this.f15696b.f23120a.onAdFailedToLoad(ate.m19471a(this.f15695a));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }
}
