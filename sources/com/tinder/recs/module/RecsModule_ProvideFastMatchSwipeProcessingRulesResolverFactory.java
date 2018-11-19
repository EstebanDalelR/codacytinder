package com.tinder.recs.module;

import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory implements Factory<SwipeProcessingRulesResolver> {
    private final Provider<DupesPreventionRule> dupesPreventionRuleProvider;
    private final RecsModule module;
    private final Provider<SwipeDispatchRule> swipeDispatchRuleProvider;
    private final Provider<UserRecSwipeAnalyticsRule> userRecSwipeAnalyticsRuleProvider;

    public RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3) {
        this.module = recsModule;
        this.swipeDispatchRuleProvider = provider;
        this.dupesPreventionRuleProvider = provider2;
        this.userRecSwipeAnalyticsRuleProvider = provider3;
    }

    public SwipeProcessingRulesResolver get() {
        return provideInstance(this.module, this.swipeDispatchRuleProvider, this.dupesPreventionRuleProvider, this.userRecSwipeAnalyticsRuleProvider);
    }

    public static SwipeProcessingRulesResolver provideInstance(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3) {
        return proxyProvideFastMatchSwipeProcessingRulesResolver(recsModule, C17281c.m63230b(provider), C17281c.m63230b(provider2), C17281c.m63230b(provider3));
    }

    public static RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory create(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3) {
        return new RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory(recsModule, provider, provider2, provider3);
    }

    public static SwipeProcessingRulesResolver proxyProvideFastMatchSwipeProcessingRulesResolver(RecsModule recsModule, Lazy<SwipeDispatchRule> lazy, Lazy<DupesPreventionRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3) {
        return (SwipeProcessingRulesResolver) C15521i.m58001a(recsModule.provideFastMatchSwipeProcessingRulesResolver(lazy, lazy2, lazy3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
