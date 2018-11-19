package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.d */
final /* synthetic */ class C14088d implements Action1 {
    /* renamed from: a */
    static final Action1 f44682a = new C14088d();

    private C14088d() {
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).finishOnboardingProcess();
    }
}
