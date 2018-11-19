package com.snapchat.kit.sdk.login.p150a;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.login.a.b */
public final class C7934b implements Factory<C5954a> {
    /* renamed from: a */
    private final Provider<MetricQueue<OpMetric>> f28530a;

    public /* synthetic */ Object get() {
        return m33786a();
    }

    public C7934b(Provider<MetricQueue<OpMetric>> provider) {
        this.f28530a = provider;
    }

    /* renamed from: a */
    public C5954a m33786a() {
        return new C5954a((MetricQueue) this.f28530a.get());
    }

    /* renamed from: a */
    public static Factory<C5954a> m33785a(Provider<MetricQueue<OpMetric>> provider) {
        return new C7934b(provider);
    }
}
