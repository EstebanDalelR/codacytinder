package com.tinder.api.module;

import com.tinder.api.retrofit.TinderHeaderInterceptor.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory implements Factory<Builder> {
    private final TinderApiModule module;

    public TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory(TinderApiModule tinderApiModule) {
        this.module = tinderApiModule;
    }

    public Builder get() {
        return provideInstance(this.module);
    }

    public static Builder provideInstance(TinderApiModule tinderApiModule) {
        return proxyProvideTinderHeaderInterceptorBuilder(tinderApiModule);
    }

    public static TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory create(TinderApiModule tinderApiModule) {
        return new TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory(tinderApiModule);
    }

    public static Builder proxyProvideTinderHeaderInterceptorBuilder(TinderApiModule tinderApiModule) {
        return (Builder) C15521i.a(tinderApiModule.provideTinderHeaderInterceptorBuilder(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
