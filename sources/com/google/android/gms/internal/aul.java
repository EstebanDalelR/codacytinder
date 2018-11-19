package com.google.android.gms.internal;

final class aul implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dl f15734a;
    /* renamed from: b */
    private /* synthetic */ auj f15735b;

    aul(auj auj, dl dlVar) {
        this.f15735b = auj;
        this.f15734a = dlVar;
    }

    public final void run() {
        synchronized (this.f15735b.f26813c) {
            auj auj = this.f15735b;
            auj.f26811a.zzb(this.f15734a);
        }
    }
}
