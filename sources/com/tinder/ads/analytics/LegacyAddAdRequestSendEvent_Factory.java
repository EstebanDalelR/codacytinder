package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LegacyAddAdRequestSendEvent_Factory implements Factory<LegacyAddAdRequestSendEvent> {
    private final Provider<C2630h> fireworksProvider;
    private final Provider<RecsAdsConfig> recsAdsConfigProvider;

    public LegacyAddAdRequestSendEvent_Factory(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        this.recsAdsConfigProvider = provider;
        this.fireworksProvider = provider2;
    }

    public LegacyAddAdRequestSendEvent get() {
        return provideInstance(this.recsAdsConfigProvider, this.fireworksProvider);
    }

    public static LegacyAddAdRequestSendEvent provideInstance(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        return new LegacyAddAdRequestSendEvent((RecsAdsConfig) provider.get(), (C2630h) provider2.get());
    }

    public static LegacyAddAdRequestSendEvent_Factory create(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        return new LegacyAddAdRequestSendEvent_Factory(provider, provider2);
    }

    public static LegacyAddAdRequestSendEvent newLegacyAddAdRequestSendEvent(RecsAdsConfig recsAdsConfig, C2630h c2630h) {
        return new LegacyAddAdRequestSendEvent(recsAdsConfig, c2630h);
    }
}
