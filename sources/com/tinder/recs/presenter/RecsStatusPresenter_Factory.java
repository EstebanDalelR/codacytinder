package com.tinder.recs.presenter;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.aa;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bj;
import com.tinder.paywall.paywallflow.C10077p;
import com.tinder.recs.analytics.AddRecsInteractEvent;
import com.tinder.recs.provider.RecsDecoratedLoadingStatusProvider;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class RecsStatusPresenter_Factory implements Factory<RecsStatusPresenter> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<AddRecsInteractEvent> addRecsInteractEventProvider;
    private final Provider<C2664c> eventBusProvider;
    private final Provider<C2630h> fireworksProvider;
    private final Provider<ManagerProfile> managerProfileProvider;
    private final Provider<bj> managerSettingsProvider;
    private final Provider<C10077p> paywallFlowFactoryProvider;
    private final Provider<RecsDecoratedLoadingStatusProvider> recsDecoratedLoadingStatusProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<RecsStatusMessageResolver> recsStatusMessageResolverProvider;
    private final Provider<aa> startTinderEventProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;
    private final Provider<C15193i> tinderPlusInteractorProvider;

    public RecsStatusPresenter_Factory(Provider<ManagerProfile> provider, Provider<C2664c> provider2, Provider<RecsEngineRegistry> provider3, Provider<bj> provider4, Provider<C2630h> provider5, Provider<AbTestUtility> provider6, Provider<C15193i> provider7, Provider<RecsStatusMessageResolver> provider8, Provider<RecsDecoratedLoadingStatusProvider> provider9, Provider<aa> provider10, Provider<SubscriptionProvider> provider11, Provider<C10077p> provider12, Provider<AddRecsInteractEvent> provider13) {
        this.managerProfileProvider = provider;
        this.eventBusProvider = provider2;
        this.recsEngineRegistryProvider = provider3;
        this.managerSettingsProvider = provider4;
        this.fireworksProvider = provider5;
        this.abTestUtilityProvider = provider6;
        this.tinderPlusInteractorProvider = provider7;
        this.recsStatusMessageResolverProvider = provider8;
        this.recsDecoratedLoadingStatusProvider = provider9;
        this.startTinderEventProvider = provider10;
        this.subscriptionProvider = provider11;
        this.paywallFlowFactoryProvider = provider12;
        this.addRecsInteractEventProvider = provider13;
    }

    public RecsStatusPresenter get() {
        return provideInstance(this.managerProfileProvider, this.eventBusProvider, this.recsEngineRegistryProvider, this.managerSettingsProvider, this.fireworksProvider, this.abTestUtilityProvider, this.tinderPlusInteractorProvider, this.recsStatusMessageResolverProvider, this.recsDecoratedLoadingStatusProvider, this.startTinderEventProvider, this.subscriptionProvider, this.paywallFlowFactoryProvider, this.addRecsInteractEventProvider);
    }

    public static RecsStatusPresenter provideInstance(Provider<ManagerProfile> provider, Provider<C2664c> provider2, Provider<RecsEngineRegistry> provider3, Provider<bj> provider4, Provider<C2630h> provider5, Provider<AbTestUtility> provider6, Provider<C15193i> provider7, Provider<RecsStatusMessageResolver> provider8, Provider<RecsDecoratedLoadingStatusProvider> provider9, Provider<aa> provider10, Provider<SubscriptionProvider> provider11, Provider<C10077p> provider12, Provider<AddRecsInteractEvent> provider13) {
        return new RecsStatusPresenter((ManagerProfile) provider.get(), (C2664c) provider2.get(), (RecsEngineRegistry) provider3.get(), (bj) provider4.get(), (C2630h) provider5.get(), (AbTestUtility) provider6.get(), (C15193i) provider7.get(), (RecsStatusMessageResolver) provider8.get(), (RecsDecoratedLoadingStatusProvider) provider9.get(), (aa) provider10.get(), (SubscriptionProvider) provider11.get(), (C10077p) provider12.get(), (AddRecsInteractEvent) provider13.get());
    }

    public static RecsStatusPresenter_Factory create(Provider<ManagerProfile> provider, Provider<C2664c> provider2, Provider<RecsEngineRegistry> provider3, Provider<bj> provider4, Provider<C2630h> provider5, Provider<AbTestUtility> provider6, Provider<C15193i> provider7, Provider<RecsStatusMessageResolver> provider8, Provider<RecsDecoratedLoadingStatusProvider> provider9, Provider<aa> provider10, Provider<SubscriptionProvider> provider11, Provider<C10077p> provider12, Provider<AddRecsInteractEvent> provider13) {
        return new RecsStatusPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static RecsStatusPresenter newRecsStatusPresenter(ManagerProfile managerProfile, C2664c c2664c, RecsEngineRegistry recsEngineRegistry, bj bjVar, C2630h c2630h, AbTestUtility abTestUtility, C15193i c15193i, RecsStatusMessageResolver recsStatusMessageResolver, RecsDecoratedLoadingStatusProvider recsDecoratedLoadingStatusProvider, aa aaVar, SubscriptionProvider subscriptionProvider, C10077p c10077p, AddRecsInteractEvent addRecsInteractEvent) {
        return new RecsStatusPresenter(managerProfile, c2664c, recsEngineRegistry, bjVar, c2630h, abTestUtility, c15193i, recsStatusMessageResolver, recsDecoratedLoadingStatusProvider, aaVar, subscriptionProvider, c10077p, addRecsInteractEvent);
    }
}
