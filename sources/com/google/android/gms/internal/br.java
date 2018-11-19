package com.google.android.gms.internal;

final class br implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dm f15908a;
    /* renamed from: b */
    private /* synthetic */ bp f15909b;

    br(bp bpVar, dm dmVar) {
        this.f15909b = bpVar;
        this.f15908a = dmVar;
    }

    public final void run() {
        this.f15909b.zzb(new dl(this.f15908a, null, null, null, null, null, null, null));
    }
}
