package com.tinder.recs.module;

import com.tinder.api.TinderApi;
import com.tinder.data.toppicks.C11016j;
import com.tinder.data.toppicks.C8795i;
import com.tinder.domain.toppicks.TopPicksDiscoveryNotificationDispatcher;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

public final class RecsModule_ProvideTopPicksApiClientFactory implements Factory<C11016j> {
    private final Provider<ConnectivityProvider> connectivityProvider;
    private final RecsModule module;
    private final Provider<C8795i> recDomainApiAdapterProvider;
    private final Provider<TinderApi> tinderApiProvider;
    private final Provider<TopPicksDiscoveryNotificationDispatcher> topPicksDiscoveryNotificationDispatcherProvider;
    private final Provider<TopPicksLoadingStatusNotifier> topPicksLoadingStatusNotifierProvider;
    private final Provider<Function0<Integer>> utcOffsetMinsProvider;

    public RecsModule_ProvideTopPicksApiClientFactory(RecsModule recsModule, Provider<TinderApi> provider, Provider<C8795i> provider2, Provider<Function0<Integer>> provider3, Provider<ConnectivityProvider> provider4, Provider<TopPicksLoadingStatusNotifier> provider5, Provider<TopPicksDiscoveryNotificationDispatcher> provider6) {
        this.module = recsModule;
        this.tinderApiProvider = provider;
        this.recDomainApiAdapterProvider = provider2;
        this.utcOffsetMinsProvider = provider3;
        this.connectivityProvider = provider4;
        this.topPicksLoadingStatusNotifierProvider = provider5;
        this.topPicksDiscoveryNotificationDispatcherProvider = provider6;
    }

    public C11016j get() {
        return provideInstance(this.module, this.tinderApiProvider, this.recDomainApiAdapterProvider, this.utcOffsetMinsProvider, this.connectivityProvider, this.topPicksLoadingStatusNotifierProvider, this.topPicksDiscoveryNotificationDispatcherProvider);
    }

    public static C11016j provideInstance(RecsModule recsModule, Provider<TinderApi> provider, Provider<C8795i> provider2, Provider<Function0<Integer>> provider3, Provider<ConnectivityProvider> provider4, Provider<TopPicksLoadingStatusNotifier> provider5, Provider<TopPicksDiscoveryNotificationDispatcher> provider6) {
        return proxyProvideTopPicksApiClient(recsModule, (TinderApi) provider.get(), (C8795i) provider2.get(), (Function0) provider3.get(), (ConnectivityProvider) provider4.get(), (TopPicksLoadingStatusNotifier) provider5.get(), (TopPicksDiscoveryNotificationDispatcher) provider6.get());
    }

    public static RecsModule_ProvideTopPicksApiClientFactory create(RecsModule recsModule, Provider<TinderApi> provider, Provider<C8795i> provider2, Provider<Function0<Integer>> provider3, Provider<ConnectivityProvider> provider4, Provider<TopPicksLoadingStatusNotifier> provider5, Provider<TopPicksDiscoveryNotificationDispatcher> provider6) {
        return new RecsModule_ProvideTopPicksApiClientFactory(recsModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static C11016j proxyProvideTopPicksApiClient(RecsModule recsModule, TinderApi tinderApi, C8795i c8795i, Function0<Integer> function0, ConnectivityProvider connectivityProvider, TopPicksLoadingStatusNotifier topPicksLoadingStatusNotifier, TopPicksDiscoveryNotificationDispatcher topPicksDiscoveryNotificationDispatcher) {
        return (C11016j) C15521i.m58001a(recsModule.provideTopPicksApiClient(tinderApi, c8795i, function0, connectivityProvider, topPicksLoadingStatusNotifier, topPicksDiscoveryNotificationDispatcher), "Cannot return null from a non-@Nullable @Provides method");
    }
}
