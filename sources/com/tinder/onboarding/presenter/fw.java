package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fw implements Action1 {
    /* renamed from: a */
    static final Action1 f44739a = new fw();

    private fw() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showPasswordRequirementHint();
    }
}
