package com.tinder.api.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

public final class RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory implements Factory<RxJavaCallAdapterFactory> {
    private final RetrofitModule module;

    public RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory(RetrofitModule retrofitModule) {
        this.module = retrofitModule;
    }

    public RxJavaCallAdapterFactory get() {
        return provideInstance(this.module);
    }

    public static RxJavaCallAdapterFactory provideInstance(RetrofitModule retrofitModule) {
        return proxyProvideRxJavaCallAdapterFactory(retrofitModule);
    }

    public static RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory create(RetrofitModule retrofitModule) {
        return new RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory(retrofitModule);
    }

    public static RxJavaCallAdapterFactory proxyProvideRxJavaCallAdapterFactory(RetrofitModule retrofitModule) {
        return (RxJavaCallAdapterFactory) C15521i.a(retrofitModule.provideRxJavaCallAdapterFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
