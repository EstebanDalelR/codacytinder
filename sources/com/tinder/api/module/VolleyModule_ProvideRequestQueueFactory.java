package com.tinder.api.module;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpStack;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class VolleyModule_ProvideRequestQueueFactory implements Factory<RequestQueue> {
    private final VolleyModule module;
    private final Provider<HttpStack> stackProvider;

    public VolleyModule_ProvideRequestQueueFactory(VolleyModule volleyModule, Provider<HttpStack> provider) {
        this.module = volleyModule;
        this.stackProvider = provider;
    }

    public RequestQueue get() {
        return provideInstance(this.module, this.stackProvider);
    }

    public static RequestQueue provideInstance(VolleyModule volleyModule, Provider<HttpStack> provider) {
        return proxyProvideRequestQueue(volleyModule, (HttpStack) provider.get());
    }

    public static VolleyModule_ProvideRequestQueueFactory create(VolleyModule volleyModule, Provider<HttpStack> provider) {
        return new VolleyModule_ProvideRequestQueueFactory(volleyModule, provider);
    }

    public static RequestQueue proxyProvideRequestQueue(VolleyModule volleyModule, HttpStack httpStack) {
        return (RequestQueue) C15521i.a(volleyModule.provideRequestQueue(httpStack), "Cannot return null from a non-@Nullable @Provides method");
    }
}
