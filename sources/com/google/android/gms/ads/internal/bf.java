package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class bf implements OnTouchListener {
    /* renamed from: a */
    private /* synthetic */ bo f7201a;
    /* renamed from: b */
    private /* synthetic */ bd f7202b;

    bf(bd bdVar, bo boVar) {
        this.f7202b = bdVar;
        this.f7201a = boVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7201a.m8688a();
        if (this.f7202b.f7197b != null) {
            this.f7202b.f7197b.zzom();
        }
        return false;
    }
}
