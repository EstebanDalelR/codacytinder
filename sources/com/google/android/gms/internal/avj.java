package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class avj implements OnGlobalLayoutListener {
    /* renamed from: a */
    private /* synthetic */ WeakReference f15786a;
    /* renamed from: b */
    private /* synthetic */ avd f15787b;

    avj(avd avd, WeakReference weakReference) {
        this.f15787b = avd;
        this.f15786a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f15787b.m19531a(this.f15786a, false);
    }
}
