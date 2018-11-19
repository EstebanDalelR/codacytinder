package com.snapchat.kit.sdk.core.metrics;

import android.os.Handler;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p148a.C7139a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.f */
public final class C7895f implements Factory<MetricQueue<OpMetric>> {
    /* renamed from: a */
    private final Provider<C7139a> f28496a;
    /* renamed from: b */
    private final Provider<Handler> f28497b;

    public /* synthetic */ Object get() {
        return m33757a();
    }

    public C7895f(Provider<C7139a> provider, Provider<Handler> provider2) {
        this.f28496a = provider;
        this.f28497b = provider2;
    }

    /* renamed from: a */
    public MetricQueue<OpMetric> m33757a() {
        return (MetricQueue) C15521i.a(C5942c.m25542a((C7139a) this.f28496a.get(), (Handler) this.f28497b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<MetricQueue<OpMetric>> m33756a(Provider<C7139a> provider, Provider<Handler> provider2) {
        return new C7895f(provider, provider2);
    }
}
