package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.PerfEventUrlUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class PurchaseNetworkPerfInspector_Factory implements Factory<PurchaseNetworkPerfInspector> {
    private final Provider<PerfEventUrlUtils> perfEventUrlUtilsProvider;

    public PurchaseNetworkPerfInspector_Factory(Provider<PerfEventUrlUtils> provider) {
        this.perfEventUrlUtilsProvider = provider;
    }

    public PurchaseNetworkPerfInspector get() {
        return provideInstance(this.perfEventUrlUtilsProvider);
    }

    public static PurchaseNetworkPerfInspector provideInstance(Provider<PerfEventUrlUtils> provider) {
        return new PurchaseNetworkPerfInspector((PerfEventUrlUtils) provider.get());
    }

    public static PurchaseNetworkPerfInspector_Factory create(Provider<PerfEventUrlUtils> provider) {
        return new PurchaseNetworkPerfInspector_Factory(provider);
    }

    public static PurchaseNetworkPerfInspector newPurchaseNetworkPerfInspector(PerfEventUrlUtils perfEventUrlUtils) {
        return new PurchaseNetworkPerfInspector(perfEventUrlUtils);
    }
}
