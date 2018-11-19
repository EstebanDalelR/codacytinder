package com.tinder.recs.module;

import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.rule.RecsSessionTrackerRule;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_RecsSessionTrackerRuleFactory implements Factory<RecsSessionTrackerRule> {
    private final RecsModule module;
    private final Provider<RecsSessionTracker> recsSessionTrackerProvider;

    public RecsModule_RecsSessionTrackerRuleFactory(RecsModule recsModule, Provider<RecsSessionTracker> provider) {
        this.module = recsModule;
        this.recsSessionTrackerProvider = provider;
    }

    public RecsSessionTrackerRule get() {
        return provideInstance(this.module, this.recsSessionTrackerProvider);
    }

    public static RecsSessionTrackerRule provideInstance(RecsModule recsModule, Provider<RecsSessionTracker> provider) {
        return proxyRecsSessionTrackerRule(recsModule, (RecsSessionTracker) provider.get());
    }

    public static RecsModule_RecsSessionTrackerRuleFactory create(RecsModule recsModule, Provider<RecsSessionTracker> provider) {
        return new RecsModule_RecsSessionTrackerRuleFactory(recsModule, provider);
    }

    public static RecsSessionTrackerRule proxyRecsSessionTrackerRule(RecsModule recsModule, RecsSessionTracker recsSessionTracker) {
        return (RecsSessionTrackerRule) C15521i.m58001a(recsModule.recsSessionTrackerRule(recsSessionTracker), "Cannot return null from a non-@Nullable @Provides method");
    }
}
