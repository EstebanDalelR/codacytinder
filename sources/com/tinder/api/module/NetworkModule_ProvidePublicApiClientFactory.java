package com.tinder.api.module;

import com.tinder.api.retrofit.InterceptorDecorator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.C2670b;

public final class NetworkModule_ProvidePublicApiClientFactory implements Factory<C17692o> {
    private final Provider<C15961a> builderProvider;
    private final Provider<C2670b> cacheProvider;
    private final Provider<InterceptorDecorator> interceptorDecoratorProvider;
    private final NetworkModule module;

    public NetworkModule_ProvidePublicApiClientFactory(NetworkModule networkModule, Provider<C15961a> provider, Provider<C2670b> provider2, Provider<InterceptorDecorator> provider3) {
        this.module = networkModule;
        this.builderProvider = provider;
        this.cacheProvider = provider2;
        this.interceptorDecoratorProvider = provider3;
    }

    public C17692o get() {
        return provideInstance(this.module, this.builderProvider, this.cacheProvider, this.interceptorDecoratorProvider);
    }

    public static C17692o provideInstance(NetworkModule networkModule, Provider<C15961a> provider, Provider<C2670b> provider2, Provider<InterceptorDecorator> provider3) {
        return proxyProvidePublicApiClient(networkModule, (C15961a) provider.get(), (C2670b) provider2.get(), (InterceptorDecorator) provider3.get());
    }

    public static NetworkModule_ProvidePublicApiClientFactory create(NetworkModule networkModule, Provider<C15961a> provider, Provider<C2670b> provider2, Provider<InterceptorDecorator> provider3) {
        return new NetworkModule_ProvidePublicApiClientFactory(networkModule, provider, provider2, provider3);
    }

    public static C17692o proxyProvidePublicApiClient(NetworkModule networkModule, C15961a c15961a, C2670b c2670b, InterceptorDecorator interceptorDecorator) {
        return (C17692o) C15521i.a(networkModule.providePublicApiClient(c15961a, c2670b, interceptorDecorator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
