package com.google.android.gms.internal;

import android.content.Context;

final class akk implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Context f15399a;
    /* renamed from: b */
    private /* synthetic */ akj f15400b;

    akk(akj akj, Context context) {
        this.f15400b = akj;
        this.f15399a = context;
    }

    public final void run() {
        this.f15400b.m19304a(this.f15399a);
    }
}
