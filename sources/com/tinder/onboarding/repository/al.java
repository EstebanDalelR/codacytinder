package com.tinder.onboarding.repository;

import rx.functions.Func1;

final /* synthetic */ class al implements Func1 {
    /* renamed from: a */
    private final OnboardingService f43213a;

    private al(OnboardingService onboardingService) {
        this.f43213a = onboardingService;
    }

    /* renamed from: a */
    static Func1 m52886a(OnboardingService onboardingService) {
        return new al(onboardingService);
    }

    public Object call(Object obj) {
        return this.f43213a.deleteUser((String) obj);
    }
}
