package com.tinder.onboarding.module;

import com.tinder.onboarding.C12168e;
import com.tinder.onboarding.model.OnboardingPermissions;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.module.e */
public final class C13516e implements Factory<OnboardingPermissions> {
    /* renamed from: a */
    private final C2655a f43111a;
    /* renamed from: b */
    private final Provider<C12168e> f43112b;

    public /* synthetic */ Object get() {
        return m52643a();
    }

    public C13516e(C2655a c2655a, Provider<C12168e> provider) {
        this.f43111a = c2655a;
        this.f43112b = provider;
    }

    /* renamed from: a */
    public OnboardingPermissions m52643a() {
        return C13516e.m52641a(this.f43111a, this.f43112b);
    }

    /* renamed from: a */
    public static OnboardingPermissions m52641a(C2655a c2655a, Provider<C12168e> provider) {
        return C13516e.m52640a(c2655a, (C12168e) provider.get());
    }

    /* renamed from: b */
    public static C13516e m52642b(C2655a c2655a, Provider<C12168e> provider) {
        return new C13516e(c2655a, provider);
    }

    /* renamed from: a */
    public static OnboardingPermissions m52640a(C2655a c2655a, C12168e c12168e) {
        return (OnboardingPermissions) C15521i.a(c2655a.a(c12168e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
