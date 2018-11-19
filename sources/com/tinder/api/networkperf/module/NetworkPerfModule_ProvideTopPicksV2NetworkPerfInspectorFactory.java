package com.tinder.api.networkperf.module;

import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.TopPicksV2NetworkPerfInspector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory implements Factory<NetworkPerfInspector> {
    private final NetworkPerfModule module;
    private final Provider<TopPicksV2NetworkPerfInspector> topPicksV2NetworkPerfInspectorProvider;

    public NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory(NetworkPerfModule networkPerfModule, Provider<TopPicksV2NetworkPerfInspector> provider) {
        this.module = networkPerfModule;
        this.topPicksV2NetworkPerfInspectorProvider = provider;
    }

    public NetworkPerfInspector get() {
        return provideInstance(this.module, this.topPicksV2NetworkPerfInspectorProvider);
    }

    public static NetworkPerfInspector provideInstance(NetworkPerfModule networkPerfModule, Provider<TopPicksV2NetworkPerfInspector> provider) {
        return proxyProvideTopPicksV2NetworkPerfInspector(networkPerfModule, (TopPicksV2NetworkPerfInspector) provider.get());
    }

    public static NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory create(NetworkPerfModule networkPerfModule, Provider<TopPicksV2NetworkPerfInspector> provider) {
        return new NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory(networkPerfModule, provider);
    }

    public static NetworkPerfInspector proxyProvideTopPicksV2NetworkPerfInspector(NetworkPerfModule networkPerfModule, TopPicksV2NetworkPerfInspector topPicksV2NetworkPerfInspector) {
        return (NetworkPerfInspector) C15521i.a(networkPerfModule.provideTopPicksV2NetworkPerfInspector(topPicksV2NetworkPerfInspector), "Cannot return null from a non-@Nullable @Provides method");
    }
}
