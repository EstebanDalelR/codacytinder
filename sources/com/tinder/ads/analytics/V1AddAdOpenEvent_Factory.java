package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class V1AddAdOpenEvent_Factory implements Factory<V1AddAdOpenEvent> {
    private final Provider<AdEventFields.Factory> adEventFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public V1AddAdOpenEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.adEventFieldsFactoryProvider = provider2;
    }

    public V1AddAdOpenEvent get() {
        return provideInstance(this.fireworksProvider, this.adEventFieldsFactoryProvider);
    }

    public static V1AddAdOpenEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new V1AddAdOpenEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static V1AddAdOpenEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new V1AddAdOpenEvent_Factory(provider, provider2);
    }

    public static V1AddAdOpenEvent newV1AddAdOpenEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new V1AddAdOpenEvent(c2630h, factory);
    }
}
