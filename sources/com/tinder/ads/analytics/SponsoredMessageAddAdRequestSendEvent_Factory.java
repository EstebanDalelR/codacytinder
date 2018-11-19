package com.tinder.ads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SponsoredMessageAddAdRequestSendEvent_Factory implements Factory<SponsoredMessageAddAdRequestSendEvent> {
    private final Provider<C2630h> fireworksProvider;

    public SponsoredMessageAddAdRequestSendEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public SponsoredMessageAddAdRequestSendEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static SponsoredMessageAddAdRequestSendEvent provideInstance(Provider<C2630h> provider) {
        return new SponsoredMessageAddAdRequestSendEvent((C2630h) provider.get());
    }

    public static SponsoredMessageAddAdRequestSendEvent_Factory create(Provider<C2630h> provider) {
        return new SponsoredMessageAddAdRequestSendEvent_Factory(provider);
    }

    public static SponsoredMessageAddAdRequestSendEvent newSponsoredMessageAddAdRequestSendEvent(C2630h c2630h) {
        return new SponsoredMessageAddAdRequestSendEvent(c2630h);
    }
}
