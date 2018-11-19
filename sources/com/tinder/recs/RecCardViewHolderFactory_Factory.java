package com.tinder.recs;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.recs.analytics.V1BrandedProfileCardAdAnalyticsListener;
import com.tinder.recs.view.RecsView;
import com.tinder.recsads.C16429a;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecCardViewHolderFactory_Factory implements Factory<RecCardViewHolderFactory> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<C16429a> adRecCardViewHolderFactoryProvider;
    private final Provider<FireboardingLevelIconViewFactory> fireboardingLevelIconViewFactoryProvider;
    private final Provider<C8609a> loopsExperimentUtilityProvider;
    private final Provider<RecsView> recsViewProvider;
    private final Provider<V1BrandedProfileCardAdAnalyticsListener> v1BrandedProfileCardAdAnalyticsListenerProvider;

    public RecCardViewHolderFactory_Factory(Provider<RecsView> provider, Provider<AbTestUtility> provider2, Provider<V1BrandedProfileCardAdAnalyticsListener> provider3, Provider<C16429a> provider4, Provider<FireboardingLevelIconViewFactory> provider5, Provider<C8609a> provider6) {
        this.recsViewProvider = provider;
        this.abTestUtilityProvider = provider2;
        this.v1BrandedProfileCardAdAnalyticsListenerProvider = provider3;
        this.adRecCardViewHolderFactoryProvider = provider4;
        this.fireboardingLevelIconViewFactoryProvider = provider5;
        this.loopsExperimentUtilityProvider = provider6;
    }

    public RecCardViewHolderFactory get() {
        return provideInstance(this.recsViewProvider, this.abTestUtilityProvider, this.v1BrandedProfileCardAdAnalyticsListenerProvider, this.adRecCardViewHolderFactoryProvider, this.fireboardingLevelIconViewFactoryProvider, this.loopsExperimentUtilityProvider);
    }

    public static RecCardViewHolderFactory provideInstance(Provider<RecsView> provider, Provider<AbTestUtility> provider2, Provider<V1BrandedProfileCardAdAnalyticsListener> provider3, Provider<C16429a> provider4, Provider<FireboardingLevelIconViewFactory> provider5, Provider<C8609a> provider6) {
        return new RecCardViewHolderFactory((RecsView) provider.get(), (AbTestUtility) provider2.get(), (V1BrandedProfileCardAdAnalyticsListener) provider3.get(), (C16429a) provider4.get(), (FireboardingLevelIconViewFactory) provider5.get(), (C8609a) provider6.get());
    }

    public static RecCardViewHolderFactory_Factory create(Provider<RecsView> provider, Provider<AbTestUtility> provider2, Provider<V1BrandedProfileCardAdAnalyticsListener> provider3, Provider<C16429a> provider4, Provider<FireboardingLevelIconViewFactory> provider5, Provider<C8609a> provider6) {
        return new RecCardViewHolderFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static RecCardViewHolderFactory newRecCardViewHolderFactory(RecsView recsView, AbTestUtility abTestUtility, V1BrandedProfileCardAdAnalyticsListener v1BrandedProfileCardAdAnalyticsListener, C16429a c16429a, FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory, C8609a c8609a) {
        return new RecCardViewHolderFactory(recsView, abTestUtility, v1BrandedProfileCardAdAnalyticsListener, c16429a, fireboardingLevelIconViewFactory, c8609a);
    }
}
