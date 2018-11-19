package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.presenter.w */
public final class C13524w implements Factory<BirthdayStepPresenter> {
    /* renamed from: a */
    private final Provider<C9965a> f43197a;
    /* renamed from: b */
    private final Provider<OnboardingAnalyticsInteractor> f43198b;
    /* renamed from: c */
    private final Provider<C9974a> f43199c;

    public /* synthetic */ Object get() {
        return m52843a();
    }

    public C13524w(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<C9974a> provider3) {
        this.f43197a = provider;
        this.f43198b = provider2;
        this.f43199c = provider3;
    }

    /* renamed from: a */
    public BirthdayStepPresenter m52843a() {
        return C13524w.m52841a(this.f43197a, this.f43198b, this.f43199c);
    }

    /* renamed from: a */
    public static BirthdayStepPresenter m52841a(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<C9974a> provider3) {
        return new BirthdayStepPresenter((C9965a) provider.get(), (OnboardingAnalyticsInteractor) provider2.get(), (C9974a) provider3.get());
    }

    /* renamed from: b */
    public static C13524w m52842b(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<C9974a> provider3) {
        return new C13524w(provider, provider2, provider3);
    }
}
