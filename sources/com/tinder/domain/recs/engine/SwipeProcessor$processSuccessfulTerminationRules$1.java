package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.model.Swipe;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
final class SwipeProcessor$processSuccessfulTerminationRules$1 implements Action0 {
    final /* synthetic */ Swipe $swipe;
    final /* synthetic */ SwipeProcessor this$0;

    SwipeProcessor$processSuccessfulTerminationRules$1(SwipeProcessor swipeProcessor, Swipe swipe) {
        this.this$0 = swipeProcessor;
        this.$swipe = swipe;
    }

    public final void call() {
        this.this$0.swipeRulesProcessor.processSwipeRules(this.$swipe, this.this$0.rulesResolver.resolveSwipeRules(this.$swipe).getSuccessfulTerminationRules());
    }
}
