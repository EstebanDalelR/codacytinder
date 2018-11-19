package com.tinder.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final /* synthetic */ class aw implements OnTouchListener {
    /* renamed from: a */
    private final float f47622a;

    aw(float f) {
        this.f47622a = f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return av.a(this.f47622a, view, motionEvent);
    }
}
