package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16457d;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory implements Factory<AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener> {
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<C6193x7293fe> addyV2BrandedProfileCardAdMapperProvider;
    private final Provider<C16457d> brandedProfileCardTrackingUrlParserProvider;

    public AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory(Provider<AdUrlTracker> provider, Provider<C6193x7293fe> provider2, Provider<C16457d> provider3) {
        this.adUrlTrackerProvider = provider;
        this.addyV2BrandedProfileCardAdMapperProvider = provider2;
        this.brandedProfileCardTrackingUrlParserProvider = provider3;
    }

    public AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener get() {
        return provideInstance(this.adUrlTrackerProvider, this.addyV2BrandedProfileCardAdMapperProvider, this.brandedProfileCardTrackingUrlParserProvider);
    }

    public static AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener provideInstance(Provider<AdUrlTracker> provider, Provider<C6193x7293fe> provider2, Provider<C16457d> provider3) {
        return new AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener((AdUrlTracker) provider.get(), (C6193x7293fe) provider2.get(), (C16457d) provider3.get());
    }

    public static AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory create(Provider<AdUrlTracker> provider, Provider<C6193x7293fe> provider2, Provider<C16457d> provider3) {
        return new AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory(provider, provider2, provider3);
    }

    public static AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener newAddyV2BrandedProfileCardTrackingUrlAdAggregatorListener(AdUrlTracker adUrlTracker, C6193x7293fe c6193x7293fe, C16457d c16457d) {
        return new AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener(adUrlTracker, c6193x7293fe, c16457d);
    }
}
