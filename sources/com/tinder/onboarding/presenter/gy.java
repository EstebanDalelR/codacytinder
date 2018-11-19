package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingPermissions;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class gy implements Factory<gm> {
    /* renamed from: a */
    private final Provider<C9965a> f43193a;
    /* renamed from: b */
    private final Provider<OnboardingPermissions> f43194b;
    /* renamed from: c */
    private final Provider<OnboardingAnalyticsInteractor> f43195c;

    public /* synthetic */ Object get() {
        return m52840a();
    }

    public gy(Provider<C9965a> provider, Provider<OnboardingPermissions> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        this.f43193a = provider;
        this.f43194b = provider2;
        this.f43195c = provider3;
    }

    /* renamed from: a */
    public gm m52840a() {
        return m52838a(this.f43193a, this.f43194b, this.f43195c);
    }

    /* renamed from: a */
    public static gm m52838a(Provider<C9965a> provider, Provider<OnboardingPermissions> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        return new gm((C9965a) provider.get(), (OnboardingPermissions) provider2.get(), (OnboardingAnalyticsInteractor) provider3.get());
    }

    /* renamed from: b */
    public static gy m52839b(Provider<C9965a> provider, Provider<OnboardingPermissions> provider2, Provider<OnboardingAnalyticsInteractor> provider3) {
        return new gy(provider, provider2, provider3);
    }
}
