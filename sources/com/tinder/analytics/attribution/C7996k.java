package com.tinder.analytics.attribution;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.attribution.k */
public final class C7996k implements Factory<C3916g> {
    /* renamed from: a */
    private final Provider<AttributionTracker> f28609a;
    /* renamed from: b */
    private final Provider<g$a> f28610b;

    public /* synthetic */ Object get() {
        return m33879a();
    }

    public C7996k(Provider<AttributionTracker> provider, Provider<g$a> provider2) {
        this.f28609a = provider;
        this.f28610b = provider2;
    }

    /* renamed from: a */
    public C3916g m33879a() {
        return C7996k.m33877a(this.f28609a, this.f28610b);
    }

    /* renamed from: a */
    public static C3916g m33877a(Provider<AttributionTracker> provider, Provider<g$a> provider2) {
        return new C3916g((AttributionTracker) provider.get(), (g$a) provider2.get());
    }

    /* renamed from: b */
    public static C7996k m33878b(Provider<AttributionTracker> provider, Provider<g$a> provider2) {
        return new C7996k(provider, provider2);
    }
}
