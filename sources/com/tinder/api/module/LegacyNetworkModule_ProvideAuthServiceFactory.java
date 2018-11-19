package com.tinder.api.module;

import com.tinder.api.EnvironmentProvider;
import com.tinder.auth.repository.AuthService;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public final class LegacyNetworkModule_ProvideAuthServiceFactory implements Factory<AuthService> {
    private final Provider<C17692o> clientProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;
    private final LegacyNetworkModule module;
    private final Provider<Builder> retrofitBuilderProvider;
    private final Provider<RxJavaCallAdapterFactory> rxJavaCallAdapterFactoryProvider;

    public LegacyNetworkModule_ProvideAuthServiceFactory(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<Builder> provider2, Provider<RxJavaCallAdapterFactory> provider3, Provider<GsonConverterFactory> provider4, Provider<EnvironmentProvider> provider5) {
        this.module = legacyNetworkModule;
        this.clientProvider = provider;
        this.retrofitBuilderProvider = provider2;
        this.rxJavaCallAdapterFactoryProvider = provider3;
        this.gsonConverterFactoryProvider = provider4;
        this.environmentProvider = provider5;
    }

    public AuthService get() {
        return provideInstance(this.module, this.clientProvider, this.retrofitBuilderProvider, this.rxJavaCallAdapterFactoryProvider, this.gsonConverterFactoryProvider, this.environmentProvider);
    }

    public static AuthService provideInstance(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<Builder> provider2, Provider<RxJavaCallAdapterFactory> provider3, Provider<GsonConverterFactory> provider4, Provider<EnvironmentProvider> provider5) {
        return proxyProvideAuthService(legacyNetworkModule, (C17692o) provider.get(), (Builder) provider2.get(), (RxJavaCallAdapterFactory) provider3.get(), (GsonConverterFactory) provider4.get(), (EnvironmentProvider) provider5.get());
    }

    public static LegacyNetworkModule_ProvideAuthServiceFactory create(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<Builder> provider2, Provider<RxJavaCallAdapterFactory> provider3, Provider<GsonConverterFactory> provider4, Provider<EnvironmentProvider> provider5) {
        return new LegacyNetworkModule_ProvideAuthServiceFactory(legacyNetworkModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AuthService proxyProvideAuthService(LegacyNetworkModule legacyNetworkModule, C17692o c17692o, Builder builder, RxJavaCallAdapterFactory rxJavaCallAdapterFactory, GsonConverterFactory gsonConverterFactory, EnvironmentProvider environmentProvider) {
        return (AuthService) C15521i.a(legacyNetworkModule.provideAuthService(c17692o, builder, rxJavaCallAdapterFactory, gsonConverterFactory, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
