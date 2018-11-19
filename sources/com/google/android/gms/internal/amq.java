package com.google.android.gms.internal;

final class amq implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amp f15509a;

    amq(amp amp) {
        this.f15509a = amp;
    }

    public final void run() {
        if (this.f15509a.f26714n != null) {
            this.f15509a.f26714n.zzki();
            this.f15509a.f26714n.zzkh();
        }
        this.f15509a.f26714n = null;
    }
}
