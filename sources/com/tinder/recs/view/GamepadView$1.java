package com.tinder.recs.view;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class GamepadView$1 implements OnGlobalLayoutListener {
    final /* synthetic */ GamepadView this$0;

    GamepadView$1(GamepadView gamepadView) {
        this.this$0 = gamepadView;
    }

    public void onGlobalLayout() {
        if (this.this$0.boostButtonView.getWidth() > 0) {
            this.this$0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GamepadView.access$000(this.this$0);
        }
    }
}
