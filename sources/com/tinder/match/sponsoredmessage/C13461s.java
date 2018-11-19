package com.tinder.match.sponsoredmessage;

import com.tinder.ads.AdAggregator;
import com.tinder.ads.analytics.V1AnalyticsAdAggregatorListener;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor.C12080a;
import com.tinder.sponsoredmessage.C15032a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.s */
public final class C13461s implements Factory<V1SponsoredMessageAdMonitor> {
    /* renamed from: a */
    private final Provider<AdAggregator> f42686a;
    /* renamed from: b */
    private final Provider<C12080a> f42687b;
    /* renamed from: c */
    private final Provider<V1AnalyticsAdAggregatorListener> f42688c;
    /* renamed from: d */
    private final Provider<ViewedSponsoredMessageCache> f42689d;
    /* renamed from: e */
    private final Provider<C15032a> f42690e;
    /* renamed from: f */
    private final Provider<SubscriptionProvider> f42691f;

    public /* synthetic */ Object get() {
        return m51991a();
    }

    public C13461s(Provider<AdAggregator> provider, Provider<C12080a> provider2, Provider<V1AnalyticsAdAggregatorListener> provider3, Provider<ViewedSponsoredMessageCache> provider4, Provider<C15032a> provider5, Provider<SubscriptionProvider> provider6) {
        this.f42686a = provider;
        this.f42687b = provider2;
        this.f42688c = provider3;
        this.f42689d = provider4;
        this.f42690e = provider5;
        this.f42691f = provider6;
    }

    /* renamed from: a */
    public V1SponsoredMessageAdMonitor m51991a() {
        return C13461s.m51989a(this.f42686a, this.f42687b, this.f42688c, this.f42689d, this.f42690e, this.f42691f);
    }

    /* renamed from: a */
    public static V1SponsoredMessageAdMonitor m51989a(Provider<AdAggregator> provider, Provider<C12080a> provider2, Provider<V1AnalyticsAdAggregatorListener> provider3, Provider<ViewedSponsoredMessageCache> provider4, Provider<C15032a> provider5, Provider<SubscriptionProvider> provider6) {
        return new V1SponsoredMessageAdMonitor((AdAggregator) provider.get(), (C12080a) provider2.get(), (V1AnalyticsAdAggregatorListener) provider3.get(), (ViewedSponsoredMessageCache) provider4.get(), (C15032a) provider5.get(), (SubscriptionProvider) provider6.get());
    }

    /* renamed from: b */
    public static C13461s m51990b(Provider<AdAggregator> provider, Provider<C12080a> provider2, Provider<V1AnalyticsAdAggregatorListener> provider3, Provider<ViewedSponsoredMessageCache> provider4, Provider<C15032a> provider5, Provider<SubscriptionProvider> provider6) {
        return new C13461s(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
