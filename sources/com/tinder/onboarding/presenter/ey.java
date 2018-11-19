package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ey implements Action1 {
    /* renamed from: a */
    static final Action1 f44722a = new ey();

    private ey() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).dismissKeyboard();
    }
}
