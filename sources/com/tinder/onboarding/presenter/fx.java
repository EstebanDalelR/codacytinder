package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fx implements Action1 {
    /* renamed from: a */
    static final Action1 f44740a = new fx();

    private fx() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).enableActionButton();
    }
}
