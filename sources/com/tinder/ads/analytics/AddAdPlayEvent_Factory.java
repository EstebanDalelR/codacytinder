package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdPlayEvent_Factory implements Factory<AddAdPlayEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdPlayEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public AddAdPlayEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static AddAdPlayEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdPlayEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdPlayEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdPlayEvent_Factory(provider, provider2);
    }

    public static AddAdPlayEvent newAddAdPlayEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdPlayEvent(c2630h, factory);
    }
}
