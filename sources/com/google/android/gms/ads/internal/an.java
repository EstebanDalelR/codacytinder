package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class an implements OnTouchListener {
    /* renamed from: a */
    private /* synthetic */ al f7106a;

    an(al alVar) {
        this.f7106a = alVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f7106a.f13854h != null) {
            this.f7106a.f13854h.a(motionEvent);
        }
        return false;
    }
}
