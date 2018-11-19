package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

final class as implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzaat f15684a;
    /* renamed from: b */
    private /* synthetic */ zzabe f15685b;
    /* renamed from: c */
    private /* synthetic */ aq f15686c;

    as(aq aqVar, zzaat zzaat, zzabe zzabe) {
        this.f15686c = aqVar;
        this.f15684a = zzaat;
        this.f15685b = zzabe;
    }

    public final void run() {
        zzaax zzb;
        try {
            zzb = this.f15686c.zzb(this.f15684a);
        } catch (Throwable e) {
            ar.i().m27296a(e, "AdRequestServiceImpl.loadAdAsync");
            hx.m19914c("Could not fetch ad response due to an Exception.", e);
            zzb = null;
        }
        if (zzb == null) {
            zzb = new zzaax(0);
        }
        try {
            this.f15685b.zza(zzb);
        } catch (Throwable e2) {
            hx.m19914c("Fail to forward ad response.", e2);
        }
    }
}
