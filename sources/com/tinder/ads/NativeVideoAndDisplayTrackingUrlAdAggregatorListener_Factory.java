package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16460j;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory implements Factory<NativeVideoAndDisplayTrackingUrlAdAggregatorListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<C16460j> parserProvider;

    public NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory(Provider<AdUrlTracker> provider, Provider<C16460j> provider2) {
        this.adUrlTrackerProvider = provider;
        this.parserProvider = provider2;
    }

    public NativeVideoAndDisplayTrackingUrlAdAggregatorListener get() {
        return provideInstance(this.adUrlTrackerProvider, this.parserProvider);
    }

    public static NativeVideoAndDisplayTrackingUrlAdAggregatorListener provideInstance(Provider<AdUrlTracker> provider, Provider<C16460j> provider2) {
        return new NativeVideoAndDisplayTrackingUrlAdAggregatorListener((AdUrlTracker) provider.get(), (C16460j) provider2.get());
    }

    public static NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory create(Provider<AdUrlTracker> provider, Provider<C16460j> provider2) {
        return new NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory(provider, provider2);
    }

    public static NativeVideoAndDisplayTrackingUrlAdAggregatorListener newNativeVideoAndDisplayTrackingUrlAdAggregatorListener(AdUrlTracker adUrlTracker, C16460j c16460j) {
        return new NativeVideoAndDisplayTrackingUrlAdAggregatorListener(adUrlTracker, c16460j);
    }
}
