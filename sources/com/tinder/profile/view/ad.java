package com.tinder.profile.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tinder.profile.view.UserRecProfileView.GamePadButtons;

final /* synthetic */ class ad implements AnimatorUpdateListener {
    /* renamed from: a */
    private final GamePadButtons f45792a;

    ad(GamePadButtons gamePadButtons) {
        this.f45792a = gamePadButtons;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f45792a.m61050a(valueAnimator);
    }
}
