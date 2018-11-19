package com.tinder.onboarding.module;

import com.tinder.onboarding.repository.C12187s;
import com.tinder.onboarding.repository.OnboardingUserRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.h */
public final class C13519h implements Factory<OnboardingUserRepository> {
    /* renamed from: a */
    private final C2655a f43118a;
    /* renamed from: b */
    private final Provider<C12187s> f43119b;

    public /* synthetic */ Object get() {
        return m52655a();
    }

    public C13519h(C2655a c2655a, Provider<C12187s> provider) {
        this.f43118a = c2655a;
        this.f43119b = provider;
    }

    /* renamed from: a */
    public OnboardingUserRepository m52655a() {
        return C13519h.m52653a(this.f43118a, this.f43119b);
    }

    /* renamed from: a */
    public static OnboardingUserRepository m52653a(C2655a c2655a, Provider<C12187s> provider) {
        return C13519h.m52652a(c2655a, (C12187s) provider.get());
    }

    /* renamed from: b */
    public static C13519h m52654b(C2655a c2655a, Provider<C12187s> provider) {
        return new C13519h(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingUserRepository m52652a(C2655a c2655a, C12187s c12187s) {
        return (OnboardingUserRepository) C15521i.a(c2655a.a(c12187s), "Cannot return null from a non-@Nullable @Provides method");
    }
}
