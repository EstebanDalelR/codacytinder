package com.tinder.api.networkperf.module;

import com.tinder.api.networkperf.inspector.FastMatchV2NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory implements Factory<NetworkPerfInspector> {
    private final Provider<FastMatchV2NetworkPerfInspector> fastMatchV2NetworkPerfInspectorProvider;
    private final NetworkPerfModule module;

    public NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory(NetworkPerfModule networkPerfModule, Provider<FastMatchV2NetworkPerfInspector> provider) {
        this.module = networkPerfModule;
        this.fastMatchV2NetworkPerfInspectorProvider = provider;
    }

    public NetworkPerfInspector get() {
        return provideInstance(this.module, this.fastMatchV2NetworkPerfInspectorProvider);
    }

    public static NetworkPerfInspector provideInstance(NetworkPerfModule networkPerfModule, Provider<FastMatchV2NetworkPerfInspector> provider) {
        return proxyProvideFastMatchV2NetworkPerfInspector(networkPerfModule, (FastMatchV2NetworkPerfInspector) provider.get());
    }

    public static NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory create(NetworkPerfModule networkPerfModule, Provider<FastMatchV2NetworkPerfInspector> provider) {
        return new NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory(networkPerfModule, provider);
    }

    public static NetworkPerfInspector proxyProvideFastMatchV2NetworkPerfInspector(NetworkPerfModule networkPerfModule, FastMatchV2NetworkPerfInspector fastMatchV2NetworkPerfInspector) {
        return (NetworkPerfInspector) C15521i.a(networkPerfModule.provideFastMatchV2NetworkPerfInspector(fastMatchV2NetworkPerfInspector), "Cannot return null from a non-@Nullable @Provides method");
    }
}
