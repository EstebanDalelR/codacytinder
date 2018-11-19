package com.tinder.module;

import com.tinder.ads.AdAggregator;
import com.tinder.ads.AdAggregator.Builder;
import com.tinder.ads.SourceMediator;
import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.u */
public final class C13500u implements Factory<AdAggregator> {
    /* renamed from: a */
    private final C9940d f43076a;
    /* renamed from: b */
    private final Provider<Builder> f43077b;
    /* renamed from: c */
    private final Provider<SourceMediator> f43078c;
    /* renamed from: d */
    private final Provider<SubscriptionProvider> f43079d;

    public /* synthetic */ Object get() {
        return m52591a();
    }

    public C13500u(C9940d c9940d, Provider<Builder> provider, Provider<SourceMediator> provider2, Provider<SubscriptionProvider> provider3) {
        this.f43076a = c9940d;
        this.f43077b = provider;
        this.f43078c = provider2;
        this.f43079d = provider3;
    }

    /* renamed from: a */
    public AdAggregator m52591a() {
        return C13500u.m52589a(this.f43076a, this.f43077b, this.f43078c, this.f43079d);
    }

    /* renamed from: a */
    public static AdAggregator m52589a(C9940d c9940d, Provider<Builder> provider, Provider<SourceMediator> provider2, Provider<SubscriptionProvider> provider3) {
        return C13500u.m52588a(c9940d, (Builder) provider.get(), (SourceMediator) provider2.get(), (SubscriptionProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13500u m52590b(C9940d c9940d, Provider<Builder> provider, Provider<SourceMediator> provider2, Provider<SubscriptionProvider> provider3) {
        return new C13500u(c9940d, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static AdAggregator m52588a(C9940d c9940d, Builder builder, SourceMediator sourceMediator, SubscriptionProvider subscriptionProvider) {
        return (AdAggregator) C15521i.a(c9940d.m40858a(builder, sourceMediator, subscriptionProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
