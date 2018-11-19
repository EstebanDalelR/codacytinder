package com.tinder.gamepad.view.animation;

import android.animation.Animator.AnimatorListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.tinder.gamepad.view.animation.b */
final /* synthetic */ class C9662b implements OnTouchListener {
    /* renamed from: a */
    private final View f32198a;
    /* renamed from: b */
    private final float f32199b;
    /* renamed from: c */
    private final float f32200c;
    /* renamed from: d */
    private final long f32201d;
    /* renamed from: e */
    private final AnimatorListener f32202e;
    /* renamed from: f */
    private final long f32203f;

    C9662b(View view, float f, float f2, long j, AnimatorListener animatorListener, long j2) {
        this.f32198a = view;
        this.f32199b = f;
        this.f32200c = f2;
        this.f32201d = j;
        this.f32202e = animatorListener;
        this.f32203f = j2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return C9661a.m40070a(this.f32198a, this.f32199b, this.f32200c, this.f32201d, this.f32202e, this.f32203f, view, motionEvent);
    }
}
