package com.google.android.gms.internal;

import com.google.android.gms.dynamic.C4296b;

final class ch implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzva f15918a;
    /* renamed from: b */
    private /* synthetic */ zzjj f15919b;
    /* renamed from: c */
    private /* synthetic */ cl f15920c;
    /* renamed from: d */
    private /* synthetic */ ce f15921d;

    ch(ce ceVar, zzva zzva, zzjj zzjj, cl clVar) {
        this.f15921d = ceVar;
        this.f15918a = zzva;
        this.f15919b = zzjj;
        this.f15920c = clVar;
    }

    public final void run() {
        try {
            this.f15918a.zza(C4296b.a(this.f15921d.f26859b), this.f15919b, null, this.f15920c, this.f15921d.f26864g);
        } catch (Throwable e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f15921d.f26863f);
            hx.m19914c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f15921d.zza(this.f15921d.f26863f, 0);
        }
    }
}
