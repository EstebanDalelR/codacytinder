package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddAdToggleAudioEvent_Factory implements Factory<AddAdToggleAudioEvent> {
    private final Provider<AdEventFields.Factory> commonFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddAdToggleAudioEvent_Factory(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        this.fireworksProvider = provider;
        this.commonFieldsFactoryProvider = provider2;
    }

    public AddAdToggleAudioEvent get() {
        return provideInstance(this.fireworksProvider, this.commonFieldsFactoryProvider);
    }

    public static AddAdToggleAudioEvent provideInstance(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdToggleAudioEvent((C2630h) provider.get(), (AdEventFields.Factory) provider2.get());
    }

    public static AddAdToggleAudioEvent_Factory create(Provider<C2630h> provider, Provider<AdEventFields.Factory> provider2) {
        return new AddAdToggleAudioEvent_Factory(provider, provider2);
    }

    public static AddAdToggleAudioEvent newAddAdToggleAudioEvent(C2630h c2630h, AdEventFields.Factory factory) {
        return new AddAdToggleAudioEvent(c2630h, factory);
    }
}
