package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.model.Swipe;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/Swipe;", "call"}, k = 3, mv = {1, 1, 9})
final class SwipeProcessor$processPreConsumptionRules$1<V> implements Callable<T> {
    final /* synthetic */ Swipe $swipe;
    final /* synthetic */ SwipeProcessor this$0;

    SwipeProcessor$processPreConsumptionRules$1(SwipeProcessor swipeProcessor, Swipe swipe) {
        this.this$0 = swipeProcessor;
        this.$swipe = swipe;
    }

    @NotNull
    public final Swipe call() {
        this.this$0.swipeRulesProcessor.processSwipeRules(this.$swipe, this.this$0.rulesResolver.resolveSwipeRules(this.$swipe).getPreConsumptionRules());
        return this.$swipe;
    }
}
