package com.tinder.recs.controller;

import com.tinder.ads.analytics.AddAdCompleteEvent;
import com.tinder.ads.analytics.AddAdPlayEvent;
import com.tinder.ads.analytics.AddAdSelectEvent;
import com.tinder.ads.analytics.AddAdToggleAudioEvent;
import com.tinder.ads.analytics.AddAdViewEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsNativeDfpAdController_Factory implements Factory<RecsNativeDfpAdController> {
    private final Provider<AddAdCompleteEvent> addAdCompleteEventProvider;
    private final Provider<AddAdPlayEvent> addAdPlayEventProvider;
    private final Provider<AddAdSelectEvent> addAdSelectEventProvider;
    private final Provider<AddAdToggleAudioEvent> addAdToggleAudioEventProvider;
    private final Provider<AddAdViewEvent> addAdViewEventProvider;

    public RecsNativeDfpAdController_Factory(Provider<AddAdPlayEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdCompleteEvent> provider3, Provider<AddAdViewEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        this.addAdPlayEventProvider = provider;
        this.addAdToggleAudioEventProvider = provider2;
        this.addAdCompleteEventProvider = provider3;
        this.addAdViewEventProvider = provider4;
        this.addAdSelectEventProvider = provider5;
    }

    public RecsNativeDfpAdController get() {
        return provideInstance(this.addAdPlayEventProvider, this.addAdToggleAudioEventProvider, this.addAdCompleteEventProvider, this.addAdViewEventProvider, this.addAdSelectEventProvider);
    }

    public static RecsNativeDfpAdController provideInstance(Provider<AddAdPlayEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdCompleteEvent> provider3, Provider<AddAdViewEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        return new RecsNativeDfpAdController((AddAdPlayEvent) provider.get(), (AddAdToggleAudioEvent) provider2.get(), (AddAdCompleteEvent) provider3.get(), (AddAdViewEvent) provider4.get(), (AddAdSelectEvent) provider5.get());
    }

    public static RecsNativeDfpAdController_Factory create(Provider<AddAdPlayEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdCompleteEvent> provider3, Provider<AddAdViewEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        return new RecsNativeDfpAdController_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static RecsNativeDfpAdController newRecsNativeDfpAdController(AddAdPlayEvent addAdPlayEvent, AddAdToggleAudioEvent addAdToggleAudioEvent, AddAdCompleteEvent addAdCompleteEvent, AddAdViewEvent addAdViewEvent, AddAdSelectEvent addAdSelectEvent) {
        return new RecsNativeDfpAdController(addAdPlayEvent, addAdToggleAudioEvent, addAdCompleteEvent, addAdViewEvent, addAdSelectEvent);
    }
}
