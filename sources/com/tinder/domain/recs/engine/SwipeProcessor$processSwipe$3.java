package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.model.Swipe;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "swipedRec", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class SwipeProcessor$processSwipe$3<T> implements Action1<Swipe> {
    final /* synthetic */ Swipe $swipe;
    final /* synthetic */ SwipeProcessor this$0;

    SwipeProcessor$processSwipe$3(SwipeProcessor swipeProcessor, Swipe swipe) {
        this.this$0 = swipeProcessor;
        this.$swipe = swipe;
    }

    public final void call(Swipe swipe) {
        this.this$0.notifySuccessfulTermination(this.$swipe);
        SwipeProcessor swipeProcessor = this.this$0;
        C2668g.a(swipe, "swipedRec");
        swipeProcessor.processSuccessfulTerminationRules(swipe);
    }
}
