package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.PerfEventUrlUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FastMatchV2NetworkPerfInspector_Factory implements Factory<FastMatchV2NetworkPerfInspector> {
    private final Provider<PerfEventUrlUtils> perfEventUrlUtilsProvider;

    public FastMatchV2NetworkPerfInspector_Factory(Provider<PerfEventUrlUtils> provider) {
        this.perfEventUrlUtilsProvider = provider;
    }

    public FastMatchV2NetworkPerfInspector get() {
        return provideInstance(this.perfEventUrlUtilsProvider);
    }

    public static FastMatchV2NetworkPerfInspector provideInstance(Provider<PerfEventUrlUtils> provider) {
        return new FastMatchV2NetworkPerfInspector((PerfEventUrlUtils) provider.get());
    }

    public static FastMatchV2NetworkPerfInspector_Factory create(Provider<PerfEventUrlUtils> provider) {
        return new FastMatchV2NetworkPerfInspector_Factory(provider);
    }

    public static FastMatchV2NetworkPerfInspector newFastMatchV2NetworkPerfInspector(PerfEventUrlUtils perfEventUrlUtils) {
        return new FastMatchV2NetworkPerfInspector(perfEventUrlUtils);
    }
}
