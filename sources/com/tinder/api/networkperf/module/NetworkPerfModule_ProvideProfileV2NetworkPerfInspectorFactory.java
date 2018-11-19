package com.tinder.api.networkperf.module;

import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.ProfileV2NetworkPerfInspector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory implements Factory<NetworkPerfInspector> {
    private final NetworkPerfModule module;
    private final Provider<ProfileV2NetworkPerfInspector> profileV2NetworkPerfInspectorProvider;

    public NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory(NetworkPerfModule networkPerfModule, Provider<ProfileV2NetworkPerfInspector> provider) {
        this.module = networkPerfModule;
        this.profileV2NetworkPerfInspectorProvider = provider;
    }

    public NetworkPerfInspector get() {
        return provideInstance(this.module, this.profileV2NetworkPerfInspectorProvider);
    }

    public static NetworkPerfInspector provideInstance(NetworkPerfModule networkPerfModule, Provider<ProfileV2NetworkPerfInspector> provider) {
        return proxyProvideProfileV2NetworkPerfInspector(networkPerfModule, (ProfileV2NetworkPerfInspector) provider.get());
    }

    public static NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory create(NetworkPerfModule networkPerfModule, Provider<ProfileV2NetworkPerfInspector> provider) {
        return new NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory(networkPerfModule, provider);
    }

    public static NetworkPerfInspector proxyProvideProfileV2NetworkPerfInspector(NetworkPerfModule networkPerfModule, ProfileV2NetworkPerfInspector profileV2NetworkPerfInspector) {
        return (NetworkPerfInspector) C15521i.a(networkPerfModule.provideProfileV2NetworkPerfInspector(profileV2NetworkPerfInspector), "Cannot return null from a non-@Nullable @Provides method");
    }
}
