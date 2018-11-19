package com.tinder.recs.view.superlike;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final /* synthetic */ class SuperLikeDecorator$$Lambda$0 implements AnimatorUpdateListener {
    private final SuperLikeDecorator arg$1;

    SuperLikeDecorator$$Lambda$0(SuperLikeDecorator superLikeDecorator) {
        this.arg$1 = superLikeDecorator;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.arg$1.lambda$onMovedToTop$0$SuperLikeDecorator(valueAnimator);
    }
}
