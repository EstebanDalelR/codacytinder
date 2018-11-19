package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.internal.Factory;
import java.util.Random;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.b */
public final class C7848b implements Factory<C5890a> {
    /* renamed from: a */
    private final Provider<MetricQueue<OpMetric>> f28339a;
    /* renamed from: b */
    private final Provider<Random> f28340b;

    public /* synthetic */ Object get() {
        return m33629a();
    }

    public C7848b(Provider<MetricQueue<OpMetric>> provider, Provider<Random> provider2) {
        this.f28339a = provider;
        this.f28340b = provider2;
    }

    /* renamed from: a */
    public C5890a m33629a() {
        return new C5890a((MetricQueue) this.f28339a.get(), (Random) this.f28340b.get());
    }

    /* renamed from: a */
    public static Factory<C5890a> m33628a(Provider<MetricQueue<OpMetric>> provider, Provider<Random> provider2) {
        return new C7848b(provider, provider2);
    }
}
