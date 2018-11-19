package com.tinder.api.module;

import com.tinder.api.TinderApi;
import com.tinder.api.TinderUserApi;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkModule_ProvideTinderUserApiFactory implements Factory<TinderUserApi> {
    private final NetworkModule module;
    private final Provider<TinderApi> tinderApiProvider;

    public NetworkModule_ProvideTinderUserApiFactory(NetworkModule networkModule, Provider<TinderApi> provider) {
        this.module = networkModule;
        this.tinderApiProvider = provider;
    }

    public TinderUserApi get() {
        return provideInstance(this.module, this.tinderApiProvider);
    }

    public static TinderUserApi provideInstance(NetworkModule networkModule, Provider<TinderApi> provider) {
        return proxyProvideTinderUserApi(networkModule, (TinderApi) provider.get());
    }

    public static NetworkModule_ProvideTinderUserApiFactory create(NetworkModule networkModule, Provider<TinderApi> provider) {
        return new NetworkModule_ProvideTinderUserApiFactory(networkModule, provider);
    }

    public static TinderUserApi proxyProvideTinderUserApi(NetworkModule networkModule, TinderApi tinderApi) {
        return (TinderUserApi) C15521i.a(networkModule.provideTinderUserApi(tinderApi), "Cannot return null from a non-@Nullable @Provides method");
    }
}
