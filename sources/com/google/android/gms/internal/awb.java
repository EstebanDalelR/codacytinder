package com.google.android.gms.internal;

final class awb implements Runnable {
    /* renamed from: a */
    private /* synthetic */ hy f15794a;
    /* renamed from: b */
    private /* synthetic */ String f15795b;

    awb(avy avy, hy hyVar, String str) {
        this.f15794a = hyVar;
        this.f15795b = str;
    }

    public final void run() {
        this.f15794a.zzck(this.f15795b);
    }
}
