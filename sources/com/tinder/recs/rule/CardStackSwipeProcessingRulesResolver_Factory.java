package com.tinder.recs.rule;

import com.tinder.recs.domain.rule.SwipeCountSwipeTerminationRule;
import com.tinder.recsads.rule.BrandedProfileCardMatchInsertionRule;
import com.tinder.recsads.rule.C18030a;
import dagger.Lazy;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CardStackSwipeProcessingRulesResolver_Factory implements Factory<CardStackSwipeProcessingRulesResolver> {
    private final Provider<C18030a> adRecsInjectionRuleProvider;
    private final Provider<AdSwipeTerminationRule> adSwipeTerminationRuleProvider;
    private final Provider<BrandedProfileCardMatchInsertionRule> brandedProfileCardMatchInsertionRuleProvider;
    private final Provider<DupesPreventionRule> dupesPreventionRuleProvider;
    private final Provider<FireboardingSuperlikeRule> fireboardingSuperlikeRuleProvider;
    private final Provider<LocalOutOfLikesBouncerRule> localOutOfLikesBouncerRuleProvider;
    private final Provider<NativeDfpAdPostSwipeProcessingRule> nativeDfpAdPostSwipeProcessingRuleProvider;
    private final Provider<RecsSessionTrackerRule> recsSessionTrackerRuleProvider;
    private final Provider<SuperLikeableGamePlayRule> superLikeableGamePlayRuleProvider;
    private final Provider<SwipeCadenceControlRule> swipeCadenceControlRuleProvider;
    private final Provider<SwipeCountSwipeTerminationRule> swipeCountTerminationRuleProvider;
    private final Provider<SwipeDispatchRule> swipeDispatchRuleProvider;
    private final Provider<TutorialSwipeRule> swipeTutorialRuleProvider;
    private final Provider<UserRecSwipeAnalyticsRule> userRecSwipeAnalyticsRuleProvider;

    public CardStackSwipeProcessingRulesResolver_Factory(Provider<TutorialSwipeRule> provider, Provider<LocalOutOfLikesBouncerRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<SwipeDispatchRule> provider4, Provider<DupesPreventionRule> provider5, Provider<C18030a> provider6, Provider<SuperLikeableGamePlayRule> provider7, Provider<SwipeCadenceControlRule> provider8, Provider<AdSwipeTerminationRule> provider9, Provider<NativeDfpAdPostSwipeProcessingRule> provider10, Provider<BrandedProfileCardMatchInsertionRule> provider11, Provider<SwipeCountSwipeTerminationRule> provider12, Provider<RecsSessionTrackerRule> provider13, Provider<FireboardingSuperlikeRule> provider14) {
        this.swipeTutorialRuleProvider = provider;
        this.localOutOfLikesBouncerRuleProvider = provider2;
        this.userRecSwipeAnalyticsRuleProvider = provider3;
        this.swipeDispatchRuleProvider = provider4;
        this.dupesPreventionRuleProvider = provider5;
        this.adRecsInjectionRuleProvider = provider6;
        this.superLikeableGamePlayRuleProvider = provider7;
        this.swipeCadenceControlRuleProvider = provider8;
        this.adSwipeTerminationRuleProvider = provider9;
        this.nativeDfpAdPostSwipeProcessingRuleProvider = provider10;
        this.brandedProfileCardMatchInsertionRuleProvider = provider11;
        this.swipeCountTerminationRuleProvider = provider12;
        this.recsSessionTrackerRuleProvider = provider13;
        this.fireboardingSuperlikeRuleProvider = provider14;
    }

    public CardStackSwipeProcessingRulesResolver get() {
        return provideInstance(this.swipeTutorialRuleProvider, this.localOutOfLikesBouncerRuleProvider, this.userRecSwipeAnalyticsRuleProvider, this.swipeDispatchRuleProvider, this.dupesPreventionRuleProvider, this.adRecsInjectionRuleProvider, this.superLikeableGamePlayRuleProvider, this.swipeCadenceControlRuleProvider, this.adSwipeTerminationRuleProvider, this.nativeDfpAdPostSwipeProcessingRuleProvider, this.brandedProfileCardMatchInsertionRuleProvider, this.swipeCountTerminationRuleProvider, this.recsSessionTrackerRuleProvider, this.fireboardingSuperlikeRuleProvider);
    }

    public static CardStackSwipeProcessingRulesResolver provideInstance(Provider<TutorialSwipeRule> provider, Provider<LocalOutOfLikesBouncerRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<SwipeDispatchRule> provider4, Provider<DupesPreventionRule> provider5, Provider<C18030a> provider6, Provider<SuperLikeableGamePlayRule> provider7, Provider<SwipeCadenceControlRule> provider8, Provider<AdSwipeTerminationRule> provider9, Provider<NativeDfpAdPostSwipeProcessingRule> provider10, Provider<BrandedProfileCardMatchInsertionRule> provider11, Provider<SwipeCountSwipeTerminationRule> provider12, Provider<RecsSessionTrackerRule> provider13, Provider<FireboardingSuperlikeRule> provider14) {
        return new CardStackSwipeProcessingRulesResolver(C17281c.m63230b(provider), C17281c.m63230b(provider2), C17281c.m63230b(provider3), C17281c.m63230b(provider4), C17281c.m63230b(provider5), C17281c.m63230b(provider6), C17281c.m63230b(provider7), C17281c.m63230b(provider8), C17281c.m63230b(provider9), C17281c.m63230b(provider10), C17281c.m63230b(provider11), C17281c.m63230b(provider12), C17281c.m63230b(provider13), C17281c.m63230b(provider14));
    }

    public static CardStackSwipeProcessingRulesResolver_Factory create(Provider<TutorialSwipeRule> provider, Provider<LocalOutOfLikesBouncerRule> provider2, Provider<UserRecSwipeAnalyticsRule> provider3, Provider<SwipeDispatchRule> provider4, Provider<DupesPreventionRule> provider5, Provider<C18030a> provider6, Provider<SuperLikeableGamePlayRule> provider7, Provider<SwipeCadenceControlRule> provider8, Provider<AdSwipeTerminationRule> provider9, Provider<NativeDfpAdPostSwipeProcessingRule> provider10, Provider<BrandedProfileCardMatchInsertionRule> provider11, Provider<SwipeCountSwipeTerminationRule> provider12, Provider<RecsSessionTrackerRule> provider13, Provider<FireboardingSuperlikeRule> provider14) {
        return new CardStackSwipeProcessingRulesResolver_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static CardStackSwipeProcessingRulesResolver newCardStackSwipeProcessingRulesResolver(Lazy<TutorialSwipeRule> lazy, Lazy<LocalOutOfLikesBouncerRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3, Lazy<SwipeDispatchRule> lazy4, Lazy<DupesPreventionRule> lazy5, Lazy<C18030a> lazy6, Lazy<SuperLikeableGamePlayRule> lazy7, Lazy<SwipeCadenceControlRule> lazy8, Lazy<AdSwipeTerminationRule> lazy9, Lazy<NativeDfpAdPostSwipeProcessingRule> lazy10, Lazy<BrandedProfileCardMatchInsertionRule> lazy11, Lazy<SwipeCountSwipeTerminationRule> lazy12, Lazy<RecsSessionTrackerRule> lazy13, Lazy<FireboardingSuperlikeRule> lazy14) {
        return new CardStackSwipeProcessingRulesResolver(lazy, lazy2, lazy3, lazy4, lazy5, lazy6, lazy7, lazy8, lazy9, lazy10, lazy11, lazy12, lazy13, lazy14);
    }
}
