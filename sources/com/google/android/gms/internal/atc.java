package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class atc implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ErrorCode f15702a;
    /* renamed from: b */
    private /* synthetic */ asr f15703b;

    atc(asr asr, ErrorCode errorCode) {
        this.f15703b = asr;
        this.f15702a = errorCode;
    }

    public final void run() {
        try {
            this.f15703b.f23120a.onAdFailedToLoad(ate.m19471a(this.f15702a));
        } catch (Throwable e) {
            hx.m19914c("Could not call onAdFailedToLoad.", e);
        }
    }
}
