package com.tinder.recs.rule;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TutorialSwipeRule_Factory implements Factory<TutorialSwipeRule> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<bk> managerSharedPreferencesProvider;
    private final Provider<C11811o> observeFireboardingConfigProvider;

    public TutorialSwipeRule_Factory(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<C11811o> provider3) {
        this.managerSharedPreferencesProvider = provider;
        this.abTestUtilityProvider = provider2;
        this.observeFireboardingConfigProvider = provider3;
    }

    public TutorialSwipeRule get() {
        return provideInstance(this.managerSharedPreferencesProvider, this.abTestUtilityProvider, this.observeFireboardingConfigProvider);
    }

    public static TutorialSwipeRule provideInstance(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<C11811o> provider3) {
        return new TutorialSwipeRule((bk) provider.get(), (AbTestUtility) provider2.get(), (C11811o) provider3.get());
    }

    public static TutorialSwipeRule_Factory create(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<C11811o> provider3) {
        return new TutorialSwipeRule_Factory(provider, provider2, provider3);
    }

    public static TutorialSwipeRule newTutorialSwipeRule(bk bkVar, AbTestUtility abTestUtility, C11811o c11811o) {
        return new TutorialSwipeRule(bkVar, abTestUtility, c11811o);
    }
}
