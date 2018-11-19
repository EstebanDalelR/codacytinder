package com.tinder.recs.rule;

import com.tinder.analytics.p154c.C6213a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SuperLikeableGamePlayRule_Factory implements Factory<SuperLikeableGamePlayRule> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<SuperLikeableGamePlayCoordinator> superLikeableGameCoordinatorProvider;
    private final Provider<C6213a> trackSuperlikeableAvailableEventProvider;

    public SuperLikeableGamePlayRule_Factory(Provider<SuperLikeableGamePlayCoordinator> provider, Provider<AbTestUtility> provider2, Provider<C6213a> provider3) {
        this.superLikeableGameCoordinatorProvider = provider;
        this.abTestUtilityProvider = provider2;
        this.trackSuperlikeableAvailableEventProvider = provider3;
    }

    public SuperLikeableGamePlayRule get() {
        return provideInstance(this.superLikeableGameCoordinatorProvider, this.abTestUtilityProvider, this.trackSuperlikeableAvailableEventProvider);
    }

    public static SuperLikeableGamePlayRule provideInstance(Provider<SuperLikeableGamePlayCoordinator> provider, Provider<AbTestUtility> provider2, Provider<C6213a> provider3) {
        return new SuperLikeableGamePlayRule((SuperLikeableGamePlayCoordinator) provider.get(), (AbTestUtility) provider2.get(), (C6213a) provider3.get());
    }

    public static SuperLikeableGamePlayRule_Factory create(Provider<SuperLikeableGamePlayCoordinator> provider, Provider<AbTestUtility> provider2, Provider<C6213a> provider3) {
        return new SuperLikeableGamePlayRule_Factory(provider, provider2, provider3);
    }

    public static SuperLikeableGamePlayRule newSuperLikeableGamePlayRule(SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator, AbTestUtility abTestUtility, C6213a c6213a) {
        return new SuperLikeableGamePlayRule(superLikeableGamePlayCoordinator, abTestUtility, c6213a);
    }
}
