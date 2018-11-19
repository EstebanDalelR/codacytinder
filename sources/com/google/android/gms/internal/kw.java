package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class kw implements OnAttachStateChangeListener {
    /* renamed from: a */
    private /* synthetic */ zzafb f16326a;
    /* renamed from: b */
    private /* synthetic */ ku f16327b;

    kw(ku kuVar, zzafb zzafb) {
        this.f16327b = kuVar;
        this.f16326a = zzafb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f16327b.m19990a(view, this.f16326a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
