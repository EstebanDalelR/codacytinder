package com.tinder.onboarding.presenter;

import com.tinder.domain.auth.usecase.MaskEmail;
import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bs implements Factory<C13526y> {
    /* renamed from: a */
    private final Provider<C9965a> f43143a;
    /* renamed from: b */
    private final Provider<OnboardingAnalyticsInteractor> f43144b;
    /* renamed from: c */
    private final Provider<RegexEmailValidator> f43145c;
    /* renamed from: d */
    private final Provider<MaskEmail> f43146d;

    public /* synthetic */ Object get() {
        return m52702a();
    }

    public bs(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<RegexEmailValidator> provider3, Provider<MaskEmail> provider4) {
        this.f43143a = provider;
        this.f43144b = provider2;
        this.f43145c = provider3;
        this.f43146d = provider4;
    }

    /* renamed from: a */
    public C13526y m52702a() {
        return m52700a(this.f43143a, this.f43144b, this.f43145c, this.f43146d);
    }

    /* renamed from: a */
    public static C13526y m52700a(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<RegexEmailValidator> provider3, Provider<MaskEmail> provider4) {
        return new C13526y((C9965a) provider.get(), (OnboardingAnalyticsInteractor) provider2.get(), (RegexEmailValidator) provider3.get(), (MaskEmail) provider4.get());
    }

    /* renamed from: b */
    public static bs m52701b(Provider<C9965a> provider, Provider<OnboardingAnalyticsInteractor> provider2, Provider<RegexEmailValidator> provider3, Provider<MaskEmail> provider4) {
        return new bs(provider, provider2, provider3, provider4);
    }
}
