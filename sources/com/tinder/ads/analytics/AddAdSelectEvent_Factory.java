package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdSelectEvent_Factory implements Factory<AddAdSelectEvent> {
    private final Provider<AdEventFields.Factory> commonFieldFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdSelectEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldFactoryProvider = provider2;
    }

    public AddAdSelectEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldFactoryProvider);
    }

    public static AddAdSelectEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdSelectEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdSelectEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdSelectEvent_Factory(provider, provider2);
    }

    public static AddAdSelectEvent newAddAdSelectEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdSelectEvent(c2630h, factory);
    }
}
