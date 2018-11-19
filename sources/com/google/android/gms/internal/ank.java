package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class ank implements zzoq {
    /* renamed from: a */
    private /* synthetic */ View f23021a;
    /* renamed from: b */
    private /* synthetic */ ani f23022b;

    ank(ani ani, View view) {
        this.f23022b = ani;
        this.f23021a = view;
    }

    public final void zzc(MotionEvent motionEvent) {
        this.f23022b.onTouch(null, motionEvent);
    }

    public final void zzkb() {
        if (this.f23022b.m31472a(ani.f26742a)) {
            this.f23022b.onClick(this.f23021a);
        }
    }
}
