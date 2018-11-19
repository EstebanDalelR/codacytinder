package com.tinder.superlike.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.superlike.dialog.a */
final /* synthetic */ class C15076a implements AnimatorUpdateListener {
    /* renamed from: a */
    private final SuperlikePaywallDialog f46921a;
    /* renamed from: b */
    private final int f46922b;
    /* renamed from: c */
    private final int f46923c;

    C15076a(SuperlikePaywallDialog superlikePaywallDialog, int i, int i2) {
        this.f46921a = superlikePaywallDialog;
        this.f46922b = i;
        this.f46923c = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f46921a.m65958a(this.f46922b, this.f46923c, valueAnimator);
    }
}
