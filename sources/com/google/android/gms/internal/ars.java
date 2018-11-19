package com.google.android.gms.internal;

final class ars implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzakv f15671a;
    /* renamed from: b */
    private /* synthetic */ arq f15672b;

    ars(arq arq, zzakv zzakv) {
        this.f15672b = arq;
        this.f15671a = zzakv;
    }

    public final void run() {
        for (zzakv zzakv : this.f15672b.f23090k.keySet()) {
            if (zzakv != this.f15671a) {
                ((arl) this.f15672b.f23090k.get(zzakv)).m27224a();
            }
        }
    }
}
