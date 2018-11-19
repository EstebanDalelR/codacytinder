package com.tinder.api.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory implements Factory<RxJava2CallAdapterFactory> {
    private final RetrofitModule module;

    public RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory(RetrofitModule retrofitModule) {
        this.module = retrofitModule;
    }

    public RxJava2CallAdapterFactory get() {
        return provideInstance(this.module);
    }

    public static RxJava2CallAdapterFactory provideInstance(RetrofitModule retrofitModule) {
        return proxyProvideRxJava2CallAdapterFactory(retrofitModule);
    }

    public static RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory create(RetrofitModule retrofitModule) {
        return new RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory(retrofitModule);
    }

    public static RxJava2CallAdapterFactory proxyProvideRxJava2CallAdapterFactory(RetrofitModule retrofitModule) {
        return (RxJava2CallAdapterFactory) C15521i.a(retrofitModule.provideRxJava2CallAdapterFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
