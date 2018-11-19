package com.tinder.api.module;

import android.app.Application;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C2670b;

public final class OkHttpModule_ProvideHttpCacheFactory implements Factory<C2670b> {
    private final Provider<Application> applicationProvider;
    private final OkHttpModule module;

    public OkHttpModule_ProvideHttpCacheFactory(OkHttpModule okHttpModule, Provider<Application> provider) {
        this.module = okHttpModule;
        this.applicationProvider = provider;
    }

    public C2670b get() {
        return provideInstance(this.module, this.applicationProvider);
    }

    public static C2670b provideInstance(OkHttpModule okHttpModule, Provider<Application> provider) {
        return proxyProvideHttpCache(okHttpModule, (Application) provider.get());
    }

    public static OkHttpModule_ProvideHttpCacheFactory create(OkHttpModule okHttpModule, Provider<Application> provider) {
        return new OkHttpModule_ProvideHttpCacheFactory(okHttpModule, provider);
    }

    public static C2670b proxyProvideHttpCache(OkHttpModule okHttpModule, Application application) {
        return (C2670b) C15521i.a(okHttpModule.provideHttpCache(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
