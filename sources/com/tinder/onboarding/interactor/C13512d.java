package com.tinder.onboarding.interactor;

import com.tinder.onboarding.repository.OnboardingUserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.interactor.d */
public final class C13512d implements Factory<C9965a> {
    /* renamed from: a */
    private final Provider<OnboardingUserRepository> f43104a;

    public /* synthetic */ Object get() {
        return m52627a();
    }

    public C13512d(Provider<OnboardingUserRepository> provider) {
        this.f43104a = provider;
    }

    /* renamed from: a */
    public C9965a m52627a() {
        return C13512d.m52625a(this.f43104a);
    }

    /* renamed from: a */
    public static C9965a m52625a(Provider<OnboardingUserRepository> provider) {
        return new C9965a((OnboardingUserRepository) provider.get());
    }

    /* renamed from: b */
    public static C13512d m52626b(Provider<OnboardingUserRepository> provider) {
        return new C13512d(provider);
    }
}
