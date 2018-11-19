package com.tinder.ads.analytics;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class SponsoredMessageAnalyticsAdAggregatorListener_Factory implements Factory<SponsoredMessageAnalyticsAdAggregatorListener> {
    private final Provider<SponsoredMessageAddAdRequestReceiveEvent> addAdRequestReceiveEventProvider;
    private final Provider<SponsoredMessageAddAdRequestSendEvent> addAdRequestSendEventProvider;

    public SponsoredMessageAnalyticsAdAggregatorListener_Factory(Provider<SponsoredMessageAddAdRequestSendEvent> provider, Provider<SponsoredMessageAddAdRequestReceiveEvent> provider2) {
        this.addAdRequestSendEventProvider = provider;
        this.addAdRequestReceiveEventProvider = provider2;
    }

    public SponsoredMessageAnalyticsAdAggregatorListener get() {
        return provideInstance(this.addAdRequestSendEventProvider, this.addAdRequestReceiveEventProvider);
    }

    public static SponsoredMessageAnalyticsAdAggregatorListener provideInstance(Provider<SponsoredMessageAddAdRequestSendEvent> provider, Provider<SponsoredMessageAddAdRequestReceiveEvent> provider2) {
        return new SponsoredMessageAnalyticsAdAggregatorListener((SponsoredMessageAddAdRequestSendEvent) provider.get(), (SponsoredMessageAddAdRequestReceiveEvent) provider2.get());
    }

    public static SponsoredMessageAnalyticsAdAggregatorListener_Factory create(Provider<SponsoredMessageAddAdRequestSendEvent> provider, Provider<SponsoredMessageAddAdRequestReceiveEvent> provider2) {
        return new SponsoredMessageAnalyticsAdAggregatorListener_Factory(provider, provider2);
    }

    public static SponsoredMessageAnalyticsAdAggregatorListener newSponsoredMessageAnalyticsAdAggregatorListener(SponsoredMessageAddAdRequestSendEvent sponsoredMessageAddAdRequestSendEvent, SponsoredMessageAddAdRequestReceiveEvent sponsoredMessageAddAdRequestReceiveEvent) {
        return new SponsoredMessageAnalyticsAdAggregatorListener(sponsoredMessageAddAdRequestSendEvent, sponsoredMessageAddAdRequestReceiveEvent);
    }
}
