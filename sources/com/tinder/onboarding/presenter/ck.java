package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.model.OnboardingEventCode;
import java8.util.function.Consumer;

final /* synthetic */ class ck implements Consumer {
    /* renamed from: a */
    private final by f39451a;
    /* renamed from: b */
    private final OnboardingEventCode f39452b;

    ck(by byVar, OnboardingEventCode onboardingEventCode) {
        this.f39451a = byVar;
        this.f39452b = onboardingEventCode;
    }

    public void accept(Object obj) {
        this.f39451a.m52718a(this.f39452b, (GenderSelection) obj);
    }
}
