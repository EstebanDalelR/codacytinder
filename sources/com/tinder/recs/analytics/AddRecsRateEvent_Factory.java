package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.fireboarding.domain.C11816q;
import com.tinder.managers.bk;
import com.tinder.passport.p302c.C10039a;
import com.tinder.spotify.p415a.C15035a;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsRateEvent_Factory implements Factory<AddRecsRateEvent> {
    private final Provider<C10400d> boostInteractorProvider;
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<C2630h> fireworksProvider;
    private final Provider<bk> managerSharedPreferencesProvider;
    private final Provider<C11816q> observeProgressiveOnboardingProvider;
    private final Provider<C10039a> passportInteractorProvider;
    private final Provider<C15035a> spotifyInteractorProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;

    public AddRecsRateEvent_Factory(Provider<C2630h> provider, Provider<bk> provider2, Provider<C15035a> provider3, Provider<C10400d> provider4, Provider<C10039a> provider5, Provider<SubscriptionProvider> provider6, Provider<FastMatchConfigProvider> provider7, Provider<C11816q> provider8) {
        this.fireworksProvider = provider;
        this.managerSharedPreferencesProvider = provider2;
        this.spotifyInteractorProvider = provider3;
        this.boostInteractorProvider = provider4;
        this.passportInteractorProvider = provider5;
        this.subscriptionProvider = provider6;
        this.fastMatchConfigProvider = provider7;
        this.observeProgressiveOnboardingProvider = provider8;
    }

    public AddRecsRateEvent get() {
        return provideInstance(this.fireworksProvider, this.managerSharedPreferencesProvider, this.spotifyInteractorProvider, this.boostInteractorProvider, this.passportInteractorProvider, this.subscriptionProvider, this.fastMatchConfigProvider, this.observeProgressiveOnboardingProvider);
    }

    public static AddRecsRateEvent provideInstance(Provider<C2630h> provider, Provider<bk> provider2, Provider<C15035a> provider3, Provider<C10400d> provider4, Provider<C10039a> provider5, Provider<SubscriptionProvider> provider6, Provider<FastMatchConfigProvider> provider7, Provider<C11816q> provider8) {
        return new AddRecsRateEvent((C2630h) provider.get(), (bk) provider2.get(), (C15035a) provider3.get(), (C10400d) provider4.get(), (C10039a) provider5.get(), (SubscriptionProvider) provider6.get(), (FastMatchConfigProvider) provider7.get(), (C11816q) provider8.get());
    }

    public static AddRecsRateEvent_Factory create(Provider<C2630h> provider, Provider<bk> provider2, Provider<C15035a> provider3, Provider<C10400d> provider4, Provider<C10039a> provider5, Provider<SubscriptionProvider> provider6, Provider<FastMatchConfigProvider> provider7, Provider<C11816q> provider8) {
        return new AddRecsRateEvent_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static AddRecsRateEvent newAddRecsRateEvent(C2630h c2630h, bk bkVar, C15035a c15035a, C10400d c10400d, C10039a c10039a, SubscriptionProvider subscriptionProvider, FastMatchConfigProvider fastMatchConfigProvider, C11816q c11816q) {
        return new AddRecsRateEvent(c2630h, bkVar, c15035a, c10400d, c10039a, subscriptionProvider, fastMatchConfigProvider, c11816q);
    }
}
