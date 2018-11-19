package com.tinder.recs.rule;

import android.support.annotation.NonNull;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import rx.Observable;
import rx.schedulers.Schedulers;

public class SwipeCadenceControlRule implements PreSwipeConsumptionRule {
    @Inject
    SwipeCadenceControlRule() {
    }

    @NonNull
    public ResultType perform(@NonNull Swipe swipe) {
        if (swipe.getActionContext().getMethod() == SwipeMethod.CARD) {
            Observable.b(120, TimeUnit.MILLISECONDS, Schedulers.immediate()).u().b();
        }
        return ResultType.PROCEED;
    }
}
