package com.tinder.api.module;

import com.google.gson.Gson;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.converter.gson.GsonConverterFactory;

public final class RetrofitModule_ProvideGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
    private final Provider<Gson> gsonProvider;
    private final RetrofitModule module;

    public RetrofitModule_ProvideGsonConverterFactoryFactory(RetrofitModule retrofitModule, Provider<Gson> provider) {
        this.module = retrofitModule;
        this.gsonProvider = provider;
    }

    public GsonConverterFactory get() {
        return provideInstance(this.module, this.gsonProvider);
    }

    public static GsonConverterFactory provideInstance(RetrofitModule retrofitModule, Provider<Gson> provider) {
        return proxyProvideGsonConverterFactory(retrofitModule, (Gson) provider.get());
    }

    public static RetrofitModule_ProvideGsonConverterFactoryFactory create(RetrofitModule retrofitModule, Provider<Gson> provider) {
        return new RetrofitModule_ProvideGsonConverterFactoryFactory(retrofitModule, provider);
    }

    public static GsonConverterFactory proxyProvideGsonConverterFactory(RetrofitModule retrofitModule, Gson gson) {
        return (GsonConverterFactory) C15521i.a(retrofitModule.provideGsonConverterFactory(gson), "Cannot return null from a non-@Nullable @Provides method");
    }
}
