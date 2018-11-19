package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ee implements Action1 {
    /* renamed from: a */
    static final Action1 f44705a = new ee();

    private ee() {
    }

    public void call(Object obj) {
        ((OnboardingActivityTarget) obj).showGenericErrorMessage(false);
    }
}
