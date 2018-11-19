package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;

final class bc implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dm f7194a;
    /* renamed from: b */
    private /* synthetic */ ba f7195b;

    bc(ba baVar, dm dmVar) {
        this.f7195b = baVar;
        this.f7194a = dmVar;
    }

    public final void run() {
        this.f7195b.zzb(new dl(this.f7194a, null, null, null, null, null, null, null));
    }
}
