package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.analytics.k */
public final class C13561k implements Factory<C10120j> {
    /* renamed from: a */
    private final Provider<C2630h> f43295a;

    public /* synthetic */ Object get() {
        return m52982a();
    }

    public C13561k(Provider<C2630h> provider) {
        this.f43295a = provider;
    }

    /* renamed from: a */
    public C10120j m52982a() {
        return C13561k.m52980a(this.f43295a);
    }

    /* renamed from: a */
    public static C10120j m52980a(Provider<C2630h> provider) {
        return new C10120j((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C13561k m52981b(Provider<C2630h> provider) {
        return new C13561k(provider);
    }
}
