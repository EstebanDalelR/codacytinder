package com.tinder.domain.meta.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FetchMeta_Factory implements Factory<FetchMeta> {
    private final Provider<AuthStatusProvider> authStatusProvider;
    private final Provider<MetaGateway> metaGatewayProvider;

    public FetchMeta_Factory(Provider<MetaGateway> provider, Provider<AuthStatusProvider> provider2) {
        this.metaGatewayProvider = provider;
        this.authStatusProvider = provider2;
    }

    public FetchMeta get() {
        return provideInstance(this.metaGatewayProvider, this.authStatusProvider);
    }

    public static FetchMeta provideInstance(Provider<MetaGateway> provider, Provider<AuthStatusProvider> provider2) {
        return new FetchMeta((MetaGateway) provider.get(), (AuthStatusProvider) provider2.get());
    }

    public static FetchMeta_Factory create(Provider<MetaGateway> provider, Provider<AuthStatusProvider> provider2) {
        return new FetchMeta_Factory(provider, provider2);
    }

    public static FetchMeta newFetchMeta(MetaGateway metaGateway, AuthStatusProvider authStatusProvider) {
        return new FetchMeta(metaGateway, authStatusProvider);
    }
}
