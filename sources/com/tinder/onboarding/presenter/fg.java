package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fg implements Action1 {
    /* renamed from: a */
    static final Action1 f44728a = new fg();

    private fg() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showSimplePasswordHint();
    }
}
