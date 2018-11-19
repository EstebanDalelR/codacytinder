package com.tinder.onboarding.interactor;

import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.repository.OnboardingUserRepository;
import rx.functions.Func1;

/* renamed from: com.tinder.onboarding.interactor.c */
final /* synthetic */ class C13511c implements Func1 {
    /* renamed from: a */
    private final OnboardingUserRepository f43103a;

    private C13511c(OnboardingUserRepository onboardingUserRepository) {
        this.f43103a = onboardingUserRepository;
    }

    /* renamed from: a */
    static Func1 m52624a(OnboardingUserRepository onboardingUserRepository) {
        return new C13511c(onboardingUserRepository);
    }

    public Object call(Object obj) {
        return this.f43103a.updateUser((OnboardingUser) obj);
    }
}
