package com.tinder.module;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.ads.AdAggregator$Listener;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.module.v */
public final class C13501v implements Factory<RecsAdsMonitor> {
    /* renamed from: a */
    private final C9940d f43080a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f43081b;
    /* renamed from: c */
    private final Provider<AdAggregator> f43082c;
    /* renamed from: d */
    private final Provider<LoadProfileOptionData> f43083d;
    /* renamed from: e */
    private final Provider<com.tinder.ads.AdAggregator> f43084e;
    /* renamed from: f */
    private final Provider<SubscriptionProvider> f43085f;
    /* renamed from: g */
    private final Provider<Set<AdAggregator$Listener>> f43086g;
    /* renamed from: h */
    private final Provider<Set<Listener>> f43087h;
    /* renamed from: i */
    private final Provider<RecsAdsConfig> f43088i;

    public /* synthetic */ Object get() {
        return m52595a();
    }

    public C13501v(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<LoadProfileOptionData> provider3, Provider<com.tinder.ads.AdAggregator> provider4, Provider<SubscriptionProvider> provider5, Provider<Set<AdAggregator$Listener>> provider6, Provider<Set<Listener>> provider7, Provider<RecsAdsConfig> provider8) {
        this.f43080a = c9940d;
        this.f43081b = provider;
        this.f43082c = provider2;
        this.f43083d = provider3;
        this.f43084e = provider4;
        this.f43085f = provider5;
        this.f43086g = provider6;
        this.f43087h = provider7;
        this.f43088i = provider8;
    }

    /* renamed from: a */
    public RecsAdsMonitor m52595a() {
        return C13501v.m52593a(this.f43080a, this.f43081b, this.f43082c, this.f43083d, this.f43084e, this.f43085f, this.f43086g, this.f43087h, this.f43088i);
    }

    /* renamed from: a */
    public static RecsAdsMonitor m52593a(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<LoadProfileOptionData> provider3, Provider<com.tinder.ads.AdAggregator> provider4, Provider<SubscriptionProvider> provider5, Provider<Set<AdAggregator$Listener>> provider6, Provider<Set<Listener>> provider7, Provider<RecsAdsConfig> provider8) {
        return C13501v.m52592a(c9940d, (AbTestUtility) provider.get(), (AdAggregator) provider2.get(), (LoadProfileOptionData) provider3.get(), (com.tinder.ads.AdAggregator) provider4.get(), (SubscriptionProvider) provider5.get(), (Set) provider6.get(), (Set) provider7.get(), (RecsAdsConfig) provider8.get());
    }

    /* renamed from: b */
    public static C13501v m52594b(C9940d c9940d, Provider<AbTestUtility> provider, Provider<AdAggregator> provider2, Provider<LoadProfileOptionData> provider3, Provider<com.tinder.ads.AdAggregator> provider4, Provider<SubscriptionProvider> provider5, Provider<Set<AdAggregator$Listener>> provider6, Provider<Set<Listener>> provider7, Provider<RecsAdsConfig> provider8) {
        return new C13501v(c9940d, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: a */
    public static RecsAdsMonitor m52592a(C9940d c9940d, AbTestUtility abTestUtility, AdAggregator adAggregator, LoadProfileOptionData loadProfileOptionData, com.tinder.ads.AdAggregator adAggregator2, SubscriptionProvider subscriptionProvider, Set<AdAggregator$Listener> set, Set<Listener> set2, RecsAdsConfig recsAdsConfig) {
        return (RecsAdsMonitor) C15521i.a(c9940d.m40863a(abTestUtility, adAggregator, loadProfileOptionData, adAggregator2, subscriptionProvider, set, set2, recsAdsConfig), "Cannot return null from a non-@Nullable @Provides method");
    }
}
