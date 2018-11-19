package com.tinder.api.networkperf.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.common.logger.Logger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.Interceptor;

public final class NetworkPerfModule_ProvideNetworkPerfInterceptorFactory implements Factory<Interceptor> {
    private final Provider<C2630h> fireworksProvider;
    private final Provider<Set<NetworkPerfInspector>> inspectorsProvider;
    private final Provider<Logger> loggerProvider;
    private final NetworkPerfModule module;
    private final Provider<ResponseErrorAdapter> responseErrorAdapterProvider;

    public NetworkPerfModule_ProvideNetworkPerfInterceptorFactory(NetworkPerfModule networkPerfModule, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        this.module = networkPerfModule;
        this.inspectorsProvider = provider;
        this.fireworksProvider = provider2;
        this.responseErrorAdapterProvider = provider3;
        this.loggerProvider = provider4;
    }

    public Interceptor get() {
        return provideInstance(this.module, this.inspectorsProvider, this.fireworksProvider, this.responseErrorAdapterProvider, this.loggerProvider);
    }

    public static Interceptor provideInstance(NetworkPerfModule networkPerfModule, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return proxyProvideNetworkPerfInterceptor(networkPerfModule, (Set) provider.get(), (C2630h) provider2.get(), (ResponseErrorAdapter) provider3.get(), (Logger) provider4.get());
    }

    public static NetworkPerfModule_ProvideNetworkPerfInterceptorFactory create(NetworkPerfModule networkPerfModule, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return new NetworkPerfModule_ProvideNetworkPerfInterceptorFactory(networkPerfModule, provider, provider2, provider3, provider4);
    }

    public static Interceptor proxyProvideNetworkPerfInterceptor(NetworkPerfModule networkPerfModule, Set<NetworkPerfInspector> set, C2630h c2630h, ResponseErrorAdapter responseErrorAdapter, Logger logger) {
        return (Interceptor) C15521i.a(networkPerfModule.provideNetworkPerfInterceptor(set, c2630h, responseErrorAdapter, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
