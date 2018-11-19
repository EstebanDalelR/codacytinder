package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzjj;

/* renamed from: com.google.android.gms.ads.internal.i */
final class C2381i implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzjj f7267a;
    /* renamed from: b */
    private /* synthetic */ int f7268b;
    /* renamed from: c */
    private /* synthetic */ C4270g f7269c;

    C2381i(C4270g c4270g, zzjj zzjj, int i) {
        this.f7269c = c4270g;
        this.f7267a = zzjj;
        this.f7268b = i;
    }

    public final void run() {
        synchronized (this.f7269c.f13874s) {
            this.f7269c.m17123a(this.f7267a, this.f7268b);
        }
    }
}
