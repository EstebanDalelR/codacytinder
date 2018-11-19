package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5886c;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.k */
public final class C7859k implements Factory<C5886c> {
    /* renamed from: a */
    private final C5897j f28361a;
    /* renamed from: b */
    private final Provider<MetricQueue<ServerEvent>> f28362b;
    /* renamed from: c */
    private final Provider<C5885a> f28363c;
    /* renamed from: d */
    private final Provider<C5887d> f28364d;
    /* renamed from: e */
    private final Provider<C5890a> f28365e;

    public /* synthetic */ Object get() {
        return m33651a();
    }

    public C7859k(C5897j c5897j, Provider<MetricQueue<ServerEvent>> provider, Provider<C5885a> provider2, Provider<C5887d> provider3, Provider<C5890a> provider4) {
        this.f28361a = c5897j;
        this.f28362b = provider;
        this.f28363c = provider2;
        this.f28364d = provider3;
        this.f28365e = provider4;
    }

    /* renamed from: a */
    public C5886c m33651a() {
        return (C5886c) C15521i.a(this.f28361a.m25448a((MetricQueue) this.f28362b.get(), (C5885a) this.f28363c.get(), (C5887d) this.f28364d.get(), (C5890a) this.f28365e.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5886c> m33650a(C5897j c5897j, Provider<MetricQueue<ServerEvent>> provider, Provider<C5885a> provider2, Provider<C5887d> provider3, Provider<C5890a> provider4) {
        return new C7859k(c5897j, provider, provider2, provider3, provider4);
    }
}
