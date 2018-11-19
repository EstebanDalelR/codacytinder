package com.tinder.module;

import com.tinder.addy.AdAggregator;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.rule.AdRecsInjector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.g */
public final class C13486g implements Factory<AdRecsInjector> {
    /* renamed from: a */
    private final C9940d f43034a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f43035b;
    /* renamed from: c */
    private final Provider<AdAggregator> f43036c;
    /* renamed from: d */
    private final Provider<com.tinder.ads.AdAggregator> f43037d;
    /* renamed from: e */
    private final Provider<RecsEngineRegistry> f43038e;
    /* renamed from: f */
    private final Provider<RecsAdsConfig> f43039f;

    public /* synthetic */ Object get() {
        return m52536a();
    }

    public C13486g(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<com.tinder.ads.AdAggregator> provider3, Provider<RecsEngineRegistry> provider4, Provider<RecsAdsConfig> provider5) {
        this.f43034a = c9940d;
        this.f43035b = provider;
        this.f43036c = provider2;
        this.f43037d = provider3;
        this.f43038e = provider4;
        this.f43039f = provider5;
    }

    /* renamed from: a */
    public AdRecsInjector m52536a() {
        return C13486g.m52534a(this.f43034a, this.f43035b, this.f43036c, this.f43037d, this.f43038e, this.f43039f);
    }

    /* renamed from: a */
    public static AdRecsInjector m52534a(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<com.tinder.ads.AdAggregator> provider3, Provider<RecsEngineRegistry> provider4, Provider<RecsAdsConfig> provider5) {
        return C13486g.m52533a(c9940d, (AbTestUtility) provider.get(), (AdAggregator) provider2.get(), (com.tinder.ads.AdAggregator) provider3.get(), (RecsEngineRegistry) provider4.get(), (RecsAdsConfig) provider5.get());
    }

    /* renamed from: b */
    public static C13486g m52535b(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<com.tinder.ads.AdAggregator> provider3, Provider<RecsEngineRegistry> provider4, Provider<RecsAdsConfig> provider5) {
        return new C13486g(c9940d, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static AdRecsInjector m52533a(C9940d c9940d, AbTestUtility abTestUtility, AdAggregator adAggregator, com.tinder.ads.AdAggregator adAggregator2, RecsEngineRegistry recsEngineRegistry, RecsAdsConfig recsAdsConfig) {
        return (AdRecsInjector) C15521i.a(c9940d.m40864a(abTestUtility, adAggregator, adAggregator2, recsEngineRegistry, recsAdsConfig), "Cannot return null from a non-@Nullable @Provides method");
    }
}
