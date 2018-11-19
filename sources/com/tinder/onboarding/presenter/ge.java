package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ge implements Action1 {
    /* renamed from: a */
    static final Action1 f44747a = new ge();

    private ge() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showKeyboard();
    }
}
