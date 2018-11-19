package com.tinder.recs.rule;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.analytics.V1AddAdOpenEvent;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recsads.analytics.AddAdOpenEvent;
import com.tinder.recsads.analytics.C16438p;
import com.tinder.recsads.analytics.CtaBounceBackTimer;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AdSwipeTerminationRule_Factory implements Factory<AdSwipeTerminationRule> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<AdUrlTracker> adUrlTrackerProvider;
    private final Provider<AddAdOpenEvent> addAdOpenEventProvider;
    private final Provider<C16438p> addAdSelectEventProvider;
    private final Provider<RecsAdsConfig> configProvider;
    private final Provider<CtaBounceBackTimer> ctaBounceBackTimerProvider;
    private final Provider<V1AddAdOpenEvent> v1AddAdOpenEventProvider;

    public AdSwipeTerminationRule_Factory(Provider<RecsAdsConfig> provider, Provider<AdUrlTracker> provider2, Provider<AbTestUtility> provider3, Provider<C16438p> provider4, Provider<CtaBounceBackTimer> provider5, Provider<AddAdOpenEvent> provider6, Provider<V1AddAdOpenEvent> provider7) {
        this.configProvider = provider;
        this.adUrlTrackerProvider = provider2;
        this.abTestUtilityProvider = provider3;
        this.addAdSelectEventProvider = provider4;
        this.ctaBounceBackTimerProvider = provider5;
        this.addAdOpenEventProvider = provider6;
        this.v1AddAdOpenEventProvider = provider7;
    }

    public AdSwipeTerminationRule get() {
        return provideInstance(this.configProvider, this.adUrlTrackerProvider, this.abTestUtilityProvider, this.addAdSelectEventProvider, this.ctaBounceBackTimerProvider, this.addAdOpenEventProvider, this.v1AddAdOpenEventProvider);
    }

    public static AdSwipeTerminationRule provideInstance(Provider<RecsAdsConfig> provider, Provider<AdUrlTracker> provider2, Provider<AbTestUtility> provider3, Provider<C16438p> provider4, Provider<CtaBounceBackTimer> provider5, Provider<AddAdOpenEvent> provider6, Provider<V1AddAdOpenEvent> provider7) {
        return new AdSwipeTerminationRule((RecsAdsConfig) provider.get(), (AdUrlTracker) provider2.get(), (AbTestUtility) provider3.get(), (C16438p) provider4.get(), (CtaBounceBackTimer) provider5.get(), (AddAdOpenEvent) provider6.get(), (V1AddAdOpenEvent) provider7.get());
    }

    public static AdSwipeTerminationRule_Factory create(Provider<RecsAdsConfig> provider, Provider<AdUrlTracker> provider2, Provider<AbTestUtility> provider3, Provider<C16438p> provider4, Provider<CtaBounceBackTimer> provider5, Provider<AddAdOpenEvent> provider6, Provider<V1AddAdOpenEvent> provider7) {
        return new AdSwipeTerminationRule_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AdSwipeTerminationRule newAdSwipeTerminationRule(RecsAdsConfig recsAdsConfig, AdUrlTracker adUrlTracker, AbTestUtility abTestUtility, C16438p c16438p, CtaBounceBackTimer ctaBounceBackTimer, AddAdOpenEvent addAdOpenEvent, V1AddAdOpenEvent v1AddAdOpenEvent) {
        return new AdSwipeTerminationRule(recsAdsConfig, adUrlTracker, abTestUtility, c16438p, ctaBounceBackTimer, addAdOpenEvent, v1AddAdOpenEvent);
    }
}
