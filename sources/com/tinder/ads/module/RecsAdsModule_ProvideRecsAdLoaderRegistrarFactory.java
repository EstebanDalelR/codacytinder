package com.tinder.ads.module;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.source.fan.FanAdLoader.C6190a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.recsads.C16470o;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.p467b.C16451a;
import com.tinder.recsads.p467b.C16452c;
import com.tinder.recsads.p467b.C16453e;
import com.tinder.recsads.p467b.C16454g;
import com.tinder.recsads.p467b.C16455i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory implements Factory<C16470o> {
    private final Provider<AdAggregator> adAggregatorProvider;
    private final Provider<RecsAdsConfig> adsConfigProvider;
    private final Provider<C16451a> brandedProfileCardAdFactoryProvider;
    private final Provider<C6190a> fanAdLoaderBuilderProvider;
    private final Provider<C6191a> nativeDfpLoaderBuilderProvider;
    private final Provider<PublisherAdRequestFactory> publisherAdRequestFactoryProvider;
    private final Provider<C16452c> recsFanAdFactoryProvider;
    private final Provider<C16453e> recsFanVideoAdFactoryProvider;
    private final Provider<C16454g> recsNativeDisplayAFactoryProvider;
    private final Provider<C16455i> recsNativeVideoAdFactoryProvider;

    public RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory(Provider<RecsAdsConfig> provider, Provider<AdAggregator> provider2, Provider<C16451a> provider3, Provider<C6191a> provider4, Provider<C6190a> provider5, Provider<C16455i> provider6, Provider<C16453e> provider7, Provider<C16452c> provider8, Provider<C16454g> provider9, Provider<PublisherAdRequestFactory> provider10) {
        this.adsConfigProvider = provider;
        this.adAggregatorProvider = provider2;
        this.brandedProfileCardAdFactoryProvider = provider3;
        this.nativeDfpLoaderBuilderProvider = provider4;
        this.fanAdLoaderBuilderProvider = provider5;
        this.recsNativeVideoAdFactoryProvider = provider6;
        this.recsFanVideoAdFactoryProvider = provider7;
        this.recsFanAdFactoryProvider = provider8;
        this.recsNativeDisplayAFactoryProvider = provider9;
        this.publisherAdRequestFactoryProvider = provider10;
    }

    public C16470o get() {
        return provideInstance(this.adsConfigProvider, this.adAggregatorProvider, this.brandedProfileCardAdFactoryProvider, this.nativeDfpLoaderBuilderProvider, this.fanAdLoaderBuilderProvider, this.recsNativeVideoAdFactoryProvider, this.recsFanVideoAdFactoryProvider, this.recsFanAdFactoryProvider, this.recsNativeDisplayAFactoryProvider, this.publisherAdRequestFactoryProvider);
    }

    public static C16470o provideInstance(Provider<RecsAdsConfig> provider, Provider<AdAggregator> provider2, Provider<C16451a> provider3, Provider<C6191a> provider4, Provider<C6190a> provider5, Provider<C16455i> provider6, Provider<C16453e> provider7, Provider<C16452c> provider8, Provider<C16454g> provider9, Provider<PublisherAdRequestFactory> provider10) {
        return proxyProvideRecsAdLoaderRegistrar((RecsAdsConfig) provider.get(), (AdAggregator) provider2.get(), (C16451a) provider3.get(), provider4, provider5, (C16455i) provider6.get(), (C16453e) provider7.get(), (C16452c) provider8.get(), (C16454g) provider9.get(), (PublisherAdRequestFactory) provider10.get());
    }

    public static RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory create(Provider<RecsAdsConfig> provider, Provider<AdAggregator> provider2, Provider<C16451a> provider3, Provider<C6191a> provider4, Provider<C6190a> provider5, Provider<C16455i> provider6, Provider<C16453e> provider7, Provider<C16452c> provider8, Provider<C16454g> provider9, Provider<PublisherAdRequestFactory> provider10) {
        return new RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static C16470o proxyProvideRecsAdLoaderRegistrar(RecsAdsConfig recsAdsConfig, AdAggregator adAggregator, C16451a c16451a, Provider<C6191a> provider, Provider<C6190a> provider2, C16455i c16455i, C16453e c16453e, C16452c c16452c, C16454g c16454g, PublisherAdRequestFactory publisherAdRequestFactory) {
        return (C16470o) C15521i.a(RecsAdsModule.provideRecsAdLoaderRegistrar(recsAdsConfig, adAggregator, c16451a, provider, provider2, c16455i, c16453e, c16452c, c16454g, publisherAdRequestFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
