package com.tinder.api.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import okhttp3.C15963q.C15962a;

public final class OkHttpModule_ProvideRequestBuilderFactory implements Factory<C15962a> {
    private final OkHttpModule module;

    public OkHttpModule_ProvideRequestBuilderFactory(OkHttpModule okHttpModule) {
        this.module = okHttpModule;
    }

    public C15962a get() {
        return provideInstance(this.module);
    }

    public static C15962a provideInstance(OkHttpModule okHttpModule) {
        return proxyProvideRequestBuilder(okHttpModule);
    }

    public static OkHttpModule_ProvideRequestBuilderFactory create(OkHttpModule okHttpModule) {
        return new OkHttpModule_ProvideRequestBuilderFactory(okHttpModule);
    }

    public static C15962a proxyProvideRequestBuilder(OkHttpModule okHttpModule) {
        return (C15962a) C15521i.a(okHttpModule.provideRequestBuilder(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
