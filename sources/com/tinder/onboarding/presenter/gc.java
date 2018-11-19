package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class gc implements Action1 {
    /* renamed from: a */
    static final Action1 f44745a = new gc();

    private gc() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showKeyboard();
    }
}
