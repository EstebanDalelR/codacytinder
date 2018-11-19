package com.tinder.onboarding.module;

import com.tinder.common.repository.C10698c;
import com.tinder.domain.OnboardingTokenProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.g */
public final class C13518g implements Factory<OnboardingTokenProvider> {
    /* renamed from: a */
    private final C2655a f43116a;
    /* renamed from: b */
    private final Provider<C10698c> f43117b;

    public /* synthetic */ Object get() {
        return m52651a();
    }

    public C13518g(C2655a c2655a, Provider<C10698c> provider) {
        this.f43116a = c2655a;
        this.f43117b = provider;
    }

    /* renamed from: a */
    public OnboardingTokenProvider m52651a() {
        return C13518g.m52649a(this.f43116a, this.f43117b);
    }

    /* renamed from: a */
    public static OnboardingTokenProvider m52649a(C2655a c2655a, Provider<C10698c> provider) {
        return C13518g.m52648a(c2655a, (C10698c) provider.get());
    }

    /* renamed from: b */
    public static C13518g m52650b(C2655a c2655a, Provider<C10698c> provider) {
        return new C13518g(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingTokenProvider m52648a(C2655a c2655a, C10698c c10698c) {
        return (OnboardingTokenProvider) C15521i.a(c2655a.a(c10698c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
