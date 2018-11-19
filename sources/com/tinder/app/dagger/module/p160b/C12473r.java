package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.r */
public final class C12473r implements Factory<C11811o> {
    /* renamed from: a */
    private final C8245a f40233a;
    /* renamed from: b */
    private final Provider<FireboardingEnabledRepository> f40234b;

    public /* synthetic */ Object get() {
        return m49067a();
    }

    public C12473r(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        this.f40233a = c8245a;
        this.f40234b = provider;
    }

    /* renamed from: a */
    public C11811o m49067a() {
        return C12473r.m49065a(this.f40233a, this.f40234b);
    }

    /* renamed from: a */
    public static C11811o m49065a(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        return C12473r.m49064a(c8245a, (FireboardingEnabledRepository) provider.get());
    }

    /* renamed from: b */
    public static C12473r m49066b(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        return new C12473r(c8245a, provider);
    }

    /* renamed from: a */
    public static C11811o m49064a(C8245a c8245a, FireboardingEnabledRepository fireboardingEnabledRepository) {
        return (C11811o) C15521i.a(c8245a.m35179b(fireboardingEnabledRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
