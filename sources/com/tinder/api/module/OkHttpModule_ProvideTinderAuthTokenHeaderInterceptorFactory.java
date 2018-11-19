package com.tinder.api.module;

import com.tinder.api.retrofit.TinderAuthHeaderInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.Interceptor;

public final class OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory implements Factory<Interceptor> {
    private final Provider<TinderAuthHeaderInterceptor> interceptorProvider;
    private final OkHttpModule module;

    public OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory(OkHttpModule okHttpModule, Provider<TinderAuthHeaderInterceptor> provider) {
        this.module = okHttpModule;
        this.interceptorProvider = provider;
    }

    public Interceptor get() {
        return provideInstance(this.module, this.interceptorProvider);
    }

    public static Interceptor provideInstance(OkHttpModule okHttpModule, Provider<TinderAuthHeaderInterceptor> provider) {
        return proxyProvideTinderAuthTokenHeaderInterceptor(okHttpModule, (TinderAuthHeaderInterceptor) provider.get());
    }

    public static OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory create(OkHttpModule okHttpModule, Provider<TinderAuthHeaderInterceptor> provider) {
        return new OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory(okHttpModule, provider);
    }

    public static Interceptor proxyProvideTinderAuthTokenHeaderInterceptor(OkHttpModule okHttpModule, TinderAuthHeaderInterceptor tinderAuthHeaderInterceptor) {
        return (Interceptor) C15521i.a(okHttpModule.provideTinderAuthTokenHeaderInterceptor(tinderAuthHeaderInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
