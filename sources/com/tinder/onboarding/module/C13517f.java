package com.tinder.onboarding.module;

import com.tinder.api.EnvironmentProvider;
import com.tinder.onboarding.repository.OnboardingService;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.onboarding.module.f */
public final class C13517f implements Factory<OnboardingService> {
    /* renamed from: a */
    private final C2655a f43113a;
    /* renamed from: b */
    private final Provider<C17692o> f43114b;
    /* renamed from: c */
    private final Provider<EnvironmentProvider> f43115c;

    public /* synthetic */ Object get() {
        return m52647a();
    }

    public C13517f(C2655a c2655a, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2) {
        this.f43113a = c2655a;
        this.f43114b = provider;
        this.f43115c = provider2;
    }

    /* renamed from: a */
    public OnboardingService m52647a() {
        return C13517f.m52644a(this.f43113a, this.f43114b, this.f43115c);
    }

    /* renamed from: a */
    public static OnboardingService m52644a(C2655a c2655a, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2) {
        return C13517f.m52645a(c2655a, (C17692o) provider.get(), (EnvironmentProvider) provider2.get());
    }

    /* renamed from: b */
    public static C13517f m52646b(C2655a c2655a, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2) {
        return new C13517f(c2655a, provider, provider2);
    }

    /* renamed from: a */
    public static OnboardingService m52645a(C2655a c2655a, C17692o c17692o, EnvironmentProvider environmentProvider) {
        return (OnboardingService) C15521i.a(c2655a.a(c17692o, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
