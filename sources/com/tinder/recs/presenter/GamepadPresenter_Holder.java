package com.tinder.recs.presenter;

import com.tinder.recs.target.GamepadTarget;
import com.tinder.recs.target.GamepadTarget_Stub;

public class GamepadPresenter_Holder {
    public static void takeAll(GamepadPresenter gamepadPresenter, GamepadTarget gamepadTarget) {
        gamepadPresenter.target = gamepadTarget;
        gamepadPresenter.take$Tinder_release();
        gamepadPresenter.subscribeToGamepadCounterSession$Tinder_release();
    }

    public static void dropAll(GamepadPresenter gamepadPresenter) {
        gamepadPresenter.drop$Tinder_release();
        gamepadPresenter.target = new GamepadTarget_Stub();
    }
}
