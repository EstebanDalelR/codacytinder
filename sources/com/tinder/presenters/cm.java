package com.tinder.presenters;

import com.tinder.auth.model.AuthType;
import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cm implements Action1 {
    /* renamed from: a */
    static final Action1 f57892a = new cm();

    private cm() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showOnBoardingScreen(AuthType.ACCOUNTKIT);
    }
}
