package com.tinder.recs.analytics;

import com.tinder.addy.tracker.AdUrlTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class V1BrandedProfileCardAdAnalyticsListener_Factory implements Factory<V1BrandedProfileCardAdAnalyticsListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;

    public V1BrandedProfileCardAdAnalyticsListener_Factory(Provider<AdUrlTracker> provider) {
        this.adUrlTrackerProvider = provider;
    }

    public V1BrandedProfileCardAdAnalyticsListener get() {
        return provideInstance(this.adUrlTrackerProvider);
    }

    public static V1BrandedProfileCardAdAnalyticsListener provideInstance(Provider<AdUrlTracker> provider) {
        return new V1BrandedProfileCardAdAnalyticsListener((AdUrlTracker) provider.get());
    }

    public static V1BrandedProfileCardAdAnalyticsListener_Factory create(Provider<AdUrlTracker> provider) {
        return new V1BrandedProfileCardAdAnalyticsListener_Factory(provider);
    }

    public static V1BrandedProfileCardAdAnalyticsListener newV1BrandedProfileCardAdAnalyticsListener(AdUrlTracker adUrlTracker) {
        return new V1BrandedProfileCardAdAnalyticsListener(adUrlTracker);
    }
}
