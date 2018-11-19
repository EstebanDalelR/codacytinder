package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11824u;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.y */
public final class C12480y implements Factory<C11824u> {
    /* renamed from: a */
    private final C8245a f40251a;
    /* renamed from: b */
    private final Provider<FireboardingEnabledRepository> f40252b;

    public /* synthetic */ Object get() {
        return m49094a();
    }

    public C12480y(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        this.f40251a = c8245a;
        this.f40252b = provider;
    }

    /* renamed from: a */
    public C11824u m49094a() {
        return C12480y.m49092a(this.f40251a, this.f40252b);
    }

    /* renamed from: a */
    public static C11824u m49092a(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        return C12480y.m49091a(c8245a, (FireboardingEnabledRepository) provider.get());
    }

    /* renamed from: b */
    public static C12480y m49093b(C8245a c8245a, Provider<FireboardingEnabledRepository> provider) {
        return new C12480y(c8245a, provider);
    }

    /* renamed from: a */
    public static C11824u m49091a(C8245a c8245a, FireboardingEnabledRepository fireboardingEnabledRepository) {
        return (C11824u) C15521i.a(c8245a.m35173a(fireboardingEnabledRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
