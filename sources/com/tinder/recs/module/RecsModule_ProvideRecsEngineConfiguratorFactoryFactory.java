package com.tinder.recs.module;

import com.tinder.analytics.performance.C8157y;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.data.recs.C8776g;
import com.tinder.data.toppicks.C11016j;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.Configurator;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.fastmatch.p244b.C11621a;
import com.tinder.recs.rule.CardStackSwipeProcessingRulesResolver;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRecsEngineConfiguratorFactoryFactory implements Factory<Configurator.Factory> {
    private final Provider<RecsApiClient> cardStackRecsApiClientProvider;
    private final Provider<ConnectivityProvider> connectivityProvider;
    private final Provider<CardStackSwipeProcessingRulesResolver> coreSwipeProcessingRulesResolverProvider;
    private final Provider<C11621a> fastMatchRecsApiClientProvider;
    private final Provider<SwipeProcessingRulesResolver> fastMatchSwipeProcessingRulesResolverProvider;
    private final RecsModule module;
    private final Provider<C8736b> placesRecsApiClientFactoryProvider;
    private final Provider<SwipeProcessingRulesResolver> placesSwipeProcessingRulesResolverProvider;
    private final Provider<RecsAdditionalDataPrefetcher> recsAdditionalDataPrefetcherProvider;
    private final Provider<C8776g> recsAlreadySwipedProvider;
    private final Provider<C8157y> simplePerformanceEventDispatcherProvider;
    private final Provider<C11016j> topPicksApiClientProvider;
    private final Provider<SwipeProcessingRulesResolver> topPicksSwipeProcessingRulesResolverProvider;

    public RecsModule_ProvideRecsEngineConfiguratorFactoryFactory(RecsModule recsModule, Provider<RecsApiClient> provider, Provider<C11621a> provider2, Provider<C11016j> provider3, Provider<C8736b> provider4, Provider<RecsAdditionalDataPrefetcher> provider5, Provider<ConnectivityProvider> provider6, Provider<C8776g> provider7, Provider<CardStackSwipeProcessingRulesResolver> provider8, Provider<SwipeProcessingRulesResolver> provider9, Provider<SwipeProcessingRulesResolver> provider10, Provider<SwipeProcessingRulesResolver> provider11, Provider<C8157y> provider12) {
        this.module = recsModule;
        this.cardStackRecsApiClientProvider = provider;
        this.fastMatchRecsApiClientProvider = provider2;
        this.topPicksApiClientProvider = provider3;
        this.placesRecsApiClientFactoryProvider = provider4;
        this.recsAdditionalDataPrefetcherProvider = provider5;
        this.connectivityProvider = provider6;
        this.recsAlreadySwipedProvider = provider7;
        this.coreSwipeProcessingRulesResolverProvider = provider8;
        this.fastMatchSwipeProcessingRulesResolverProvider = provider9;
        this.placesSwipeProcessingRulesResolverProvider = provider10;
        this.topPicksSwipeProcessingRulesResolverProvider = provider11;
        this.simplePerformanceEventDispatcherProvider = provider12;
    }

    public Configurator.Factory get() {
        return provideInstance(this.module, this.cardStackRecsApiClientProvider, this.fastMatchRecsApiClientProvider, this.topPicksApiClientProvider, this.placesRecsApiClientFactoryProvider, this.recsAdditionalDataPrefetcherProvider, this.connectivityProvider, this.recsAlreadySwipedProvider, this.coreSwipeProcessingRulesResolverProvider, this.fastMatchSwipeProcessingRulesResolverProvider, this.placesSwipeProcessingRulesResolverProvider, this.topPicksSwipeProcessingRulesResolverProvider, this.simplePerformanceEventDispatcherProvider);
    }

    public static Configurator.Factory provideInstance(RecsModule recsModule, Provider<RecsApiClient> provider, Provider<C11621a> provider2, Provider<C11016j> provider3, Provider<C8736b> provider4, Provider<RecsAdditionalDataPrefetcher> provider5, Provider<ConnectivityProvider> provider6, Provider<C8776g> provider7, Provider<CardStackSwipeProcessingRulesResolver> provider8, Provider<SwipeProcessingRulesResolver> provider9, Provider<SwipeProcessingRulesResolver> provider10, Provider<SwipeProcessingRulesResolver> provider11, Provider<C8157y> provider12) {
        return proxyProvideRecsEngineConfiguratorFactory(recsModule, (RecsApiClient) provider.get(), provider2, provider3, (C8736b) provider4.get(), (RecsAdditionalDataPrefetcher) provider5.get(), (ConnectivityProvider) provider6.get(), (C8776g) provider7.get(), (CardStackSwipeProcessingRulesResolver) provider8.get(), (SwipeProcessingRulesResolver) provider9.get(), (SwipeProcessingRulesResolver) provider10.get(), (SwipeProcessingRulesResolver) provider11.get(), (C8157y) provider12.get());
    }

    public static RecsModule_ProvideRecsEngineConfiguratorFactoryFactory create(RecsModule recsModule, Provider<RecsApiClient> provider, Provider<C11621a> provider2, Provider<C11016j> provider3, Provider<C8736b> provider4, Provider<RecsAdditionalDataPrefetcher> provider5, Provider<ConnectivityProvider> provider6, Provider<C8776g> provider7, Provider<CardStackSwipeProcessingRulesResolver> provider8, Provider<SwipeProcessingRulesResolver> provider9, Provider<SwipeProcessingRulesResolver> provider10, Provider<SwipeProcessingRulesResolver> provider11, Provider<C8157y> provider12) {
        return new RecsModule_ProvideRecsEngineConfiguratorFactoryFactory(recsModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static Configurator.Factory proxyProvideRecsEngineConfiguratorFactory(RecsModule recsModule, RecsApiClient recsApiClient, Provider<C11621a> provider, Provider<C11016j> provider2, C8736b c8736b, RecsAdditionalDataPrefetcher recsAdditionalDataPrefetcher, ConnectivityProvider connectivityProvider, C8776g c8776g, CardStackSwipeProcessingRulesResolver cardStackSwipeProcessingRulesResolver, SwipeProcessingRulesResolver swipeProcessingRulesResolver, SwipeProcessingRulesResolver swipeProcessingRulesResolver2, SwipeProcessingRulesResolver swipeProcessingRulesResolver3, C8157y c8157y) {
        return (Configurator.Factory) C15521i.m58001a(recsModule.provideRecsEngineConfiguratorFactory(recsApiClient, provider, provider2, c8736b, recsAdditionalDataPrefetcher, connectivityProvider, c8776g, cardStackSwipeProcessingRulesResolver, swipeProcessingRulesResolver, swipeProcessingRulesResolver2, swipeProcessingRulesResolver3, c8157y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
