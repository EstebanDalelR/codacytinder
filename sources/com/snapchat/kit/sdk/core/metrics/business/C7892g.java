package com.snapchat.kit.sdk.core.metrics.business;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.g */
public final class C7892g implements Factory<KitEventBaseFactory> {
    /* renamed from: a */
    private final Provider<String> f28492a;

    public /* synthetic */ Object get() {
        return m33751a();
    }

    public C7892g(Provider<String> provider) {
        this.f28492a = provider;
    }

    /* renamed from: a */
    public KitEventBaseFactory m33751a() {
        return new KitEventBaseFactory((String) this.f28492a.get());
    }

    /* renamed from: a */
    public static Factory<KitEventBaseFactory> m33750a(Provider<String> provider) {
        return new C7892g(provider);
    }

    /* renamed from: a */
    public static KitEventBaseFactory m33749a(String str) {
        return new KitEventBaseFactory(str);
    }
}
