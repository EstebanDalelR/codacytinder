package com.tinder.domain.meta.usecase;

import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetCurrentUser_Factory implements Factory<GetCurrentUser> {
    private final Provider<MetaGateway> metaGatewayProvider;

    public GetCurrentUser_Factory(Provider<MetaGateway> provider) {
        this.metaGatewayProvider = provider;
    }

    public GetCurrentUser get() {
        return provideInstance(this.metaGatewayProvider);
    }

    public static GetCurrentUser provideInstance(Provider<MetaGateway> provider) {
        return new GetCurrentUser((MetaGateway) provider.get());
    }

    public static GetCurrentUser_Factory create(Provider<MetaGateway> provider) {
        return new GetCurrentUser_Factory(provider);
    }

    public static GetCurrentUser newGetCurrentUser(MetaGateway metaGateway) {
        return new GetCurrentUser(metaGateway);
    }
}
