package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdCompleteEvent_Factory implements Factory<AddAdCompleteEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdCompleteEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public AddAdCompleteEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static AddAdCompleteEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdCompleteEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdCompleteEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdCompleteEvent_Factory(provider, provider2);
    }

    public static AddAdCompleteEvent newAddAdCompleteEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdCompleteEvent(c2630h, factory);
    }
}
