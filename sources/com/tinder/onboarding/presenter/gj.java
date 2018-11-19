package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class gj implements Action1 {
    /* renamed from: a */
    static final Action1 f44751a = new gj();

    private gj() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showProgressDialog();
    }
}
