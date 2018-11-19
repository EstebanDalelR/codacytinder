package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.model.SwipeTerminationEvent;
import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "swipeTerminationEvent", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class SwipeProcessor$observeSwipeTerminationEvents$1<T> implements Action1<SwipeTerminationEvent> {
    final /* synthetic */ SwipeProcessor this$0;

    SwipeProcessor$observeSwipeTerminationEvents$1(SwipeProcessor swipeProcessor) {
        this.this$0 = swipeProcessor;
    }

    public final void call(SwipeTerminationEvent swipeTerminationEvent) {
        C0001a.b("%s - Notifying SwipeTerminationEvent: %s", new Object[]{this.this$0.recSource, swipeTerminationEvent});
    }
}
