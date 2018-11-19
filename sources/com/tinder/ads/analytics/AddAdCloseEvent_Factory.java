package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdCloseEvent_Factory implements Factory<AddAdCloseEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdCloseEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public AddAdCloseEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static AddAdCloseEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdCloseEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdCloseEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdCloseEvent_Factory(provider, provider2);
    }

    public static AddAdCloseEvent newAddAdCloseEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdCloseEvent(c2630h, factory);
    }
}
