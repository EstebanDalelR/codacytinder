package com.tinder.toppicks.p483d;

import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver.SwipeProcessingRulesChain;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/toppicks/rule/TopPicksSwipeProcessingRulesResolver;", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "swipeDispatchRule", "Ldagger/Lazy;", "Lcom/tinder/recs/rule/SwipeDispatchRule;", "dupesPreventionRule", "Lcom/tinder/recs/rule/DupesPreventionRule;", "userRecSwipeAnalyticsRule", "Lcom/tinder/recs/rule/UserRecSwipeAnalyticsRule;", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "resolveSwipeRules", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver$SwipeProcessingRulesChain;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.d.a */
public final class C16994a implements SwipeProcessingRulesResolver {
    /* renamed from: a */
    private final Lazy<SwipeDispatchRule> f52399a;
    /* renamed from: b */
    private final Lazy<DupesPreventionRule> f52400b;
    /* renamed from: c */
    private final Lazy<UserRecSwipeAnalyticsRule> f52401c;

    public C16994a(@NotNull Lazy<SwipeDispatchRule> lazy, @NotNull Lazy<DupesPreventionRule> lazy2, @NotNull Lazy<UserRecSwipeAnalyticsRule> lazy3) {
        C2668g.b(lazy, "swipeDispatchRule");
        C2668g.b(lazy2, "dupesPreventionRule");
        C2668g.b(lazy3, "userRecSwipeAnalyticsRule");
        this.f52399a = lazy;
        this.f52400b = lazy2;
        this.f52401c = lazy3;
    }

    @NotNull
    public SwipeProcessingRulesChain resolveSwipeRules(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        SwipeProcessingRulesChain swipeProcessingRulesChain = new SwipeProcessingRulesChain(swipe);
        swipe = swipe.getRec();
        if (swipe.getType() == RecType.TOP_PICK) {
            swipe = this.f52401c.get();
            C2668g.a(swipe, "userRecSwipeAnalyticsRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            swipe = this.f52399a.get();
            C2668g.a(swipe, "swipeDispatchRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            swipe = this.f52400b.get();
            C2668g.a(swipe, "dupesPreventionRule.get()");
            swipeProcessingRulesChain.addPostSwipeConsumptionRule((PostSwipeConsumptionRule) swipe);
            return swipeProcessingRulesChain;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rec contains an unknown type for rule resolution: ");
        stringBuilder.append(swipe.getType());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
