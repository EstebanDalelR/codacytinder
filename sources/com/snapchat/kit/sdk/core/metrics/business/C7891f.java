package com.snapchat.kit.sdk.core.metrics.business;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.f */
public final class C7891f implements Factory<C5940e> {
    /* renamed from: a */
    private final Provider<KitEventBaseFactory> f28491a;

    public /* synthetic */ Object get() {
        return m33748a();
    }

    public C7891f(Provider<KitEventBaseFactory> provider) {
        this.f28491a = provider;
    }

    /* renamed from: a */
    public C5940e m33748a() {
        return new C5940e((KitEventBaseFactory) this.f28491a.get());
    }

    /* renamed from: a */
    public static Factory<C5940e> m33747a(Provider<KitEventBaseFactory> provider) {
        return new C7891f(provider);
    }
}
