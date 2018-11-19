package com.tinder.api.module;

import com.tinder.api.ReauthStrategy;
import com.tinder.api.retrofit.AuthTokenProvider;
import com.tinder.api.retrofit.TinderAuthenticator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TinderApiModule_ProvideTinderAuthenticatorFactory implements Factory<TinderAuthenticator> {
    private final Provider<AuthTokenProvider> authTokenProvider;
    private final TinderApiModule module;
    private final Provider<ReauthStrategy> reauthStrategyProvider;

    public TinderApiModule_ProvideTinderAuthenticatorFactory(TinderApiModule tinderApiModule, Provider<ReauthStrategy> provider, Provider<AuthTokenProvider> provider2) {
        this.module = tinderApiModule;
        this.reauthStrategyProvider = provider;
        this.authTokenProvider = provider2;
    }

    public TinderAuthenticator get() {
        return provideInstance(this.module, this.reauthStrategyProvider, this.authTokenProvider);
    }

    public static TinderAuthenticator provideInstance(TinderApiModule tinderApiModule, Provider<ReauthStrategy> provider, Provider<AuthTokenProvider> provider2) {
        return proxyProvideTinderAuthenticator(tinderApiModule, (ReauthStrategy) provider.get(), (AuthTokenProvider) provider2.get());
    }

    public static TinderApiModule_ProvideTinderAuthenticatorFactory create(TinderApiModule tinderApiModule, Provider<ReauthStrategy> provider, Provider<AuthTokenProvider> provider2) {
        return new TinderApiModule_ProvideTinderAuthenticatorFactory(tinderApiModule, provider, provider2);
    }

    public static TinderAuthenticator proxyProvideTinderAuthenticator(TinderApiModule tinderApiModule, ReauthStrategy reauthStrategy, AuthTokenProvider authTokenProvider) {
        return (TinderAuthenticator) C15521i.a(tinderApiModule.provideTinderAuthenticator(reauthStrategy, authTokenProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
