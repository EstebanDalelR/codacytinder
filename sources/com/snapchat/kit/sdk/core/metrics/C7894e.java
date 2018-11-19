package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.networking.ClientFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.e */
public final class C7894e implements Factory<MetricsClient> {
    /* renamed from: a */
    private final Provider<ClientFactory> f28495a;

    public /* synthetic */ Object get() {
        return m33755a();
    }

    public C7894e(Provider<ClientFactory> provider) {
        this.f28495a = provider;
    }

    /* renamed from: a */
    public MetricsClient m33755a() {
        return (MetricsClient) C15521i.a(C5942c.m25543a((ClientFactory) this.f28495a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<MetricsClient> m33754a(Provider<ClientFactory> provider) {
        return new C7894e(provider);
    }
}
