package com.tinder.recs.module;

import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory implements Factory<SwipeProcessingRulesResolver> {
    private final Provider<DupesPreventionRule> dupesPreventionRuleProvider;
    private final Provider<LocalOutOfLikesBouncerRule> localOutOfLikesBouncerRuleProvider;
    private final RecsModule module;
    private final Provider<SwipeDispatchRule> swipeDispatchRuleProvider;
    private final Provider<UserRecSwipeAnalyticsRule> userRecSwipeAnalyticsRuleProvider;

    public RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<LocalOutOfLikesBouncerRule> provider4) {
        this.module = recsModule;
        this.swipeDispatchRuleProvider = provider;
        this.dupesPreventionRuleProvider = provider2;
        this.userRecSwipeAnalyticsRuleProvider = provider3;
        this.localOutOfLikesBouncerRuleProvider = provider4;
    }

    public SwipeProcessingRulesResolver get() {
        return provideInstance(this.module, this.swipeDispatchRuleProvider, this.dupesPreventionRuleProvider, this.userRecSwipeAnalyticsRuleProvider, this.localOutOfLikesBouncerRuleProvider);
    }

    public static SwipeProcessingRulesResolver provideInstance(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<LocalOutOfLikesBouncerRule> provider4) {
        return proxyProvidePlacesSwipeProcessingRulesResolver(recsModule, C17281c.m63230b(provider), C17281c.m63230b(provider2), C17281c.m63230b(provider3), C17281c.m63230b(provider4));
    }

    public static RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory create(RecsModule recsModule, Provider<SwipeDispatchRule> provider, Provider<DupesPreventionRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<LocalOutOfLikesBouncerRule> provider4) {
        return new RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory(recsModule, provider, provider2, provider3, provider4);
    }

    public static SwipeProcessingRulesResolver proxyProvidePlacesSwipeProcessingRulesResolver(RecsModule recsModule, Lazy<SwipeDispatchRule> lazy, Lazy<DupesPreventionRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3, Lazy<LocalOutOfLikesBouncerRule> lazy4) {
        return (SwipeProcessingRulesResolver) C15521i.m58001a(recsModule.providePlacesSwipeProcessingRulesResolver(lazy, lazy2, lazy3, lazy4), "Cannot return null from a non-@Nullable @Provides method");
    }
}
