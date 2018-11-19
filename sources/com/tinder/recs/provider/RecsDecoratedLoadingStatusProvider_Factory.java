package com.tinder.recs.provider;

import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsDecoratedLoadingStatusProvider_Factory implements Factory<RecsDecoratedLoadingStatusProvider> {
    private final Provider<ObserveCurrentUser> observeCurrentUserProvider;
    private final Provider<ObserveDiscoverySettings> observeDiscoverySettingsProvider;

    public RecsDecoratedLoadingStatusProvider_Factory(Provider<ObserveCurrentUser> provider, Provider<ObserveDiscoverySettings> provider2) {
        this.observeCurrentUserProvider = provider;
        this.observeDiscoverySettingsProvider = provider2;
    }

    public RecsDecoratedLoadingStatusProvider get() {
        return provideInstance(this.observeCurrentUserProvider, this.observeDiscoverySettingsProvider);
    }

    public static RecsDecoratedLoadingStatusProvider provideInstance(Provider<ObserveCurrentUser> provider, Provider<ObserveDiscoverySettings> provider2) {
        return new RecsDecoratedLoadingStatusProvider((ObserveCurrentUser) provider.get(), (ObserveDiscoverySettings) provider2.get());
    }

    public static RecsDecoratedLoadingStatusProvider_Factory create(Provider<ObserveCurrentUser> provider, Provider<ObserveDiscoverySettings> provider2) {
        return new RecsDecoratedLoadingStatusProvider_Factory(provider, provider2);
    }

    public static RecsDecoratedLoadingStatusProvider newRecsDecoratedLoadingStatusProvider(ObserveCurrentUser observeCurrentUser, ObserveDiscoverySettings observeDiscoverySettings) {
        return new RecsDecoratedLoadingStatusProvider(observeCurrentUser, observeDiscoverySettings);
    }
}
