package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.PerfEventUrlUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserProfileNetworkPerfInspector_Factory implements Factory<UserProfileNetworkPerfInspector> {
    private final Provider<PerfEventUrlUtils> perfEventUrlUtilsProvider;

    public UserProfileNetworkPerfInspector_Factory(Provider<PerfEventUrlUtils> provider) {
        this.perfEventUrlUtilsProvider = provider;
    }

    public UserProfileNetworkPerfInspector get() {
        return provideInstance(this.perfEventUrlUtilsProvider);
    }

    public static UserProfileNetworkPerfInspector provideInstance(Provider<PerfEventUrlUtils> provider) {
        return new UserProfileNetworkPerfInspector((PerfEventUrlUtils) provider.get());
    }

    public static UserProfileNetworkPerfInspector_Factory create(Provider<PerfEventUrlUtils> provider) {
        return new UserProfileNetworkPerfInspector_Factory(provider);
    }

    public static UserProfileNetworkPerfInspector newUserProfileNetworkPerfInspector(PerfEventUrlUtils perfEventUrlUtils) {
        return new UserProfileNetworkPerfInspector(perfEventUrlUtils);
    }
}
