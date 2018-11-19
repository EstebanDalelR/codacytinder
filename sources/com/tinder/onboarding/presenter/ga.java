package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ga implements Action1 {
    /* renamed from: a */
    static final Action1 f44743a = new ga();

    private ga() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).hideProgressDialog();
    }
}
