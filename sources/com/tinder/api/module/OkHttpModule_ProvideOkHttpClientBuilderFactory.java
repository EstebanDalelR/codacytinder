package com.tinder.api.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import okhttp3.C17692o.C15961a;

public final class OkHttpModule_ProvideOkHttpClientBuilderFactory implements Factory<C15961a> {
    private final OkHttpModule module;

    public OkHttpModule_ProvideOkHttpClientBuilderFactory(OkHttpModule okHttpModule) {
        this.module = okHttpModule;
    }

    public C15961a get() {
        return provideInstance(this.module);
    }

    public static C15961a provideInstance(OkHttpModule okHttpModule) {
        return proxyProvideOkHttpClientBuilder(okHttpModule);
    }

    public static OkHttpModule_ProvideOkHttpClientBuilderFactory create(OkHttpModule okHttpModule) {
        return new OkHttpModule_ProvideOkHttpClientBuilderFactory(okHttpModule);
    }

    public static C15961a proxyProvideOkHttpClientBuilder(OkHttpModule okHttpModule) {
        return (C15961a) C15521i.a(okHttpModule.provideOkHttpClientBuilder(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
