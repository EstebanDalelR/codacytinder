package com.tinder.superlike.dialog;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.superlike.dialog.b */
final /* synthetic */ class C15077b implements AnimatorUpdateListener {
    /* renamed from: a */
    private final SuperlikePaywallDialog f46924a;

    C15077b(SuperlikePaywallDialog superlikePaywallDialog) {
        this.f46924a = superlikePaywallDialog;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f46924a.m65960a(valueAnimator);
    }
}
