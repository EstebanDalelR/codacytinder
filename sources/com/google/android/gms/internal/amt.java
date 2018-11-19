package com.google.android.gms.internal;

final class amt implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amr f15510a;

    amt(amr amr) {
        this.f15510a = amr;
    }

    public final void run() {
        if (this.f15510a.f26722h != null) {
            this.f15510a.f26722h.zzki();
            this.f15510a.f26722h.zzkh();
        }
        this.f15510a.f26722h = null;
    }
}
