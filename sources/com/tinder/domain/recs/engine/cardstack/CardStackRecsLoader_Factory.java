package com.tinder.domain.recs.engine.cardstack;

import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CardStackRecsLoader_Factory implements Factory<CardStackRecsLoader> {
    private final Provider<Config> configProvider;
    private final Provider<ConnectivityProvider> connectivityProvider;
    private final Provider<Rec$Source> recSourceProvider;
    private final Provider<RecsAdditionalDataPrefetcher<? super Rec>> recsPrefetcherProvider;
    private final Provider<RecsRepository> recsRepositoryProvider;

    public CardStackRecsLoader_Factory(Provider<RecsRepository> provider, Provider<RecsAdditionalDataPrefetcher<? super Rec>> provider2, Provider<ConnectivityProvider> provider3, Provider<Config> provider4, Provider<Rec$Source> provider5) {
        this.recsRepositoryProvider = provider;
        this.recsPrefetcherProvider = provider2;
        this.connectivityProvider = provider3;
        this.configProvider = provider4;
        this.recSourceProvider = provider5;
    }

    public CardStackRecsLoader get() {
        return new CardStackRecsLoader((RecsRepository) this.recsRepositoryProvider.get(), (RecsAdditionalDataPrefetcher) this.recsPrefetcherProvider.get(), (ConnectivityProvider) this.connectivityProvider.get(), (Config) this.configProvider.get(), (Rec$Source) this.recSourceProvider.get());
    }

    public static CardStackRecsLoader_Factory create(Provider<RecsRepository> provider, Provider<RecsAdditionalDataPrefetcher<? super Rec>> provider2, Provider<ConnectivityProvider> provider3, Provider<Config> provider4, Provider<Rec$Source> provider5) {
        return new CardStackRecsLoader_Factory(provider, provider2, provider3, provider4, provider5);
    }
}
