package com.tinder.ads.presenter;

import com.tinder.ads.analytics.AddAdCompleteEvent;
import com.tinder.ads.analytics.AddAdPlayEvent;
import com.tinder.ads.analytics.AddAdSelectEvent;
import com.tinder.ads.analytics.AddAdToggleAudioEvent;
import com.tinder.ads.analytics.AddAdViewEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FanAdPresenter_Factory implements Factory<FanAdPresenter> {
    private final Provider<AddAdCompleteEvent> addAdCompleteEventProvider;
    private final Provider<AddAdPlayEvent> addAdPlayEventProvider;
    private final Provider<AddAdSelectEvent> addAdSelectEventProvider;
    private final Provider<AddAdToggleAudioEvent> addAdToggleAudioEventProvider;
    private final Provider<AddAdViewEvent> addAdViewEventProvider;

    public FanAdPresenter_Factory(Provider<AddAdViewEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdPlayEvent> provider3, Provider<AddAdCompleteEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        this.addAdViewEventProvider = provider;
        this.addAdToggleAudioEventProvider = provider2;
        this.addAdPlayEventProvider = provider3;
        this.addAdCompleteEventProvider = provider4;
        this.addAdSelectEventProvider = provider5;
    }

    public FanAdPresenter get() {
        return provideInstance(this.addAdViewEventProvider, this.addAdToggleAudioEventProvider, this.addAdPlayEventProvider, this.addAdCompleteEventProvider, this.addAdSelectEventProvider);
    }

    public static FanAdPresenter provideInstance(Provider<AddAdViewEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdPlayEvent> provider3, Provider<AddAdCompleteEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        return new FanAdPresenter((AddAdViewEvent) provider.get(), (AddAdToggleAudioEvent) provider2.get(), (AddAdPlayEvent) provider3.get(), (AddAdCompleteEvent) provider4.get(), (AddAdSelectEvent) provider5.get());
    }

    public static FanAdPresenter_Factory create(Provider<AddAdViewEvent> provider, Provider<AddAdToggleAudioEvent> provider2, Provider<AddAdPlayEvent> provider3, Provider<AddAdCompleteEvent> provider4, Provider<AddAdSelectEvent> provider5) {
        return new FanAdPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static FanAdPresenter newFanAdPresenter(AddAdViewEvent addAdViewEvent, AddAdToggleAudioEvent addAdToggleAudioEvent, AddAdPlayEvent addAdPlayEvent, AddAdCompleteEvent addAdCompleteEvent, AddAdSelectEvent addAdSelectEvent) {
        return new FanAdPresenter(addAdViewEvent, addAdToggleAudioEvent, addAdPlayEvent, addAdCompleteEvent, addAdSelectEvent);
    }
}
