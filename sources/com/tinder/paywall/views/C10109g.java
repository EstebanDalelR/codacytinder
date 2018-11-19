package com.tinder.paywall.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.paywall.views.g */
final /* synthetic */ class C10109g implements AnimatorUpdateListener {
    /* renamed from: a */
    private final TinderPlusPaywallItemView f33070a;

    C10109g(TinderPlusPaywallItemView tinderPlusPaywallItemView) {
        this.f33070a = tinderPlusPaywallItemView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33070a.m48563a(valueAnimator);
    }
}
