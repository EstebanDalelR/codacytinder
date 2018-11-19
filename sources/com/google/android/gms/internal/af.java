package com.google.android.gms.internal;

final class af implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dm f15119a;
    /* renamed from: b */
    private /* synthetic */ ae f15120b;

    af(ae aeVar, dm dmVar) {
        this.f15120b = aeVar;
        this.f15119a = dmVar;
    }

    public final void run() {
        this.f15120b.f26546h.zza(this.f15119a);
        if (this.f15120b.f26550l != null) {
            this.f15120b.f26550l.a();
            this.f15120b.f26550l = null;
        }
    }
}
