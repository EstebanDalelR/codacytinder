package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

final class afj extends ContentObserver {
    /* renamed from: a */
    private /* synthetic */ afe f15153a;

    public afj(afe afe, Handler handler) {
        this.f15153a = afe;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f15153a.m19085a();
    }
}
