package com.tinder.api.module;

import com.tinder.api.APIHeaderInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

public final class LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory implements Factory<C17692o> {
    private final Provider<APIHeaderInterceptor> apiHeaderInterceptorProvider;
    private final Provider<C17692o> clientProvider;
    private final LegacyNetworkModule module;

    public LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<APIHeaderInterceptor> provider2) {
        this.module = legacyNetworkModule;
        this.clientProvider = provider;
        this.apiHeaderInterceptorProvider = provider2;
    }

    public C17692o get() {
        return provideInstance(this.module, this.clientProvider, this.apiHeaderInterceptorProvider);
    }

    public static C17692o provideInstance(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<APIHeaderInterceptor> provider2) {
        return proxyProvideAuthHeadersOkHttpClient(legacyNetworkModule, (C17692o) provider.get(), (APIHeaderInterceptor) provider2.get());
    }

    public static LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory create(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<APIHeaderInterceptor> provider2) {
        return new LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory(legacyNetworkModule, provider, provider2);
    }

    public static C17692o proxyProvideAuthHeadersOkHttpClient(LegacyNetworkModule legacyNetworkModule, C17692o c17692o, APIHeaderInterceptor aPIHeaderInterceptor) {
        return (C17692o) C15521i.a(legacyNetworkModule.provideAuthHeadersOkHttpClient(c17692o, aPIHeaderInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
