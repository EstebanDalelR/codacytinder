package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LegacyAddAdRequestReceiveEvent_Factory implements Factory<LegacyAddAdRequestReceiveEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public LegacyAddAdRequestReceiveEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public LegacyAddAdRequestReceiveEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static LegacyAddAdRequestReceiveEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new LegacyAddAdRequestReceiveEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static LegacyAddAdRequestReceiveEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new LegacyAddAdRequestReceiveEvent_Factory(provider, provider2);
    }

    public static LegacyAddAdRequestReceiveEvent newLegacyAddAdRequestReceiveEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new LegacyAddAdRequestReceiveEvent(c2630h, factory);
    }
}
