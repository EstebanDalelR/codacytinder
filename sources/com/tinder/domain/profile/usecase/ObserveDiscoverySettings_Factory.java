package com.tinder.domain.profile.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveDiscoverySettings_Factory implements Factory<ObserveDiscoverySettings> {
    private final Provider<MetaGateway> metaGatewayProvider;

    public ObserveDiscoverySettings_Factory(Provider<MetaGateway> provider) {
        this.metaGatewayProvider = provider;
    }

    public ObserveDiscoverySettings get() {
        return provideInstance(this.metaGatewayProvider);
    }

    public static ObserveDiscoverySettings provideInstance(Provider<MetaGateway> provider) {
        return new ObserveDiscoverySettings((MetaGateway) provider.get());
    }

    public static ObserveDiscoverySettings_Factory create(Provider<MetaGateway> provider) {
        return new ObserveDiscoverySettings_Factory(provider);
    }

    public static ObserveDiscoverySettings newObserveDiscoverySettings(MetaGateway metaGateway) {
        return new ObserveDiscoverySettings(metaGateway);
    }
}
