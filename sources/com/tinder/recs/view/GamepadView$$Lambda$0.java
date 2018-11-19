package com.tinder.recs.view;

import com.tinder.gamepadcounters.C9671a;

final /* synthetic */ class GamepadView$$Lambda$0 implements Runnable {
    private final GamepadView arg$1;
    private final C9671a arg$2;

    GamepadView$$Lambda$0(GamepadView gamepadView, C9671a c9671a) {
        this.arg$1 = gamepadView;
        this.arg$2 = c9671a;
    }

    public void run() {
        this.arg$1.lambda$animateGamepadCounters$0$GamepadView(this.arg$2);
    }
}
