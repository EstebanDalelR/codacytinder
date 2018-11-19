package com.tinder.boost.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.boost.view.d */
final /* synthetic */ class C8356d implements AnimatorUpdateListener {
    /* renamed from: a */
    private final BoostGaugeView f29690a;

    C8356d(BoostGaugeView boostGaugeView) {
        this.f29690a = boostGaugeView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29690a.m35595a(valueAnimator);
    }
}
