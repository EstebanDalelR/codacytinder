package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class eg implements Action1 {
    /* renamed from: a */
    static final Action1 f44707a = new eg();

    private eg() {
    }

    public void call(Object obj) {
        ((OnboardingActivityTarget) obj).finishOnboardingWithSuccess();
    }
}
