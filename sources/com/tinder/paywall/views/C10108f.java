package com.tinder.paywall.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.paywall.views.f */
final /* synthetic */ class C10108f implements AnimatorUpdateListener {
    /* renamed from: a */
    private final TinderPlusPaywallItemView f33069a;

    C10108f(TinderPlusPaywallItemView tinderPlusPaywallItemView) {
        this.f33069a = tinderPlusPaywallItemView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33069a.m48564b(valueAnimator);
    }
}
