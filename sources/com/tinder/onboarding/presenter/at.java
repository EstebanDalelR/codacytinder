package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.Optional;
import java8.util.function.Supplier;

final /* synthetic */ class at implements Supplier {
    /* renamed from: a */
    private final OnboardingEmail f39447a;

    at(OnboardingEmail onboardingEmail) {
        this.f39447a = onboardingEmail;
    }

    public Object get() {
        return Optional.b(this.f39447a.defaultAllowMarketing());
    }
}
