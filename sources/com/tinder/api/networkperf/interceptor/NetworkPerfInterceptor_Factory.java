package com.tinder.api.networkperf.interceptor;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.common.logger.Logger;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

public final class NetworkPerfInterceptor_Factory implements Factory<NetworkPerfInterceptor> {
    private final Provider<C2630h> fireworksProvider;
    private final Provider<Set<? extends NetworkPerfInspector>> inspectorsProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<ResponseErrorAdapter> responseErrorAdapterProvider;

    public NetworkPerfInterceptor_Factory(Provider<Set<? extends NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        this.inspectorsProvider = provider;
        this.fireworksProvider = provider2;
        this.responseErrorAdapterProvider = provider3;
        this.loggerProvider = provider4;
    }

    public NetworkPerfInterceptor get() {
        return provideInstance(this.inspectorsProvider, this.fireworksProvider, this.responseErrorAdapterProvider, this.loggerProvider);
    }

    public static NetworkPerfInterceptor provideInstance(Provider<Set<? extends NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return new NetworkPerfInterceptor((Set) provider.get(), (C2630h) provider2.get(), (ResponseErrorAdapter) provider3.get(), (Logger) provider4.get());
    }

    public static NetworkPerfInterceptor_Factory create(Provider<Set<? extends NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return new NetworkPerfInterceptor_Factory(provider, provider2, provider3, provider4);
    }

    public static NetworkPerfInterceptor newNetworkPerfInterceptor(Set<? extends NetworkPerfInspector> set, C2630h c2630h, ResponseErrorAdapter responseErrorAdapter, Logger logger) {
        return new NetworkPerfInterceptor(set, c2630h, responseErrorAdapter, logger);
    }
}
