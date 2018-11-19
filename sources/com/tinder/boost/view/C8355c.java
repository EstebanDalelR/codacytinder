package com.tinder.boost.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.boost.view.c */
final /* synthetic */ class C8355c implements AnimatorUpdateListener {
    /* renamed from: a */
    private final BoostGaugeView f29689a;

    C8355c(BoostGaugeView boostGaugeView) {
        this.f29689a = boostGaugeView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29689a.m35598b(valueAnimator);
    }
}
