package com.tinder.api.networkperf.module;

import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.PurchaseNetworkPerfInspector;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory implements Factory<NetworkPerfInspector> {
    private final NetworkPerfModule module;
    private final Provider<PurchaseNetworkPerfInspector> purchaseNetworkPerfInspectorProvider;

    public NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory(NetworkPerfModule networkPerfModule, Provider<PurchaseNetworkPerfInspector> provider) {
        this.module = networkPerfModule;
        this.purchaseNetworkPerfInspectorProvider = provider;
    }

    public NetworkPerfInspector get() {
        return provideInstance(this.module, this.purchaseNetworkPerfInspectorProvider);
    }

    public static NetworkPerfInspector provideInstance(NetworkPerfModule networkPerfModule, Provider<PurchaseNetworkPerfInspector> provider) {
        return proxyProvidePurchaseNetworkPerfInspector(networkPerfModule, (PurchaseNetworkPerfInspector) provider.get());
    }

    public static NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory create(NetworkPerfModule networkPerfModule, Provider<PurchaseNetworkPerfInspector> provider) {
        return new NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory(networkPerfModule, provider);
    }

    public static NetworkPerfInspector proxyProvidePurchaseNetworkPerfInspector(NetworkPerfModule networkPerfModule, PurchaseNetworkPerfInspector purchaseNetworkPerfInspector) {
        return (NetworkPerfInspector) C15521i.a(networkPerfModule.providePurchaseNetworkPerfInspector(purchaseNetworkPerfInspector), "Cannot return null from a non-@Nullable @Provides method");
    }
}
