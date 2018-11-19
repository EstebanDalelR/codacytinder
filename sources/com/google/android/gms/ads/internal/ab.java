package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;

final class ab implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dm f7076a;
    /* renamed from: b */
    private /* synthetic */ aa f7077b;

    ab(aa aaVar, dm dmVar) {
        this.f7077b = aaVar;
        this.f7076a = dmVar;
    }

    public final void run() {
        this.f7077b.zzb(new dl(this.f7076a, null, null, null, null, null, null, null));
    }
}
