package com.google.android.m4b.maps.ci;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: com.google.android.m4b.maps.ci.g */
public final class C5208g extends SimpleOnGestureListener {
    /* renamed from: a */
    private C6642d f19405a;
    /* renamed from: b */
    private C6645h f19406b;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    C5208g(C6642d c6642d, C6645h c6645h) {
        this.f19405a = c6642d;
        this.f19406b = c6645h;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean a = this.f19406b.m29653a(motionEvent);
        return !a ? this.f19405a.m29600a(motionEvent) : a;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f19405a.m29603b(motionEvent);
    }
}
