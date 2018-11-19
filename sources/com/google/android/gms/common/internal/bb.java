package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.v4.app.Fragment;

final class bb extends az {
    /* renamed from: a */
    private /* synthetic */ Intent f12059a;
    /* renamed from: b */
    private /* synthetic */ Fragment f12060b;
    /* renamed from: c */
    private /* synthetic */ int f12061c;

    bb(Intent intent, Fragment fragment, int i) {
        this.f12059a = intent;
        this.f12060b = fragment;
        this.f12061c = i;
    }

    /* renamed from: a */
    public final void mo2578a() {
        if (this.f12059a != null) {
            this.f12060b.startActivityForResult(this.f12059a, this.f12061c);
        }
    }
}
