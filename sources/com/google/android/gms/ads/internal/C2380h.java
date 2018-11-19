package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzjj;

/* renamed from: com.google.android.gms.ads.internal.h */
final class C2380h implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzjj f7265a;
    /* renamed from: b */
    private /* synthetic */ C4270g f7266b;

    C2380h(C4270g c4270g, zzjj zzjj) {
        this.f7266b = c4270g;
        this.f7265a = zzjj;
    }

    public final void run() {
        synchronized (this.f7266b.f13874s) {
            if (this.f7266b.m17125a()) {
                this.f7266b.m17122a(this.f7265a);
            } else {
                this.f7266b.m17123a(this.f7265a, 1);
            }
        }
    }
}
