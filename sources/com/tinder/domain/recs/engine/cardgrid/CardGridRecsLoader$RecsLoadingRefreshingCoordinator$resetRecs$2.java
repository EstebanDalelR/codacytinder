package com.tinder.domain.recs.engine.cardgrid;

import kotlin.C15813i;
import kotlin.Metadata;
import rx.Subscription;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
final class CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$2 implements Action0 {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$2(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    public final void call() {
        synchronized (this.this$0) {
            Subscription access$getClearRecsSubscription$p = this.this$0.clearRecsSubscription;
            if (access$getClearRecsSubscription$p != null) {
                access$getClearRecsSubscription$p.unsubscribe();
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }
}
