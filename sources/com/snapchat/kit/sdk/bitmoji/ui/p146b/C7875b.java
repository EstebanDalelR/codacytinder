package com.snapchat.kit.sdk.bitmoji.ui.p146b;

import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.b.b */
public final class C7875b implements Factory<C5911a> {
    /* renamed from: a */
    private final Provider<C5885a> f28417a;
    /* renamed from: b */
    private final Provider<MetricQueue<ServerEvent>> f28418b;

    public /* synthetic */ Object get() {
        return m33696a();
    }

    public C7875b(Provider<C5885a> provider, Provider<MetricQueue<ServerEvent>> provider2) {
        this.f28417a = provider;
        this.f28418b = provider2;
    }

    /* renamed from: a */
    public C5911a m33696a() {
        return new C5911a((C5885a) this.f28417a.get(), (MetricQueue) this.f28418b.get());
    }

    /* renamed from: a */
    public static Factory<C5911a> m33695a(Provider<C5885a> provider, Provider<MetricQueue<ServerEvent>> provider2) {
        return new C7875b(provider, provider2);
    }
}
