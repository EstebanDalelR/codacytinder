package com.tinder.api.module;

import com.android.volley.toolbox.HttpStack;
import com.tinder.analytics.fireworks.api.C6224b;
import com.tinder.api.EnvironmentProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

public final class VolleyModule_ProvideOkHttpStackFactory implements Factory<HttpStack> {
    private final Provider<C17692o> clientProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<C6224b> fireworksUrlProvider;
    private final VolleyModule module;

    public VolleyModule_ProvideOkHttpStackFactory(VolleyModule volleyModule, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2, Provider<C6224b> provider3) {
        this.module = volleyModule;
        this.clientProvider = provider;
        this.environmentProvider = provider2;
        this.fireworksUrlProvider = provider3;
    }

    public HttpStack get() {
        return provideInstance(this.module, this.clientProvider, this.environmentProvider, this.fireworksUrlProvider);
    }

    public static HttpStack provideInstance(VolleyModule volleyModule, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2, Provider<C6224b> provider3) {
        return proxyProvideOkHttpStack(volleyModule, (C17692o) provider.get(), (EnvironmentProvider) provider2.get(), (C6224b) provider3.get());
    }

    public static VolleyModule_ProvideOkHttpStackFactory create(VolleyModule volleyModule, Provider<C17692o> provider, Provider<EnvironmentProvider> provider2, Provider<C6224b> provider3) {
        return new VolleyModule_ProvideOkHttpStackFactory(volleyModule, provider, provider2, provider3);
    }

    public static HttpStack proxyProvideOkHttpStack(VolleyModule volleyModule, C17692o c17692o, EnvironmentProvider environmentProvider, C6224b c6224b) {
        return (HttpStack) C15521i.a(volleyModule.provideOkHttpStack(c17692o, environmentProvider, c6224b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
