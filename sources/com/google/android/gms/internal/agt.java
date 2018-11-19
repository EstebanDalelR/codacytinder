package com.google.android.gms.internal;

import android.view.View;

final class agt implements Runnable {
    /* renamed from: a */
    private /* synthetic */ View f15239a;
    /* renamed from: b */
    private /* synthetic */ ags f15240b;

    agt(ags ags, View view) {
        this.f15240b = ags;
        this.f15239a = view;
    }

    public final void run() {
        this.f15240b.m19150a(this.f15239a);
    }
}
