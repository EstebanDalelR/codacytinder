package com.tinder.recs.rule;

import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver.SwipeProcessingRulesChain;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SuccessfulSwipeTerminationRule;
import com.tinder.recs.domain.rule.SwipeCountSwipeTerminationRule;
import com.tinder.recsads.rule.BrandedProfileCardMatchInsertionRule;
import com.tinder.recsads.rule.C18030a;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BÍ\u0001\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/recs/rule/CardStackSwipeProcessingRulesResolver;", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "swipeTutorialRule", "Ldagger/Lazy;", "Lcom/tinder/recs/rule/TutorialSwipeRule;", "localOutOfLikesBouncerRule", "Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;", "userRecSwipeAnalyticsRule", "Lcom/tinder/recs/rule/UserRecSwipeAnalyticsRule;", "swipeDispatchRule", "Lcom/tinder/recs/rule/SwipeDispatchRule;", "dupesPreventionRule", "Lcom/tinder/recs/rule/DupesPreventionRule;", "adRecsInjectionRule", "Lcom/tinder/recsads/rule/AdRecsInjectionRule;", "superLikeableGamePlayRule", "Lcom/tinder/recs/rule/SuperLikeableGamePlayRule;", "swipeCadenceControlRule", "Lcom/tinder/recs/rule/SwipeCadenceControlRule;", "adSwipeTerminationRule", "Lcom/tinder/recs/rule/AdSwipeTerminationRule;", "nativeDfpAdPostSwipeProcessingRule", "Lcom/tinder/recs/rule/NativeDfpAdPostSwipeProcessingRule;", "brandedProfileCardMatchInsertionRule", "Lcom/tinder/recsads/rule/BrandedProfileCardMatchInsertionRule;", "swipeCountTerminationRule", "Lcom/tinder/recs/domain/rule/SwipeCountSwipeTerminationRule;", "recsSessionTrackerRule", "Lcom/tinder/recs/rule/RecsSessionTrackerRule;", "fireboardingSuperlikeRule", "Lcom/tinder/recs/rule/FireboardingSuperlikeRule;", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "resolveSwipeRules", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver$SwipeProcessingRulesChain;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CardStackSwipeProcessingRulesResolver implements SwipeProcessingRulesResolver {
    private final Lazy<C18030a> adRecsInjectionRule;
    private final Lazy<AdSwipeTerminationRule> adSwipeTerminationRule;
    private final Lazy<BrandedProfileCardMatchInsertionRule> brandedProfileCardMatchInsertionRule;
    private final Lazy<DupesPreventionRule> dupesPreventionRule;
    private final Lazy<FireboardingSuperlikeRule> fireboardingSuperlikeRule;
    private final Lazy<LocalOutOfLikesBouncerRule> localOutOfLikesBouncerRule;
    private final Lazy<NativeDfpAdPostSwipeProcessingRule> nativeDfpAdPostSwipeProcessingRule;
    private final Lazy<RecsSessionTrackerRule> recsSessionTrackerRule;
    private final Lazy<SuperLikeableGamePlayRule> superLikeableGamePlayRule;
    private final Lazy<SwipeCadenceControlRule> swipeCadenceControlRule;
    private final Lazy<SwipeCountSwipeTerminationRule> swipeCountTerminationRule;
    private final Lazy<SwipeDispatchRule> swipeDispatchRule;
    private final Lazy<TutorialSwipeRule> swipeTutorialRule;
    private final Lazy<UserRecSwipeAnalyticsRule> userRecSwipeAnalyticsRule;

    @Inject
    public CardStackSwipeProcessingRulesResolver(@NotNull Lazy<TutorialSwipeRule> lazy, @NotNull Lazy<LocalOutOfLikesBouncerRule> lazy2, @NotNull Lazy<UserRecSwipeAnalyticsRule> lazy3, @NotNull Lazy<SwipeDispatchRule> lazy4, @NotNull Lazy<DupesPreventionRule> lazy5, @NotNull Lazy<C18030a> lazy6, @NotNull Lazy<SuperLikeableGamePlayRule> lazy7, @NotNull Lazy<SwipeCadenceControlRule> lazy8, @NotNull Lazy<AdSwipeTerminationRule> lazy9, @NotNull Lazy<NativeDfpAdPostSwipeProcessingRule> lazy10, @NotNull Lazy<BrandedProfileCardMatchInsertionRule> lazy11, @NotNull Lazy<SwipeCountSwipeTerminationRule> lazy12, @NotNull @Named("core") Lazy<RecsSessionTrackerRule> lazy13, @NotNull Lazy<FireboardingSuperlikeRule> lazy14) {
        C2668g.b(lazy, "swipeTutorialRule");
        C2668g.b(lazy2, "localOutOfLikesBouncerRule");
        C2668g.b(lazy3, "userRecSwipeAnalyticsRule");
        C2668g.b(lazy4, "swipeDispatchRule");
        C2668g.b(lazy5, "dupesPreventionRule");
        C2668g.b(lazy6, "adRecsInjectionRule");
        C2668g.b(lazy7, "superLikeableGamePlayRule");
        C2668g.b(lazy8, "swipeCadenceControlRule");
        C2668g.b(lazy9, "adSwipeTerminationRule");
        C2668g.b(lazy10, "nativeDfpAdPostSwipeProcessingRule");
        C2668g.b(lazy11, "brandedProfileCardMatchInsertionRule");
        C2668g.b(lazy12, "swipeCountTerminationRule");
        C2668g.b(lazy13, "recsSessionTrackerRule");
        C2668g.b(lazy14, "fireboardingSuperlikeRule");
        this.swipeTutorialRule = lazy;
        this.localOutOfLikesBouncerRule = lazy2;
        this.userRecSwipeAnalyticsRule = lazy3;
        this.swipeDispatchRule = lazy4;
        this.dupesPreventionRule = lazy5;
        this.adRecsInjectionRule = lazy6;
        this.superLikeableGamePlayRule = lazy7;
        this.swipeCadenceControlRule = lazy8;
        this.adSwipeTerminationRule = lazy9;
        this.nativeDfpAdPostSwipeProcessingRule = lazy10;
        this.brandedProfileCardMatchInsertionRule = lazy11;
        this.swipeCountTerminationRule = lazy12;
        this.recsSessionTrackerRule = lazy13;
        this.fireboardingSuperlikeRule = lazy14;
    }

    @NotNull
    public SwipeProcessingRulesChain resolveSwipeRules(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        Rec rec = swipe.getRec();
        SwipeProcessingRulesChain swipeProcessingRulesChain = new SwipeProcessingRulesChain(swipe);
        swipe = rec.getType();
        if (swipe != RecType.USER) {
            if (swipe != RecType.BRAND) {
                if (swipe == RecType.AD) {
                    swipe = this.swipeTutorialRule.get();
                    C2668g.a(swipe, "swipeTutorialRule.get()");
                    swipe = swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
                    Object obj = this.swipeCadenceControlRule.get();
                    C2668g.a(obj, "swipeCadenceControlRule.get()");
                    swipe = swipe.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) obj);
                    obj = this.adRecsInjectionRule.get();
                    C2668g.a(obj, "adRecsInjectionRule.get()");
                    swipe = swipe.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) obj);
                    obj = this.nativeDfpAdPostSwipeProcessingRule.get();
                    C2668g.a(obj, "nativeDfpAdPostSwipeProcessingRule.get()");
                    swipe = swipe.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) obj);
                    obj = this.adSwipeTerminationRule.get();
                    C2668g.a(obj, "adSwipeTerminationRule.get()");
                    swipe = swipe.addSuccessfulTerminationRule((SuccessfulSwipeTerminationRule) obj);
                    obj = this.superLikeableGamePlayRule.get();
                    C2668g.a(obj, "superLikeableGamePlayRule.get()");
                    swipe = swipe.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) obj);
                    obj = this.brandedProfileCardMatchInsertionRule.get();
                    C2668g.a(obj, "brandedProfileCardMatchInsertionRule.get()");
                    swipe = swipe.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) obj);
                    obj = this.swipeCountTerminationRule.get();
                    C2668g.a(obj, "swipeCountTerminationRule.get()");
                    swipe.addSuccessfulTerminationRule((SuccessfulSwipeTerminationRule) obj);
                } else if (swipe == RecType.SUPER_LIKABLE_GAME) {
                    swipe = this.superLikeableGamePlayRule.get();
                    C2668g.a(swipe, "superLikeableGamePlayRule.get()");
                    swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
                } else if (swipe != RecType.FIREBOARDING) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Rec contains an unknown type for rule resolution: ");
                    stringBuilder.append(rec.getType());
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
                }
                return swipeProcessingRulesChain;
            }
        }
        swipe = this.swipeTutorialRule.get();
        C2668g.a(swipe, "swipeTutorialRule.get()");
        swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
        swipe = this.localOutOfLikesBouncerRule.get();
        C2668g.a(swipe, "localOutOfLikesBouncerRule.get()");
        swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
        swipe = this.swipeCadenceControlRule.get();
        C2668g.a(swipe, "swipeCadenceControlRule.get()");
        swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
        swipe = this.fireboardingSuperlikeRule.get();
        C2668g.a(swipe, "fireboardingSuperlikeRule.get()");
        swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
        swipe = this.userRecSwipeAnalyticsRule.get();
        C2668g.a(swipe, "userRecSwipeAnalyticsRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.swipeDispatchRule.get();
        C2668g.a(swipe, "swipeDispatchRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.dupesPreventionRule.get();
        C2668g.a(swipe, "dupesPreventionRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.adRecsInjectionRule.get();
        C2668g.a(swipe, "adRecsInjectionRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.superLikeableGamePlayRule.get();
        C2668g.a(swipe, "superLikeableGamePlayRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.recsSessionTrackerRule.get();
        C2668g.a(swipe, "recsSessionTrackerRule.get()");
        swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
        swipe = this.swipeCountTerminationRule.get();
        C2668g.a(swipe, "swipeCountTerminationRule.get()");
        swipeProcessingRulesChain.addSuccessfulTerminationRule((SuccessfulSwipeTerminationRule) swipe);
        return swipeProcessingRulesChain;
    }
}
