package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

class RecsStatusView$1 extends AnimatorListenerAdapter {
    final /* synthetic */ RecsStatusView this$0;
    final /* synthetic */ ImageView val$ring;

    RecsStatusView$1(RecsStatusView recsStatusView, ImageView imageView) {
        this.this$0 = recsStatusView;
        this.val$ring = imageView;
    }

    public void onAnimationCancel(Animator animator) {
        this.val$ring.setVisibility(8);
    }
}
