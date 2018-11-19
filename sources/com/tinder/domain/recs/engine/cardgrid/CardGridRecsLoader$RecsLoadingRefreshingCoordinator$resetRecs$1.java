package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import kotlin.Metadata;
import rx.Subscription;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$1<T> implements Action1<Subscription> {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$1(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    public final void call(Subscription subscription) {
        this.this$0.this$0.loadingStatusProvider.update(Uninitialized.INSTANCE);
    }
}
