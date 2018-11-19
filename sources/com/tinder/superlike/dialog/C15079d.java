package com.tinder.superlike.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.superlike.dialog.d */
final /* synthetic */ class C15079d implements AnimatorUpdateListener {
    /* renamed from: a */
    private final SuperlikePaywallDialog f46927a;
    /* renamed from: b */
    private final int f46928b;
    /* renamed from: c */
    private final int f46929c;
    /* renamed from: d */
    private final ValueAnimator f46930d;

    C15079d(SuperlikePaywallDialog superlikePaywallDialog, int i, int i2, ValueAnimator valueAnimator) {
        this.f46927a = superlikePaywallDialog;
        this.f46928b = i;
        this.f46929c = i2;
        this.f46930d = valueAnimator;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f46927a.m65959a(this.f46928b, this.f46929c, this.f46930d, valueAnimator);
    }
}
