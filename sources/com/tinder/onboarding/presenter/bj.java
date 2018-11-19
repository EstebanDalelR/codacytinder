package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import rx.functions.Action1;

final /* synthetic */ class bj implements Action1 {
    /* renamed from: a */
    private final C13526y f44648a;
    /* renamed from: b */
    private final OnboardingEmail f44649b;

    bj(C13526y c13526y, OnboardingEmail onboardingEmail) {
        this.f44648a = c13526y;
        this.f44649b = onboardingEmail;
    }

    public void call(Object obj) {
        this.f44648a.m52864a(this.f44649b, (Throwable) obj);
    }
}
