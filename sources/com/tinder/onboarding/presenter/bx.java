package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingExperiments;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bx implements Factory<bt> {
    /* renamed from: a */
    private final Provider<OnboardingExperiments> f43147a;

    public /* synthetic */ Object get() {
        return m52705a();
    }

    public bx(Provider<OnboardingExperiments> provider) {
        this.f43147a = provider;
    }

    /* renamed from: a */
    public bt m52705a() {
        return m52703a(this.f43147a);
    }

    /* renamed from: a */
    public static bt m52703a(Provider<OnboardingExperiments> provider) {
        return new bt((OnboardingExperiments) provider.get());
    }

    /* renamed from: b */
    public static bx m52704b(Provider<OnboardingExperiments> provider) {
        return new bx(provider);
    }
}
