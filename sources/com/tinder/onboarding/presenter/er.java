package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingExperiments;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class er implements Factory<dn> {
    /* renamed from: a */
    private final Provider<C9965a> f43174a;
    /* renamed from: b */
    private final Provider<OnboardingAnalyticsInteractor> f43175b;
    /* renamed from: c */
    private final Provider<OnboardingExperiments> f43176c;
    /* renamed from: d */
    private final Provider<bt> f43177d;

    public /* synthetic */ Object get() {
        return m52794a();
    }

    public er(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<OnboardingExperiments> provider3, Provider<bt> provider4) {
        this.f43174a = provider;
        this.f43175b = provider2;
        this.f43176c = provider3;
        this.f43177d = provider4;
    }

    /* renamed from: a */
    public dn m52794a() {
        return m52792a(this.f43174a, this.f43175b, this.f43176c, this.f43177d);
    }

    /* renamed from: a */
    public static dn m52792a(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<OnboardingExperiments> provider3, Provider<bt> provider4) {
        return new dn((C9965a) provider.get(), (OnboardingAnalyticsInteractor) provider2.get(), (OnboardingExperiments) provider3.get(), (bt) provider4.get());
    }

    /* renamed from: b */
    public static er m52793b(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<OnboardingExperiments> provider3, Provider<bt> provider4) {
        return new er(provider, provider2, provider3, provider4);
    }
}
