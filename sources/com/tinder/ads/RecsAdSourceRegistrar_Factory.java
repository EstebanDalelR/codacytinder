package com.tinder.ads;

import com.tinder.ads.source.dfp.BannerDfpSource.Builder;
import com.tinder.ads.source.fan.FanSource;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdSourceRegistrar_Factory implements Factory<RecsAdSourceRegistrar> {
    private final Provider<AdAggregator> adAggregatorProvider;
    private final Provider<RecsAdsConfig> adsConfigProvider;
    private final Provider<V1BrandedProfileCardAd.Factory> brandedProfileCardFactoryProvider;
    private final Provider<DfpFieldsResolverImpl> dfpFieldsResolverProvider;
    private final Provider<Builder> dfpSourceBuilderProvider;
    private final Provider<RecsFanAd.Factory> fanAdFactoryProvider;
    private final Provider<FanSource.Builder> fanSourceBuilderProvider;
    private final Provider<NativeDfpSourceBuilderFactory> nativeDfpSourceBuilderFactoryProvider;
    private final Provider<RecsNativeDisplayAd.Factory> nativeDisplayAdFactoryProvider;
    private final Provider<RecsNativeVideoAd.Factory> nativeVideoAdFactoryProvider;

    public RecsAdSourceRegistrar_Factory(Provider<AdAggregator> provider, Provider<RecsAdsConfig> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<Builder> provider4, Provider<NativeDfpSourceBuilderFactory> provider5, Provider<RecsFanAd.Factory> provider6, Provider<RecsNativeVideoAd.Factory> provider7, Provider<RecsNativeDisplayAd.Factory> provider8, Provider<V1BrandedProfileCardAd.Factory> provider9, Provider<FanSource.Builder> provider10) {
        this.adAggregatorProvider = provider;
        this.adsConfigProvider = provider2;
        this.dfpFieldsResolverProvider = provider3;
        this.dfpSourceBuilderProvider = provider4;
        this.nativeDfpSourceBuilderFactoryProvider = provider5;
        this.fanAdFactoryProvider = provider6;
        this.nativeVideoAdFactoryProvider = provider7;
        this.nativeDisplayAdFactoryProvider = provider8;
        this.brandedProfileCardFactoryProvider = provider9;
        this.fanSourceBuilderProvider = provider10;
    }

    public RecsAdSourceRegistrar get() {
        return provideInstance(this.adAggregatorProvider, this.adsConfigProvider, this.dfpFieldsResolverProvider, this.dfpSourceBuilderProvider, this.nativeDfpSourceBuilderFactoryProvider, this.fanAdFactoryProvider, this.nativeVideoAdFactoryProvider, this.nativeDisplayAdFactoryProvider, this.brandedProfileCardFactoryProvider, this.fanSourceBuilderProvider);
    }

    public static RecsAdSourceRegistrar provideInstance(Provider<AdAggregator> provider, Provider<RecsAdsConfig> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<Builder> provider4, Provider<NativeDfpSourceBuilderFactory> provider5, Provider<RecsFanAd.Factory> provider6, Provider<RecsNativeVideoAd.Factory> provider7, Provider<RecsNativeDisplayAd.Factory> provider8, Provider<V1BrandedProfileCardAd.Factory> provider9, Provider<FanSource.Builder> provider10) {
        return new RecsAdSourceRegistrar((AdAggregator) provider.get(), (RecsAdsConfig) provider2.get(), (DfpFieldsResolverImpl) provider3.get(), (Builder) provider4.get(), (NativeDfpSourceBuilderFactory) provider5.get(), (RecsFanAd.Factory) provider6.get(), (RecsNativeVideoAd.Factory) provider7.get(), (RecsNativeDisplayAd.Factory) provider8.get(), (V1BrandedProfileCardAd.Factory) provider9.get(), (FanSource.Builder) provider10.get());
    }

    public static RecsAdSourceRegistrar_Factory create(Provider<AdAggregator> provider, Provider<RecsAdsConfig> provider2, Provider<DfpFieldsResolverImpl> provider3, Provider<Builder> provider4, Provider<NativeDfpSourceBuilderFactory> provider5, Provider<RecsFanAd.Factory> provider6, Provider<RecsNativeVideoAd.Factory> provider7, Provider<RecsNativeDisplayAd.Factory> provider8, Provider<V1BrandedProfileCardAd.Factory> provider9, Provider<FanSource.Builder> provider10) {
        return new RecsAdSourceRegistrar_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static RecsAdSourceRegistrar newRecsAdSourceRegistrar(AdAggregator adAggregator, RecsAdsConfig recsAdsConfig, DfpFieldsResolverImpl dfpFieldsResolverImpl, Builder builder, NativeDfpSourceBuilderFactory nativeDfpSourceBuilderFactory, RecsFanAd.Factory factory, RecsNativeVideoAd.Factory factory2, RecsNativeDisplayAd.Factory factory3, V1BrandedProfileCardAd.Factory factory4, FanSource.Builder builder2) {
        return new RecsAdSourceRegistrar(adAggregator, recsAdsConfig, dfpFieldsResolverImpl, builder, nativeDfpSourceBuilderFactory, factory, factory2, factory3, factory4, builder2);
    }
}
