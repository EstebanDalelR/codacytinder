package com.google.android.gms.internal;

final class aui implements Runnable {
    /* renamed from: a */
    private /* synthetic */ auh f15732a;

    aui(auh auh) {
        this.f15732a = auh;
    }

    public final void run() {
        if (this.f15732a.f23170h.get()) {
            hx.m19913c("Timed out waiting for WebView to finish loading.");
            this.f15732a.cancel();
        }
    }
}
