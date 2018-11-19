package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dm implements Factory<cz> {
    /* renamed from: a */
    private final Provider<C9965a> f43163a;
    /* renamed from: b */
    private final Provider<OnboardingAnalyticsInteractor> f43164b;

    public /* synthetic */ Object get() {
        return m52748a();
    }

    public dm(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2) {
        this.f43163a = provider;
        this.f43164b = provider2;
    }

    /* renamed from: a */
    public cz m52748a() {
        return m52746a(this.f43163a, this.f43164b);
    }

    /* renamed from: a */
    public static cz m52746a(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2) {
        return new cz((C9965a) provider.get(), (OnboardingAnalyticsInteractor) provider2.get());
    }

    /* renamed from: b */
    public static dm m52747b(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2) {
        return new dm(provider, provider2);
    }
}
