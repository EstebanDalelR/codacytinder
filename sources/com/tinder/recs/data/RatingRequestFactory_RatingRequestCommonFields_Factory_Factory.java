package com.tinder.recs.data;

import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.passport.p093d.C3945a;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RatingRequestFactory_RatingRequestCommonFields_Factory_Factory implements Factory<Factory> {
    private final Provider<C10400d> boostInteractorProvider;
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<C3945a> managerPassportProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;
    private final Provider<TopPicksConfig> topPicksConfigProvider;

    public RatingRequestFactory_RatingRequestCommonFields_Factory_Factory(Provider<C3945a> provider, Provider<C10400d> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksConfig> provider4, Provider<SubscriptionProvider> provider5, Provider<RecsEngineRegistry> provider6) {
        this.managerPassportProvider = provider;
        this.boostInteractorProvider = provider2;
        this.fastMatchConfigProvider = provider3;
        this.topPicksConfigProvider = provider4;
        this.subscriptionProvider = provider5;
        this.recsEngineRegistryProvider = provider6;
    }

    public Factory get() {
        return provideInstance(this.managerPassportProvider, this.boostInteractorProvider, this.fastMatchConfigProvider, this.topPicksConfigProvider, this.subscriptionProvider, this.recsEngineRegistryProvider);
    }

    public static Factory provideInstance(Provider<C3945a> provider, Provider<C10400d> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksConfig> provider4, Provider<SubscriptionProvider> provider5, Provider<RecsEngineRegistry> provider6) {
        return new Factory((C3945a) provider.get(), (C10400d) provider2.get(), (FastMatchConfigProvider) provider3.get(), (TopPicksConfig) provider4.get(), (SubscriptionProvider) provider5.get(), (RecsEngineRegistry) provider6.get());
    }

    public static RatingRequestFactory_RatingRequestCommonFields_Factory_Factory create(Provider<C3945a> provider, Provider<C10400d> provider2, Provider<FastMatchConfigProvider> provider3, Provider<TopPicksConfig> provider4, Provider<SubscriptionProvider> provider5, Provider<RecsEngineRegistry> provider6) {
        return new RatingRequestFactory_RatingRequestCommonFields_Factory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static Factory newFactory(C3945a c3945a, C10400d c10400d, FastMatchConfigProvider fastMatchConfigProvider, TopPicksConfig topPicksConfig, SubscriptionProvider subscriptionProvider, RecsEngineRegistry recsEngineRegistry) {
        return new Factory(c3945a, c10400d, fastMatchConfigProvider, topPicksConfig, subscriptionProvider, recsEngineRegistry);
    }
}
