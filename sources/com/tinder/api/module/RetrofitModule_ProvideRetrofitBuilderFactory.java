package com.tinder.api.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import retrofit2.Retrofit.Builder;

public final class RetrofitModule_ProvideRetrofitBuilderFactory implements Factory<Builder> {
    private final RetrofitModule module;

    public RetrofitModule_ProvideRetrofitBuilderFactory(RetrofitModule retrofitModule) {
        this.module = retrofitModule;
    }

    public Builder get() {
        return provideInstance(this.module);
    }

    public static Builder provideInstance(RetrofitModule retrofitModule) {
        return proxyProvideRetrofitBuilder(retrofitModule);
    }

    public static RetrofitModule_ProvideRetrofitBuilderFactory create(RetrofitModule retrofitModule) {
        return new RetrofitModule_ProvideRetrofitBuilderFactory(retrofitModule);
    }

    public static Builder proxyProvideRetrofitBuilder(RetrofitModule retrofitModule) {
        return (Builder) C15521i.a(retrofitModule.provideRetrofitBuilder(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
