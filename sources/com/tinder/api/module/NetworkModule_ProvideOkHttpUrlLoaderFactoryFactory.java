package com.tinder.api.module;

import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.Interceptor;

public final class NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory implements Factory<OkHttpUrlLoader.Factory> {
    private final Provider<Set<Interceptor>> interceptorsProvider;
    private final NetworkModule module;
    private final Provider<C17692o> okHttpClientProvider;

    public NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory(NetworkModule networkModule, Provider<C17692o> provider, Provider<Set<Interceptor>> provider2) {
        this.module = networkModule;
        this.okHttpClientProvider = provider;
        this.interceptorsProvider = provider2;
    }

    public OkHttpUrlLoader.Factory get() {
        return provideInstance(this.module, this.okHttpClientProvider, this.interceptorsProvider);
    }

    public static OkHttpUrlLoader.Factory provideInstance(NetworkModule networkModule, Provider<C17692o> provider, Provider<Set<Interceptor>> provider2) {
        return proxyProvideOkHttpUrlLoaderFactory(networkModule, (C17692o) provider.get(), (Set) provider2.get());
    }

    public static NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory create(NetworkModule networkModule, Provider<C17692o> provider, Provider<Set<Interceptor>> provider2) {
        return new NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory(networkModule, provider, provider2);
    }

    public static OkHttpUrlLoader.Factory proxyProvideOkHttpUrlLoaderFactory(NetworkModule networkModule, C17692o c17692o, Set<Interceptor> set) {
        return (OkHttpUrlLoader.Factory) C15521i.a(networkModule.provideOkHttpUrlLoaderFactory(c17692o, set), "Cannot return null from a non-@Nullable @Provides method");
    }
}
