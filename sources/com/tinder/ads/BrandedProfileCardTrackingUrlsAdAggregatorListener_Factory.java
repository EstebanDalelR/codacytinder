package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16457d;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory implements Factory<BrandedProfileCardTrackingUrlsAdAggregatorListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<C16457d> trackingUrlParserProvider;

    public BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory(Provider<AdUrlTracker> provider, Provider<C16457d> provider2) {
        this.adUrlTrackerProvider = provider;
        this.trackingUrlParserProvider = provider2;
    }

    public BrandedProfileCardTrackingUrlsAdAggregatorListener get() {
        return provideInstance(this.adUrlTrackerProvider, this.trackingUrlParserProvider);
    }

    public static BrandedProfileCardTrackingUrlsAdAggregatorListener provideInstance(Provider<AdUrlTracker> provider, Provider<C16457d> provider2) {
        return new BrandedProfileCardTrackingUrlsAdAggregatorListener((AdUrlTracker) provider.get(), (C16457d) provider2.get());
    }

    public static BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory create(Provider<AdUrlTracker> provider, Provider<C16457d> provider2) {
        return new BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory(provider, provider2);
    }

    public static BrandedProfileCardTrackingUrlsAdAggregatorListener newBrandedProfileCardTrackingUrlsAdAggregatorListener(AdUrlTracker adUrlTracker, C16457d c16457d) {
        return new BrandedProfileCardTrackingUrlsAdAggregatorListener(adUrlTracker, c16457d);
    }
}
