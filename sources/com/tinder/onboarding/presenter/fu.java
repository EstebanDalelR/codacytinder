package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fu implements Action1 {
    /* renamed from: a */
    static final Action1 f44737a = new fu();

    private fu() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showSimplePasswordHint();
    }
}
