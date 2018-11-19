package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class anh implements zzoq {
    /* renamed from: a */
    private /* synthetic */ View f23019a;
    /* renamed from: b */
    private /* synthetic */ anf f23020b;

    anh(anf anf, View view) {
        this.f23020b = anf;
        this.f23019a = view;
    }

    public final void zzc(MotionEvent motionEvent) {
        this.f23020b.onTouch(null, motionEvent);
    }

    public final void zzkb() {
        this.f23020b.onClick(this.f23019a);
    }
}
