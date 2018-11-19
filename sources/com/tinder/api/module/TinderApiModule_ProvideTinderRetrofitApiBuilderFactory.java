package com.tinder.api.module;

import com.tinder.api.retrofit.RetrofitErrorBodyAwareTransformer;
import com.tinder.api.retrofit.TinderRetrofitApi.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class TinderApiModule_ProvideTinderRetrofitApiBuilderFactory implements Factory<Builder> {
    private final TinderApiModule module;
    private final Provider<Retrofit.Builder> retrofitBuilderProvider;
    private final Provider<Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>>> transformersProvider;

    public TinderApiModule_ProvideTinderRetrofitApiBuilderFactory(TinderApiModule tinderApiModule, Provider<Retrofit.Builder> provider, Provider<Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>>> provider2) {
        this.module = tinderApiModule;
        this.retrofitBuilderProvider = provider;
        this.transformersProvider = provider2;
    }

    public Builder get() {
        return provideInstance(this.module, this.retrofitBuilderProvider, this.transformersProvider);
    }

    public static Builder provideInstance(TinderApiModule tinderApiModule, Provider<Retrofit.Builder> provider, Provider<Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>>> provider2) {
        return proxyProvideTinderRetrofitApiBuilder(tinderApiModule, (Retrofit.Builder) provider.get(), (Map) provider2.get());
    }

    public static TinderApiModule_ProvideTinderRetrofitApiBuilderFactory create(TinderApiModule tinderApiModule, Provider<Retrofit.Builder> provider, Provider<Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>>> provider2) {
        return new TinderApiModule_ProvideTinderRetrofitApiBuilderFactory(tinderApiModule, provider, provider2);
    }

    public static Builder proxyProvideTinderRetrofitApiBuilder(TinderApiModule tinderApiModule, Retrofit.Builder builder, Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>> map) {
        return (Builder) C15521i.a(tinderApiModule.provideTinderRetrofitApiBuilder(builder, map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
