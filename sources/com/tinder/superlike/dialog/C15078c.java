package com.tinder.superlike.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.superlike.dialog.c */
final /* synthetic */ class C15078c implements AnimatorUpdateListener {
    /* renamed from: a */
    private final SuperlikePaywallDialog f46925a;
    /* renamed from: b */
    private final ValueAnimator f46926b;

    C15078c(SuperlikePaywallDialog superlikePaywallDialog, ValueAnimator valueAnimator) {
        this.f46925a = superlikePaywallDialog;
        this.f46926b = valueAnimator;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f46925a.m65961a(this.f46926b, valueAnimator);
    }
}
