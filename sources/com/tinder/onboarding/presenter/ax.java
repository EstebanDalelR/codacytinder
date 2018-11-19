package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ax implements Action1 {
    /* renamed from: a */
    private final String f44641a;
    /* renamed from: b */
    private final OnboardingEmail f44642b;

    ax(String str, OnboardingEmail onboardingEmail) {
        this.f44641a = str;
        this.f44642b = onboardingEmail;
    }

    public void call(Object obj) {
        C13526y.m52849a(this.f44641a, this.f44642b, (EmailStepTarget) obj);
    }
}
