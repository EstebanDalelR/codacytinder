package com.tinder.onboarding.module;

import com.tinder.auth.interactor.C10333h;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.b */
public final class C13513b implements Factory<OnboardingAnalyticsInteractor> {
    /* renamed from: a */
    private final C2655a f43105a;
    /* renamed from: b */
    private final Provider<C10333h> f43106b;

    public /* synthetic */ Object get() {
        return m52631a();
    }

    public C13513b(C2655a c2655a, Provider<C10333h> provider) {
        this.f43105a = c2655a;
        this.f43106b = provider;
    }

    /* renamed from: a */
    public OnboardingAnalyticsInteractor m52631a() {
        return C13513b.m52629a(this.f43105a, this.f43106b);
    }

    /* renamed from: a */
    public static OnboardingAnalyticsInteractor m52629a(C2655a c2655a, Provider<C10333h> provider) {
        return C13513b.m52628a(c2655a, (C10333h) provider.get());
    }

    /* renamed from: b */
    public static C13513b m52630b(C2655a c2655a, Provider<C10333h> provider) {
        return new C13513b(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingAnalyticsInteractor m52628a(C2655a c2655a, C10333h c10333h) {
        return (OnboardingAnalyticsInteractor) C15521i.a(c2655a.a(c10333h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
