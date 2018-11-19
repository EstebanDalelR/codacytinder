package com.tinder.api.networkperf.module;

import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.UserProfileNetworkPerfInspector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory implements Factory<NetworkPerfInspector> {
    private final NetworkPerfModule module;
    private final Provider<UserProfileNetworkPerfInspector> userProfileNetworkPerfInspectorProvider;

    public NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory(NetworkPerfModule networkPerfModule, Provider<UserProfileNetworkPerfInspector> provider) {
        this.module = networkPerfModule;
        this.userProfileNetworkPerfInspectorProvider = provider;
    }

    public NetworkPerfInspector get() {
        return provideInstance(this.module, this.userProfileNetworkPerfInspectorProvider);
    }

    public static NetworkPerfInspector provideInstance(NetworkPerfModule networkPerfModule, Provider<UserProfileNetworkPerfInspector> provider) {
        return proxyProvideUserProfileNetworkPerfInspector(networkPerfModule, (UserProfileNetworkPerfInspector) provider.get());
    }

    public static NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory create(NetworkPerfModule networkPerfModule, Provider<UserProfileNetworkPerfInspector> provider) {
        return new NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory(networkPerfModule, provider);
    }

    public static NetworkPerfInspector proxyProvideUserProfileNetworkPerfInspector(NetworkPerfModule networkPerfModule, UserProfileNetworkPerfInspector userProfileNetworkPerfInspector) {
        return (NetworkPerfInspector) C15521i.a(networkPerfModule.provideUserProfileNetworkPerfInspector(userProfileNetworkPerfInspector), "Cannot return null from a non-@Nullable @Provides method");
    }
}
