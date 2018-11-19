package com.tinder.domain.meta.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveCurrentUser_Factory implements Factory<ObserveCurrentUser> {
    private final Provider<MetaGateway> metaGatewayProvider;

    public ObserveCurrentUser_Factory(Provider<MetaGateway> provider) {
        this.metaGatewayProvider = provider;
    }

    public ObserveCurrentUser get() {
        return provideInstance(this.metaGatewayProvider);
    }

    public static ObserveCurrentUser provideInstance(Provider<MetaGateway> provider) {
        return new ObserveCurrentUser((MetaGateway) provider.get());
    }

    public static ObserveCurrentUser_Factory create(Provider<MetaGateway> provider) {
        return new ObserveCurrentUser_Factory(provider);
    }

    public static ObserveCurrentUser newObserveCurrentUser(MetaGateway metaGateway) {
        return new ObserveCurrentUser(metaGateway);
    }
}
