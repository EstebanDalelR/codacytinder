package com.tinder.recs.rule;

import com.tinder.fireboarding.domain.C11808l;
import com.tinder.fireboarding.domain.C11811o;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FireboardingSuperlikeRule_Factory implements Factory<FireboardingSuperlikeRule> {
    private final Provider<C11808l> isSuperlikeEnabledProvider;
    private final Provider<C11811o> observeFireboardingConfigProvider;

    public FireboardingSuperlikeRule_Factory(Provider<C11808l> provider, Provider<C11811o> provider2) {
        this.isSuperlikeEnabledProvider = provider;
        this.observeFireboardingConfigProvider = provider2;
    }

    public FireboardingSuperlikeRule get() {
        return provideInstance(this.isSuperlikeEnabledProvider, this.observeFireboardingConfigProvider);
    }

    public static FireboardingSuperlikeRule provideInstance(Provider<C11808l> provider, Provider<C11811o> provider2) {
        return new FireboardingSuperlikeRule((C11808l) provider.get(), (C11811o) provider2.get());
    }

    public static FireboardingSuperlikeRule_Factory create(Provider<C11808l> provider, Provider<C11811o> provider2) {
        return new FireboardingSuperlikeRule_Factory(provider, provider2);
    }

    public static FireboardingSuperlikeRule newFireboardingSuperlikeRule(C11808l c11808l, C11811o c11811o) {
        return new FireboardingSuperlikeRule(c11808l, c11811o);
    }
}
