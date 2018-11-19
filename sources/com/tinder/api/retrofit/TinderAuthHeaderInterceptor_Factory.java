package com.tinder.api.retrofit;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class TinderAuthHeaderInterceptor_Factory implements Factory<TinderAuthHeaderInterceptor> {
    private final Provider<AuthTokenProvider> authTokenProvider;

    public TinderAuthHeaderInterceptor_Factory(Provider<AuthTokenProvider> provider) {
        this.authTokenProvider = provider;
    }

    public TinderAuthHeaderInterceptor get() {
        return provideInstance(this.authTokenProvider);
    }

    public static TinderAuthHeaderInterceptor provideInstance(Provider<AuthTokenProvider> provider) {
        return new TinderAuthHeaderInterceptor((AuthTokenProvider) provider.get());
    }

    public static TinderAuthHeaderInterceptor_Factory create(Provider<AuthTokenProvider> provider) {
        return new TinderAuthHeaderInterceptor_Factory(provider);
    }

    public static TinderAuthHeaderInterceptor newTinderAuthHeaderInterceptor(AuthTokenProvider authTokenProvider) {
        return new TinderAuthHeaderInterceptor(authTokenProvider);
    }
}
