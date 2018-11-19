package com.tinder.api.module;

import com.squareup.moshi.C5987p;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.TinderApi;
import com.tinder.api.retrofit.TinderAuthenticator;
import com.tinder.api.retrofit.TinderRetrofitApi.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.Interceptor;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class NetworkModule_ProvideTinderApiClientFactory implements Factory<TinderApi> {
    private final Provider<Builder> builderProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<Set<Interceptor>> interceptorsProvider;
    private final NetworkModule module;
    private final Provider<C5987p> moshiProvider;
    private final Provider<C17692o> okHttpClientProvider;
    private final Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider;
    private final Provider<RxJavaCallAdapterFactory> rxJavaCallAdapterFactoryProvider;
    private final Provider<TinderAuthenticator> tinderAuthenticatorProvider;

    public NetworkModule_ProvideTinderApiClientFactory(NetworkModule networkModule, Provider<Builder> provider, Provider<C17692o> provider2, Provider<TinderAuthenticator> provider3, Provider<Set<Interceptor>> provider4, Provider<RxJavaCallAdapterFactory> provider5, Provider<RxJava2CallAdapterFactory> provider6, Provider<C5987p> provider7, Provider<EnvironmentProvider> provider8) {
        this.module = networkModule;
        this.builderProvider = provider;
        this.okHttpClientProvider = provider2;
        this.tinderAuthenticatorProvider = provider3;
        this.interceptorsProvider = provider4;
        this.rxJavaCallAdapterFactoryProvider = provider5;
        this.rxJava2CallAdapterFactoryProvider = provider6;
        this.moshiProvider = provider7;
        this.environmentProvider = provider8;
    }

    public TinderApi get() {
        return provideInstance(this.module, this.builderProvider, this.okHttpClientProvider, this.tinderAuthenticatorProvider, this.interceptorsProvider, this.rxJavaCallAdapterFactoryProvider, this.rxJava2CallAdapterFactoryProvider, this.moshiProvider, this.environmentProvider);
    }

    public static TinderApi provideInstance(NetworkModule networkModule, Provider<Builder> provider, Provider<C17692o> provider2, Provider<TinderAuthenticator> provider3, Provider<Set<Interceptor>> provider4, Provider<RxJavaCallAdapterFactory> provider5, Provider<RxJava2CallAdapterFactory> provider6, Provider<C5987p> provider7, Provider<EnvironmentProvider> provider8) {
        return proxyProvideTinderApiClient(networkModule, (Builder) provider.get(), (C17692o) provider2.get(), (TinderAuthenticator) provider3.get(), (Set) provider4.get(), (RxJavaCallAdapterFactory) provider5.get(), (RxJava2CallAdapterFactory) provider6.get(), (C5987p) provider7.get(), (EnvironmentProvider) provider8.get());
    }

    public static NetworkModule_ProvideTinderApiClientFactory create(NetworkModule networkModule, Provider<Builder> provider, Provider<C17692o> provider2, Provider<TinderAuthenticator> provider3, Provider<Set<Interceptor>> provider4, Provider<RxJavaCallAdapterFactory> provider5, Provider<RxJava2CallAdapterFactory> provider6, Provider<C5987p> provider7, Provider<EnvironmentProvider> provider8) {
        return new NetworkModule_ProvideTinderApiClientFactory(networkModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static TinderApi proxyProvideTinderApiClient(NetworkModule networkModule, Builder builder, C17692o c17692o, TinderAuthenticator tinderAuthenticator, Set<Interceptor> set, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, RxJava2CallAdapterFactory rxJava2CallAdapterFactory, C5987p c5987p, EnvironmentProvider environmentProvider) {
        return (TinderApi) C15521i.a(networkModule.provideTinderApiClient(builder, c17692o, tinderAuthenticator, set, rxJavaCallAdapterFactory, rxJava2CallAdapterFactory, c5987p, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
