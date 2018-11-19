package com.tinder.api.module;

import com.tinder.api.retrofit.TinderHeaderInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.Interceptor;

public final class OkHttpModule_ProvideTinderHeaderInterceptorFactory implements Factory<Interceptor> {
    private final Provider<TinderHeaderInterceptor> interceptorProvider;
    private final OkHttpModule module;

    public OkHttpModule_ProvideTinderHeaderInterceptorFactory(OkHttpModule okHttpModule, Provider<TinderHeaderInterceptor> provider) {
        this.module = okHttpModule;
        this.interceptorProvider = provider;
    }

    public Interceptor get() {
        return provideInstance(this.module, this.interceptorProvider);
    }

    public static Interceptor provideInstance(OkHttpModule okHttpModule, Provider<TinderHeaderInterceptor> provider) {
        return proxyProvideTinderHeaderInterceptor(okHttpModule, (TinderHeaderInterceptor) provider.get());
    }

    public static OkHttpModule_ProvideTinderHeaderInterceptorFactory create(OkHttpModule okHttpModule, Provider<TinderHeaderInterceptor> provider) {
        return new OkHttpModule_ProvideTinderHeaderInterceptorFactory(okHttpModule, provider);
    }

    public static Interceptor proxyProvideTinderHeaderInterceptor(OkHttpModule okHttpModule, TinderHeaderInterceptor tinderHeaderInterceptor) {
        return (Interceptor) C15521i.a(okHttpModule.provideTinderHeaderInterceptor(tinderHeaderInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
