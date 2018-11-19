package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.PerfEventUrlUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TopPicksV2NetworkPerfInspector_Factory implements Factory<TopPicksV2NetworkPerfInspector> {
    private final Provider<PerfEventUrlUtils> perfEventUrlUtilsProvider;

    public TopPicksV2NetworkPerfInspector_Factory(Provider<PerfEventUrlUtils> provider) {
        this.perfEventUrlUtilsProvider = provider;
    }

    public TopPicksV2NetworkPerfInspector get() {
        return provideInstance(this.perfEventUrlUtilsProvider);
    }

    public static TopPicksV2NetworkPerfInspector provideInstance(Provider<PerfEventUrlUtils> provider) {
        return new TopPicksV2NetworkPerfInspector((PerfEventUrlUtils) provider.get());
    }

    public static TopPicksV2NetworkPerfInspector_Factory create(Provider<PerfEventUrlUtils> provider) {
        return new TopPicksV2NetworkPerfInspector_Factory(provider);
    }

    public static TopPicksV2NetworkPerfInspector newTopPicksV2NetworkPerfInspector(PerfEventUrlUtils perfEventUrlUtils) {
        return new TopPicksV2NetworkPerfInspector(perfEventUrlUtils);
    }
}
