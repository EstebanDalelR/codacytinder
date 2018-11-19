package com.tinder.recs.engine;

import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.recs.provider.RecSourceProvider;
import com.tinder.recs.rule.SwipeDispatchRule;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsEngineResolver_Factory implements Factory<RecsEngineResolver> {
    private final Provider<ObserveDiscoverySettings> observeDiscoverySettingsProvider;
    private final Provider<PassportLocationProvider> passportLocationProvider;
    private final Provider<RecSourceProvider> recSourceProvider;
    private final Provider<RecsEngineProvider> recsEngineProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<SwipeDispatchRule> swipeDispatchRuleProvider;
    private final Provider<SwipeDataStore> swipeRepositoryProvider;

    public RecsEngineResolver_Factory(Provider<RecSourceProvider> provider, Provider<RecsEngineRegistry> provider2, Provider<RecsEngineProvider> provider3, Provider<PassportLocationProvider> provider4, Provider<ObserveDiscoverySettings> provider5, Provider<SwipeDataStore> provider6, Provider<SwipeDispatchRule> provider7) {
        this.recSourceProvider = provider;
        this.recsEngineRegistryProvider = provider2;
        this.recsEngineProvider = provider3;
        this.passportLocationProvider = provider4;
        this.observeDiscoverySettingsProvider = provider5;
        this.swipeRepositoryProvider = provider6;
        this.swipeDispatchRuleProvider = provider7;
    }

    public RecsEngineResolver get() {
        return provideInstance(this.recSourceProvider, this.recsEngineRegistryProvider, this.recsEngineProvider, this.passportLocationProvider, this.observeDiscoverySettingsProvider, this.swipeRepositoryProvider, this.swipeDispatchRuleProvider);
    }

    public static RecsEngineResolver provideInstance(Provider<RecSourceProvider> provider, Provider<RecsEngineRegistry> provider2, Provider<RecsEngineProvider> provider3, Provider<PassportLocationProvider> provider4, Provider<ObserveDiscoverySettings> provider5, Provider<SwipeDataStore> provider6, Provider<SwipeDispatchRule> provider7) {
        return new RecsEngineResolver((RecSourceProvider) provider.get(), (RecsEngineRegistry) provider2.get(), (RecsEngineProvider) provider3.get(), (PassportLocationProvider) provider4.get(), (ObserveDiscoverySettings) provider5.get(), (SwipeDataStore) provider6.get(), (SwipeDispatchRule) provider7.get());
    }

    public static RecsEngineResolver_Factory create(Provider<RecSourceProvider> provider, Provider<RecsEngineRegistry> provider2, Provider<RecsEngineProvider> provider3, Provider<PassportLocationProvider> provider4, Provider<ObserveDiscoverySettings> provider5, Provider<SwipeDataStore> provider6, Provider<SwipeDispatchRule> provider7) {
        return new RecsEngineResolver_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static RecsEngineResolver newRecsEngineResolver(RecSourceProvider recSourceProvider, RecsEngineRegistry recsEngineRegistry, RecsEngineProvider recsEngineProvider, PassportLocationProvider passportLocationProvider, ObserveDiscoverySettings observeDiscoverySettings, SwipeDataStore swipeDataStore, SwipeDispatchRule swipeDispatchRule) {
        return new RecsEngineResolver(recSourceProvider, recsEngineRegistry, recsEngineProvider, passportLocationProvider, observeDiscoverySettings, swipeDataStore, swipeDispatchRule);
    }
}
