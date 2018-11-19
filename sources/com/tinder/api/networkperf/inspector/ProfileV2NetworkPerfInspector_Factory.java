package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.PerfEventUrlUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProfileV2NetworkPerfInspector_Factory implements Factory<ProfileV2NetworkPerfInspector> {
    private final Provider<PerfEventUrlUtils> perfEventUrlUtilsProvider;

    public ProfileV2NetworkPerfInspector_Factory(Provider<PerfEventUrlUtils> provider) {
        this.perfEventUrlUtilsProvider = provider;
    }

    public ProfileV2NetworkPerfInspector get() {
        return provideInstance(this.perfEventUrlUtilsProvider);
    }

    public static ProfileV2NetworkPerfInspector provideInstance(Provider<PerfEventUrlUtils> provider) {
        return new ProfileV2NetworkPerfInspector((PerfEventUrlUtils) provider.get());
    }

    public static ProfileV2NetworkPerfInspector_Factory create(Provider<PerfEventUrlUtils> provider) {
        return new ProfileV2NetworkPerfInspector_Factory(provider);
    }

    public static ProfileV2NetworkPerfInspector newProfileV2NetworkPerfInspector(PerfEventUrlUtils perfEventUrlUtils) {
        return new ProfileV2NetworkPerfInspector(perfEventUrlUtils);
    }
}
