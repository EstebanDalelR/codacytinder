package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class avk implements OnScrollChangedListener {
    /* renamed from: a */
    private /* synthetic */ WeakReference f15788a;
    /* renamed from: b */
    private /* synthetic */ avd f15789b;

    avk(avd avd, WeakReference weakReference) {
        this.f15789b = avd;
        this.f15788a = weakReference;
    }

    public final void onScrollChanged() {
        this.f15789b.m19531a(this.f15788a, true);
    }
}
