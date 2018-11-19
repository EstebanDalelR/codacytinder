package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fz implements Action1 {
    /* renamed from: a */
    static final Action1 f44742a = new fz();

    private fz() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showPasswordRequirementHint();
    }
}
