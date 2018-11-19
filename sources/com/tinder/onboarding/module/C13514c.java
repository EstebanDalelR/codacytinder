package com.tinder.onboarding.module;

import com.tinder.onboarding.C12162c;
import com.tinder.onboarding.repository.OnboardingErrorHandler;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.c */
public final class C13514c implements Factory<OnboardingErrorHandler> {
    /* renamed from: a */
    private final C2655a f43107a;
    /* renamed from: b */
    private final Provider<C12162c> f43108b;

    public /* synthetic */ Object get() {
        return m52635a();
    }

    public C13514c(C2655a c2655a, Provider<C12162c> provider) {
        this.f43107a = c2655a;
        this.f43108b = provider;
    }

    /* renamed from: a */
    public OnboardingErrorHandler m52635a() {
        return C13514c.m52633a(this.f43107a, this.f43108b);
    }

    /* renamed from: a */
    public static OnboardingErrorHandler m52633a(C2655a c2655a, Provider<C12162c> provider) {
        return C13514c.m52632a(c2655a, (C12162c) provider.get());
    }

    /* renamed from: b */
    public static C13514c m52634b(C2655a c2655a, Provider<C12162c> provider) {
        return new C13514c(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingErrorHandler m52632a(C2655a c2655a, C12162c c12162c) {
        return (OnboardingErrorHandler) C15521i.a(c2655a.a(c12162c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
