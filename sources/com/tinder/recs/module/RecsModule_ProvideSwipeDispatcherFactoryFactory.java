package com.tinder.recs.module;

import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideSwipeDispatcherFactoryFactory implements Factory<SwipeDispatcher.Factory> {
    private final Provider<ConnectivityProvider> connectivityProvider;
    private final RecsModule module;
    private final Provider<RatingsApiClient> ratingsApiClientProvider;
    private final Provider<SwipeDataStore> swipeDataStoreProvider;

    public RecsModule_ProvideSwipeDispatcherFactoryFactory(RecsModule recsModule, Provider<RatingsApiClient> provider, Provider<SwipeDataStore> provider2, Provider<ConnectivityProvider> provider3) {
        this.module = recsModule;
        this.ratingsApiClientProvider = provider;
        this.swipeDataStoreProvider = provider2;
        this.connectivityProvider = provider3;
    }

    public SwipeDispatcher.Factory get() {
        return provideInstance(this.module, this.ratingsApiClientProvider, this.swipeDataStoreProvider, this.connectivityProvider);
    }

    public static SwipeDispatcher.Factory provideInstance(RecsModule recsModule, Provider<RatingsApiClient> provider, Provider<SwipeDataStore> provider2, Provider<ConnectivityProvider> provider3) {
        return proxyProvideSwipeDispatcherFactory(recsModule, (RatingsApiClient) provider.get(), (SwipeDataStore) provider2.get(), (ConnectivityProvider) provider3.get());
    }

    public static RecsModule_ProvideSwipeDispatcherFactoryFactory create(RecsModule recsModule, Provider<RatingsApiClient> provider, Provider<SwipeDataStore> provider2, Provider<ConnectivityProvider> provider3) {
        return new RecsModule_ProvideSwipeDispatcherFactoryFactory(recsModule, provider, provider2, provider3);
    }

    public static SwipeDispatcher.Factory proxyProvideSwipeDispatcherFactory(RecsModule recsModule, RatingsApiClient ratingsApiClient, SwipeDataStore swipeDataStore, ConnectivityProvider connectivityProvider) {
        return (SwipeDispatcher.Factory) C15521i.m58001a(recsModule.provideSwipeDispatcherFactory(ratingsApiClient, swipeDataStore, connectivityProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
