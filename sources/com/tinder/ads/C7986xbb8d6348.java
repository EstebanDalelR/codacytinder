package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16460j;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.ads.AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory */
public final class C7986xbb8d6348 implements Factory<AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<C6194x5aac58a0> mapperProvider;
    private final Provider<C16460j> parserProvider;

    public C7986xbb8d6348(Provider<AdUrlTracker> provider, Provider<C6194x5aac58a0> provider2, Provider<C16460j> provider3) {
        this.adUrlTrackerProvider = provider;
        this.mapperProvider = provider2;
        this.parserProvider = provider3;
    }

    public AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener get() {
        return C7986xbb8d6348.provideInstance(this.adUrlTrackerProvider, this.mapperProvider, this.parserProvider);
    }

    public static AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener provideInstance(Provider<AdUrlTracker> provider, Provider<C6194x5aac58a0> provider2, Provider<C16460j> provider3) {
        return new AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener((AdUrlTracker) provider.get(), (C6194x5aac58a0) provider2.get(), (C16460j) provider3.get());
    }

    public static C7986xbb8d6348 create(Provider<AdUrlTracker> provider, Provider<C6194x5aac58a0> provider2, Provider<C16460j> provider3) {
        return new C7986xbb8d6348(provider, provider2, provider3);
    }

    public static AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener newAddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener(AdUrlTracker adUrlTracker, C6194x5aac58a0 c6194x5aac58a0, C16460j c16460j) {
        return new AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener(adUrlTracker, c6194x5aac58a0, c16460j);
    }
}
