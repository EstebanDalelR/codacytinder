package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SponsoredMessageAddAdRequestReceiveEvent_Factory implements Factory<SponsoredMessageAddAdRequestReceiveEvent> {
    private final Provider<C14729c> adEventFieldsFactoryProvider;
    private final Provider<C2630h> fireworksProvider;

    public SponsoredMessageAddAdRequestReceiveEvent_Factory(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.fireworksProvider = provider;
        this.adEventFieldsFactoryProvider = provider2;
    }

    public SponsoredMessageAddAdRequestReceiveEvent get() {
        return provideInstance(this.fireworksProvider, this.adEventFieldsFactoryProvider);
    }

    public static SponsoredMessageAddAdRequestReceiveEvent provideInstance(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new SponsoredMessageAddAdRequestReceiveEvent((C2630h) provider.get(), (C14729c) provider2.get());
    }

    public static SponsoredMessageAddAdRequestReceiveEvent_Factory create(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new SponsoredMessageAddAdRequestReceiveEvent_Factory(provider, provider2);
    }

    public static SponsoredMessageAddAdRequestReceiveEvent newSponsoredMessageAddAdRequestReceiveEvent(C2630h c2630h, C14729c c14729c) {
        return new SponsoredMessageAddAdRequestReceiveEvent(c2630h, c14729c);
    }
}
