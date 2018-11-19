package com.tinder.paywall.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.paywall.views.e */
final /* synthetic */ class C10107e implements AnimatorUpdateListener {
    /* renamed from: a */
    private final TinderGoldPaywallItemView f33068a;

    C10107e(TinderGoldPaywallItemView tinderGoldPaywallItemView) {
        this.f33068a = tinderGoldPaywallItemView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33068a.m48559a(valueAnimator);
    }
}
