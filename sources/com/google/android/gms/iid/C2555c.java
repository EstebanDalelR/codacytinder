package com.google.android.gms.iid;

import android.content.Intent;

/* renamed from: com.google.android.gms.iid.c */
final class C2555c implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Intent f7764a;
    /* renamed from: b */
    private /* synthetic */ Intent f7765b;
    /* renamed from: c */
    private /* synthetic */ zzb f7766c;

    C2555c(zzb zzb, Intent intent, Intent intent2) {
        this.f7766c = zzb;
        this.f7764a = intent;
        this.f7765b = intent2;
    }

    public final void run() {
        this.f7766c.handleIntent(this.f7764a);
        this.f7766c.zzh(this.f7765b);
    }
}
