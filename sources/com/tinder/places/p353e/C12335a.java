package com.tinder.places.p353e;

import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver.SwipeProcessingRulesChain;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/rule/PlacesSwipeProcessingRulesResolver;", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "swipeDispatchRule", "Ldagger/Lazy;", "Lcom/tinder/recs/rule/SwipeDispatchRule;", "dupesPreventionRule", "Lcom/tinder/recs/rule/DupesPreventionRule;", "userRecSwipeAnalyticsRule", "Lcom/tinder/recs/rule/UserRecSwipeAnalyticsRule;", "localOutOfLikesBouncerRule", "Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "resolveSwipeRules", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver$SwipeProcessingRulesChain;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.e.a */
public final class C12335a implements SwipeProcessingRulesResolver {
    /* renamed from: a */
    private final Lazy<SwipeDispatchRule> f39933a;
    /* renamed from: b */
    private final Lazy<DupesPreventionRule> f39934b;
    /* renamed from: c */
    private final Lazy<UserRecSwipeAnalyticsRule> f39935c;
    /* renamed from: d */
    private final Lazy<LocalOutOfLikesBouncerRule> f39936d;

    public C12335a(@NotNull Lazy<SwipeDispatchRule> lazy, @NotNull Lazy<DupesPreventionRule> lazy2, @NotNull Lazy<UserRecSwipeAnalyticsRule> lazy3, @NotNull Lazy<LocalOutOfLikesBouncerRule> lazy4) {
        C2668g.b(lazy, "swipeDispatchRule");
        C2668g.b(lazy2, "dupesPreventionRule");
        C2668g.b(lazy3, "userRecSwipeAnalyticsRule");
        C2668g.b(lazy4, "localOutOfLikesBouncerRule");
        this.f39933a = lazy;
        this.f39934b = lazy2;
        this.f39935c = lazy3;
        this.f39936d = lazy4;
    }

    @NotNull
    public SwipeProcessingRulesChain resolveSwipeRules(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        SwipeProcessingRulesChain swipeProcessingRulesChain = new SwipeProcessingRulesChain(swipe);
        swipe = swipe.getRec();
        if (swipe.getType() == RecType.USER) {
            swipe = this.f39935c.get();
            C2668g.a(swipe, "userRecSwipeAnalyticsRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            swipe = this.f39933a.get();
            C2668g.a(swipe, "swipeDispatchRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            swipe = this.f39934b.get();
            C2668g.a(swipe, "dupesPreventionRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            swipe = this.f39936d.get();
            C2668g.a(swipe, "localOutOfLikesBouncerRule.get()");
            swipeProcessingRulesChain.addPreSwipeConsumptionRule((PreSwipeConsumptionRule) swipe);
            return swipeProcessingRulesChain;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rec contains an unknown type for rule resolution: ");
        stringBuilder.append(swipe.getType());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
