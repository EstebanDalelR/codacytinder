package com.tinder.onboarding.repository;

import com.google.gson.Gson;
import com.tinder.domain.OnboardingTokenProvider;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.onboarding.model.OnboardingExperiments;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ar implements Factory<C12187s> {
    /* renamed from: a */
    private final Provider<OnboardingService> f43217a;
    /* renamed from: b */
    private final Provider<C9986a> f43218b;
    /* renamed from: c */
    private final Provider<OnboardingTokenProvider> f43219c;
    /* renamed from: d */
    private final Provider<UniqueIdFactory> f43220d;
    /* renamed from: e */
    private final Provider<Gson> f43221e;
    /* renamed from: f */
    private final Provider<OnboardingErrorHandler> f43222f;
    /* renamed from: g */
    private final Provider<OnboardingExperiments> f43223g;

    public /* synthetic */ Object get() {
        return m52889a();
    }

    public ar(Provider<OnboardingService> provider, Provider<C9986a> provider2, Provider<OnboardingTokenProvider> provider3, Provider<UniqueIdFactory> provider4, Provider<Gson> provider5, Provider<OnboardingErrorHandler> provider6, Provider<OnboardingExperiments> provider7) {
        this.f43217a = provider;
        this.f43218b = provider2;
        this.f43219c = provider3;
        this.f43220d = provider4;
        this.f43221e = provider5;
        this.f43222f = provider6;
        this.f43223g = provider7;
    }

    /* renamed from: a */
    public C12187s m52889a() {
        return m52887a(this.f43217a, this.f43218b, this.f43219c, this.f43220d, this.f43221e, this.f43222f, this.f43223g);
    }

    /* renamed from: a */
    public static C12187s m52887a(Provider<OnboardingService> provider, Provider<C9986a> provider2, Provider<OnboardingTokenProvider> provider3, Provider<UniqueIdFactory> provider4, Provider<Gson> provider5, Provider<OnboardingErrorHandler> provider6, Provider<OnboardingExperiments> provider7) {
        return new C12187s((OnboardingService) provider.get(), (C9986a) provider2.get(), (OnboardingTokenProvider) provider3.get(), (UniqueIdFactory) provider4.get(), (Gson) provider5.get(), (OnboardingErrorHandler) provider6.get(), (OnboardingExperiments) provider7.get());
    }

    /* renamed from: b */
    public static ar m52888b(Provider<OnboardingService> provider, Provider<C9986a> provider2, Provider<OnboardingTokenProvider> provider3, Provider<UniqueIdFactory> provider4, Provider<Gson> provider5, Provider<OnboardingErrorHandler> provider6, Provider<OnboardingExperiments> provider7) {
        return new ar(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
