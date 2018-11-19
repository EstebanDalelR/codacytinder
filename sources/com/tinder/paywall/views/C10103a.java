package com.tinder.paywall.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.tinder.paywall.views.a */
final /* synthetic */ class C10103a implements AnimatorUpdateListener {
    /* renamed from: a */
    private final ConsumablePaywallItemView f33064a;

    C10103a(ConsumablePaywallItemView consumablePaywallItemView) {
        this.f33064a = consumablePaywallItemView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33064a.m48556b(valueAnimator);
    }
}
