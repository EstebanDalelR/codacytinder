package com.google.android.gms.internal;

import android.view.View;

final class kv implements Runnable {
    /* renamed from: a */
    private /* synthetic */ View f16322a;
    /* renamed from: b */
    private /* synthetic */ zzafb f16323b;
    /* renamed from: c */
    private /* synthetic */ int f16324c;
    /* renamed from: d */
    private /* synthetic */ ku f16325d;

    kv(ku kuVar, View view, zzafb zzafb, int i) {
        this.f16325d = kuVar;
        this.f16322a = view;
        this.f16323b = zzafb;
        this.f16324c = i;
    }

    public final void run() {
        this.f16325d.m19990a(this.f16322a, this.f16323b, this.f16324c - 1);
    }
}
