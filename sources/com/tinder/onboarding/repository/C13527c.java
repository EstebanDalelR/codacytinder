package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingUser;
import rx.functions.Func0;

/* renamed from: com.tinder.onboarding.repository.c */
final /* synthetic */ class C13527c implements Func0 {
    /* renamed from: a */
    private final OnboardingUser f43224a;

    private C13527c(OnboardingUser onboardingUser) {
        this.f43224a = onboardingUser;
    }

    /* renamed from: a */
    static Func0 m52890a(OnboardingUser onboardingUser) {
        return new C13527c(onboardingUser);
    }

    public Object call() {
        return this.f43224a.getName();
    }
}
