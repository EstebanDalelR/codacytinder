package com.tinder.model.auth.network;

import com.tinder.auth.accountkit.C10326a;
import com.tinder.auth.repository.C10350m;
import com.tinder.auth.repository.C10353p;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AuthRequestFactory_Factory implements Factory<AuthRequestFactory> {
    private final Provider<C10326a> accountKitTokenRepositoryProvider;
    private final Provider<C10350m> facebookAuthTokenRepositoryProvider;
    private final Provider<C10353p> tinderLongLivedTokenRepositoryProvider;

    public AuthRequestFactory_Factory(Provider<C10326a> provider, Provider<C10350m> provider2, Provider<C10353p> provider3) {
        this.accountKitTokenRepositoryProvider = provider;
        this.facebookAuthTokenRepositoryProvider = provider2;
        this.tinderLongLivedTokenRepositoryProvider = provider3;
    }

    public AuthRequestFactory get() {
        return provideInstance(this.accountKitTokenRepositoryProvider, this.facebookAuthTokenRepositoryProvider, this.tinderLongLivedTokenRepositoryProvider);
    }

    public static AuthRequestFactory provideInstance(Provider<C10326a> provider, Provider<C10350m> provider2, Provider<C10353p> provider3) {
        return new AuthRequestFactory((C10326a) provider.get(), (C10350m) provider2.get(), (C10353p) provider3.get());
    }

    public static AuthRequestFactory_Factory create(Provider<C10326a> provider, Provider<C10350m> provider2, Provider<C10353p> provider3) {
        return new AuthRequestFactory_Factory(provider, provider2, provider3);
    }

    public static AuthRequestFactory newAuthRequestFactory(C10326a c10326a, C10350m c10350m, C10353p c10353p) {
        return new AuthRequestFactory(c10326a, c10350m, c10353p);
    }
}
