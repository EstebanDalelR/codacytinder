package com.tinder.recs.rule;

import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.analytics.RecsSessionTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/recs/rule/RecsSessionTrackerRule;", "Lcom/tinder/domain/recs/rule/PostSwipeConsumptionRule;", "recsSessionTracker", "Lcom/tinder/recs/analytics/RecsSessionTracker;", "(Lcom/tinder/recs/analytics/RecsSessionTracker;)V", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsSessionTrackerRule implements PostSwipeConsumptionRule {
    private final RecsSessionTracker recsSessionTracker;

    public RecsSessionTrackerRule(@NotNull RecsSessionTracker recsSessionTracker) {
        C2668g.b(recsSessionTracker, "recsSessionTracker");
        this.recsSessionTracker = recsSessionTracker;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        this.recsSessionTracker.addRecSwiped(swipe.getRec(), swipe.getType());
        return ResultType.PROCEED;
    }
}
