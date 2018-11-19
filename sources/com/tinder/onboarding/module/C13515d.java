package com.tinder.onboarding.module;

import com.tinder.onboarding.C12154a;
import com.tinder.onboarding.model.OnboardingExperiments;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.d */
public final class C13515d implements Factory<OnboardingExperiments> {
    /* renamed from: a */
    private final C2655a f43109a;
    /* renamed from: b */
    private final Provider<C12154a> f43110b;

    public /* synthetic */ Object get() {
        return m52639a();
    }

    public C13515d(C2655a c2655a, Provider<C12154a> provider) {
        this.f43109a = c2655a;
        this.f43110b = provider;
    }

    /* renamed from: a */
    public OnboardingExperiments m52639a() {
        return C13515d.m52637a(this.f43109a, this.f43110b);
    }

    /* renamed from: a */
    public static OnboardingExperiments m52637a(C2655a c2655a, Provider<C12154a> provider) {
        return C13515d.m52636a(c2655a, (C12154a) provider.get());
    }

    /* renamed from: b */
    public static C13515d m52638b(C2655a c2655a, Provider<C12154a> provider) {
        return new C13515d(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingExperiments m52636a(C2655a c2655a, C12154a c12154a) {
        return (OnboardingExperiments) C15521i.a(c2655a.a(c12154a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
