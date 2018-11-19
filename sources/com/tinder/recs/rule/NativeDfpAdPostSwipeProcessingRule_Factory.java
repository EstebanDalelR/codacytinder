package com.tinder.recs.rule;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NativeDfpAdPostSwipeProcessingRule_Factory implements Factory<NativeDfpAdPostSwipeProcessingRule> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<AdUrlTracker> adUrlTrackerProvider;

    public NativeDfpAdPostSwipeProcessingRule_Factory(Provider<AdUrlTracker> provider, Provider<AbTestUtility> provider2) {
        this.adUrlTrackerProvider = provider;
        this.abTestUtilityProvider = provider2;
    }

    public NativeDfpAdPostSwipeProcessingRule get() {
        return provideInstance(this.adUrlTrackerProvider, this.abTestUtilityProvider);
    }

    public static NativeDfpAdPostSwipeProcessingRule provideInstance(Provider<AdUrlTracker> provider, Provider<AbTestUtility> provider2) {
        return new NativeDfpAdPostSwipeProcessingRule((AdUrlTracker) provider.get(), (AbTestUtility) provider2.get());
    }

    public static NativeDfpAdPostSwipeProcessingRule_Factory create(Provider<AdUrlTracker> provider, Provider<AbTestUtility> provider2) {
        return new NativeDfpAdPostSwipeProcessingRule_Factory(provider, provider2);
    }

    public static NativeDfpAdPostSwipeProcessingRule newNativeDfpAdPostSwipeProcessingRule(AdUrlTracker adUrlTracker, AbTestUtility abTestUtility) {
        return new NativeDfpAdPostSwipeProcessingRule(adUrlTracker, abTestUtility);
    }
}
