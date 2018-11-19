package com.tinder.api.module;

import com.tinder.api.retrofit.AuthTokenProvider;
import com.tinder.common.repository.C10698c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TinderApiModule_ProvideAuthTokenProviderFactory implements Factory<AuthTokenProvider> {
    private final TinderApiModule module;
    private final Provider<C10698c> tokenRepositoryProvider;

    public TinderApiModule_ProvideAuthTokenProviderFactory(TinderApiModule tinderApiModule, Provider<C10698c> provider) {
        this.module = tinderApiModule;
        this.tokenRepositoryProvider = provider;
    }

    public AuthTokenProvider get() {
        return provideInstance(this.module, this.tokenRepositoryProvider);
    }

    public static AuthTokenProvider provideInstance(TinderApiModule tinderApiModule, Provider<C10698c> provider) {
        return proxyProvideAuthTokenProvider(tinderApiModule, (C10698c) provider.get());
    }

    public static TinderApiModule_ProvideAuthTokenProviderFactory create(TinderApiModule tinderApiModule, Provider<C10698c> provider) {
        return new TinderApiModule_ProvideAuthTokenProviderFactory(tinderApiModule, provider);
    }

    public static AuthTokenProvider proxyProvideAuthTokenProvider(TinderApiModule tinderApiModule, C10698c c10698c) {
        return (AuthTokenProvider) C15521i.a(tinderApiModule.provideAuthTokenProvider(c10698c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
