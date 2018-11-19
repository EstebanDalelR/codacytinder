package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdViewEvent_Factory implements Factory<AddAdViewEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdViewEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public AddAdViewEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static AddAdViewEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdViewEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdViewEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdViewEvent_Factory(provider, provider2);
    }

    public static AddAdViewEvent newAddAdViewEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdViewEvent(c2630h, factory);
    }
}
