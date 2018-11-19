package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewCompat;

class GamepadView$2 extends AnimatorListenerAdapter {
    final /* synthetic */ GamepadView this$0;

    GamepadView$2(GamepadView gamepadView) {
        this.this$0 = gamepadView;
    }

    public void onAnimationStart(Animator animator) {
        ViewCompat.j(this.this$0, 10.0f);
    }

    public void onAnimationEnd(Animator animator) {
        ViewCompat.j(this.this$0, 0.0f);
        GamepadView.access$102(this.this$0, null);
    }
}
