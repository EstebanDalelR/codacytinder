package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.passport.p302c.C10039a;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsRewindEvent_Factory implements Factory<AddRecsRewindEvent> {
    private final Provider<C2630h> fireworksProvider;
    private final Provider<C10039a> passportInteractorProvider;
    private final Provider<RewindsAvailableRepository> rewindsAvailableRepositoryProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;

    public AddRecsRewindEvent_Factory(Provider<C2630h> provider, Provider<C10039a> provider2, Provider<SubscriptionProvider> provider3, Provider<RewindsAvailableRepository> provider4) {
        this.fireworksProvider = provider;
        this.passportInteractorProvider = provider2;
        this.subscriptionProvider = provider3;
        this.rewindsAvailableRepositoryProvider = provider4;
    }

    public AddRecsRewindEvent get() {
        return provideInstance(this.fireworksProvider, this.passportInteractorProvider, this.subscriptionProvider, this.rewindsAvailableRepositoryProvider);
    }

    public static AddRecsRewindEvent provideInstance(Provider<C2630h> provider, Provider<C10039a> provider2, Provider<SubscriptionProvider> provider3, Provider<RewindsAvailableRepository> provider4) {
        return new AddRecsRewindEvent((C2630h) provider.get(), (C10039a) provider2.get(), (SubscriptionProvider) provider3.get(), (RewindsAvailableRepository) provider4.get());
    }

    public static AddRecsRewindEvent_Factory create(Provider<C2630h> provider, Provider<C10039a> provider2, Provider<SubscriptionProvider> provider3, Provider<RewindsAvailableRepository> provider4) {
        return new AddRecsRewindEvent_Factory(provider, provider2, provider3, provider4);
    }

    public static AddRecsRewindEvent newAddRecsRewindEvent(C2630h c2630h, C10039a c10039a, SubscriptionProvider subscriptionProvider, RewindsAvailableRepository rewindsAvailableRepository) {
        return new AddRecsRewindEvent(c2630h, c10039a, subscriptionProvider, rewindsAvailableRepository);
    }
}
