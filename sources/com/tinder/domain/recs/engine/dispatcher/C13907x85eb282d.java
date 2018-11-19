package com.tinder.domain.recs.engine.dispatcher;

import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$resume$fetchRatingResultSubscription$2 */
final class C13907x85eb282d<T> implements Action1<Ended> {
    final /* synthetic */ NonBlockingSwipeDispatcher this$0;

    C13907x85eb282d(NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher) {
        this.this$0 = nonBlockingSwipeDispatcher;
    }

    public final void call(Ended ended) {
        NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher = this.this$0;
        C2668g.a(ended, "it");
        nonBlockingSwipeDispatcher.handleEndedSwipeRatingStatus(ended);
    }
}
