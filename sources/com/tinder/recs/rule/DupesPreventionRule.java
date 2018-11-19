package com.tinder.recs.rule;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.tinder.data.recs.C8776g;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DupesPreventionRule implements PostSwipeConsumptionRule {
    private final C8776g recsAlreadySwipedProvider;

    @Inject
    public DupesPreventionRule(C8776g c8776g) {
        this.recsAlreadySwipedProvider = c8776g;
    }

    @WorkerThread
    @NonNull
    public ResultType perform(@NonNull Swipe swipe) {
        this.recsAlreadySwipedProvider.a(swipe.getRec().getId());
        return ResultType.PROCEED;
    }
}
