package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CardGridRecsLoader_Factory implements Factory<CardGridRecsLoader> {
    private final Provider<Config> configProvider;
    private final Provider<ConnectivityProvider> connectivityProvider;
    private final Provider<Rec$Source> recSourceProvider;
    private final Provider<RecsRepository> recsRepositoryProvider;

    public CardGridRecsLoader_Factory(Provider<RecsRepository> provider, Provider<ConnectivityProvider> provider2, Provider<Config> provider3, Provider<Rec$Source> provider4) {
        this.recsRepositoryProvider = provider;
        this.connectivityProvider = provider2;
        this.configProvider = provider3;
        this.recSourceProvider = provider4;
    }

    public CardGridRecsLoader get() {
        return new CardGridRecsLoader((RecsRepository) this.recsRepositoryProvider.get(), (ConnectivityProvider) this.connectivityProvider.get(), (Config) this.configProvider.get(), (Rec$Source) this.recSourceProvider.get());
    }

    public static CardGridRecsLoader_Factory create(Provider<RecsRepository> provider, Provider<ConnectivityProvider> provider2, Provider<Config> provider3, Provider<Rec$Source> provider4) {
        return new CardGridRecsLoader_Factory(provider, provider2, provider3, provider4);
    }
}
