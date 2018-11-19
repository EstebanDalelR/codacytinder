package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fs implements Action1 {
    /* renamed from: a */
    static final Action1 f44735a = new fs();

    private fs() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showStrongPasswordHint();
    }
}
