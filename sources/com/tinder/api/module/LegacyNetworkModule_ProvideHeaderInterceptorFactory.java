package com.tinder.api.module;

import com.tinder.api.APIHeaderInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class LegacyNetworkModule_ProvideHeaderInterceptorFactory implements Factory<APIHeaderInterceptor> {
    private final LegacyNetworkModule module;

    public LegacyNetworkModule_ProvideHeaderInterceptorFactory(LegacyNetworkModule legacyNetworkModule) {
        this.module = legacyNetworkModule;
    }

    public APIHeaderInterceptor get() {
        return provideInstance(this.module);
    }

    public static APIHeaderInterceptor provideInstance(LegacyNetworkModule legacyNetworkModule) {
        return proxyProvideHeaderInterceptor(legacyNetworkModule);
    }

    public static LegacyNetworkModule_ProvideHeaderInterceptorFactory create(LegacyNetworkModule legacyNetworkModule) {
        return new LegacyNetworkModule_ProvideHeaderInterceptorFactory(legacyNetworkModule);
    }

    public static APIHeaderInterceptor proxyProvideHeaderInterceptor(LegacyNetworkModule legacyNetworkModule) {
        return (APIHeaderInterceptor) C15521i.a(legacyNetworkModule.provideHeaderInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
