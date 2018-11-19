package com.tinder.recs.rule;

import com.tinder.data.recs.C8776g;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DupesPreventionRule_Factory implements Factory<DupesPreventionRule> {
    private final Provider<C8776g> recsAlreadySwipedProvider;

    public DupesPreventionRule_Factory(Provider<C8776g> provider) {
        this.recsAlreadySwipedProvider = provider;
    }

    public DupesPreventionRule get() {
        return provideInstance(this.recsAlreadySwipedProvider);
    }

    public static DupesPreventionRule provideInstance(Provider<C8776g> provider) {
        return new DupesPreventionRule((C8776g) provider.get());
    }

    public static DupesPreventionRule_Factory create(Provider<C8776g> provider) {
        return new DupesPreventionRule_Factory(provider);
    }

    public static DupesPreventionRule newDupesPreventionRule(C8776g c8776g) {
        return new DupesPreventionRule(c8776g);
    }
}
