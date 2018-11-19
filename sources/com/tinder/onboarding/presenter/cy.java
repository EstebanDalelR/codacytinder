package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingExperiments;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cy implements Factory<by> {
    /* renamed from: a */
    private final Provider<C9965a> f43157a;
    /* renamed from: b */
    private final Provider<OnboardingExperiments> f43158b;
    /* renamed from: c */
    private final Provider<OnboardingAnalyticsInteractor> f43159c;

    public /* synthetic */ Object get() {
        return m52731a();
    }

    public cy(Provider<C9965a> provider, Provider<OnboardingExperiments> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        this.f43157a = provider;
        this.f43158b = provider2;
        this.f43159c = provider3;
    }

    /* renamed from: a */
    public by m52731a() {
        return m52729a(this.f43157a, this.f43158b, this.f43159c);
    }

    /* renamed from: a */
    public static by m52729a(Provider<C9965a> provider, Provider<OnboardingExperiments> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        return new by((C9965a) provider.get(), (OnboardingExperiments) provider2.get(), (OnboardingAnalyticsInteractor) provider3.get());
    }

    /* renamed from: b */
    public static cy m52730b(Provider<C9965a> provider, Provider<OnboardingExperiments> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        return new cy(provider, provider2, provider3);
    }
}
