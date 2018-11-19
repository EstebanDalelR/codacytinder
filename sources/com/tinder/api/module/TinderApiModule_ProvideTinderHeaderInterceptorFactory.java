package com.tinder.api.module;

import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.api.retrofit.TinderHeaderInterceptor.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TinderApiModule_ProvideTinderHeaderInterceptorFactory implements Factory<TinderHeaderInterceptor> {
    private final Provider<Builder> builderProvider;
    private final TinderApiModule module;

    public TinderApiModule_ProvideTinderHeaderInterceptorFactory(TinderApiModule tinderApiModule, Provider<Builder> provider) {
        this.module = tinderApiModule;
        this.builderProvider = provider;
    }

    public TinderHeaderInterceptor get() {
        return provideInstance(this.module, this.builderProvider);
    }

    public static TinderHeaderInterceptor provideInstance(TinderApiModule tinderApiModule, Provider<Builder> provider) {
        return proxyProvideTinderHeaderInterceptor(tinderApiModule, (Builder) provider.get());
    }

    public static TinderApiModule_ProvideTinderHeaderInterceptorFactory create(TinderApiModule tinderApiModule, Provider<Builder> provider) {
        return new TinderApiModule_ProvideTinderHeaderInterceptorFactory(tinderApiModule, provider);
    }

    public static TinderHeaderInterceptor proxyProvideTinderHeaderInterceptor(TinderApiModule tinderApiModule, Builder builder) {
        return (TinderHeaderInterceptor) C15521i.a(tinderApiModule.provideTinderHeaderInterceptor(builder), "Cannot return null from a non-@Nullable @Provides method");
    }
}
