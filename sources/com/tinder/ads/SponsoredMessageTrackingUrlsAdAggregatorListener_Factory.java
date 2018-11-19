package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.sponsoredmessage.C16845f;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SponsoredMessageTrackingUrlsAdAggregatorListener_Factory implements Factory<SponsoredMessageTrackingUrlsAdAggregatorListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<C16845f> trackingUrlParserProvider;

    public SponsoredMessageTrackingUrlsAdAggregatorListener_Factory(Provider<AdUrlTracker> provider, Provider<C16845f> provider2) {
        this.adUrlTrackerProvider = provider;
        this.trackingUrlParserProvider = provider2;
    }

    public SponsoredMessageTrackingUrlsAdAggregatorListener get() {
        return provideInstance(this.adUrlTrackerProvider, this.trackingUrlParserProvider);
    }

    public static SponsoredMessageTrackingUrlsAdAggregatorListener provideInstance(Provider<AdUrlTracker> provider, Provider<C16845f> provider2) {
        return new SponsoredMessageTrackingUrlsAdAggregatorListener((AdUrlTracker) provider.get(), (C16845f) provider2.get());
    }

    public static SponsoredMessageTrackingUrlsAdAggregatorListener_Factory create(Provider<AdUrlTracker> provider, Provider<C16845f> provider2) {
        return new SponsoredMessageTrackingUrlsAdAggregatorListener_Factory(provider, provider2);
    }

    public static SponsoredMessageTrackingUrlsAdAggregatorListener newSponsoredMessageTrackingUrlsAdAggregatorListener(AdUrlTracker adUrlTracker, C16845f c16845f) {
        return new SponsoredMessageTrackingUrlsAdAggregatorListener(adUrlTracker, c16845f);
    }
}
