package com.tinder.paywall.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.paywall.views.b */
final /* synthetic */ class C10104b implements AnimatorUpdateListener {
    /* renamed from: a */
    private final ConsumablePaywallItemView f33065a;

    C10104b(ConsumablePaywallItemView consumablePaywallItemView) {
        this.f33065a = consumablePaywallItemView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33065a.m48553a(valueAnimator);
    }
}
