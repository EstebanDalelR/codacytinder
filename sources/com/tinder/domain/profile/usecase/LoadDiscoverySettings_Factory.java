package com.tinder.domain.profile.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadDiscoverySettings_Factory implements Factory<LoadDiscoverySettings> {
    private final Provider<MetaGateway> metaGatewayProvider;

    public LoadDiscoverySettings_Factory(Provider<MetaGateway> provider) {
        this.metaGatewayProvider = provider;
    }

    public LoadDiscoverySettings get() {
        return provideInstance(this.metaGatewayProvider);
    }

    public static LoadDiscoverySettings provideInstance(Provider<MetaGateway> provider) {
        return new LoadDiscoverySettings((MetaGateway) provider.get());
    }

    public static LoadDiscoverySettings_Factory create(Provider<MetaGateway> provider) {
        return new LoadDiscoverySettings_Factory(provider);
    }

    public static LoadDiscoverySettings newLoadDiscoverySettings(MetaGateway metaGateway) {
        return new LoadDiscoverySettings(metaGateway);
    }
}
