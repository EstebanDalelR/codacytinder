package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEventCode;
import java8.util.Optional;
import rx.functions.Action1;

final /* synthetic */ class cg implements Action1 {
    /* renamed from: a */
    private final by f44667a;
    /* renamed from: b */
    private final OnboardingEventCode f44668b;

    cg(by byVar, OnboardingEventCode onboardingEventCode) {
        this.f44667a = byVar;
        this.f44668b = onboardingEventCode;
    }

    public void call(Object obj) {
        this.f44667a.m52719a(this.f44668b, (Optional) obj);
    }
}
