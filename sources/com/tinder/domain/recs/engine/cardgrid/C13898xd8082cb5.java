package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.data.recs.C8786k;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.Subscription;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecsAfterSuccessfulLoad$3 */
final class C13898xd8082cb5<T> implements Action1<C8786k> {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    C13898xd8082cb5(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    public final void call(C8786k c8786k) {
        synchronized (this.this$0) {
            Subscription access$getRefreshRecsSubscription$p = this.this$0.refreshRecsSubscription;
            if (access$getRefreshRecsSubscription$p != null) {
                access$getRefreshRecsSubscription$p.unsubscribe();
            }
            LoadingStatusAdapter access$getLoadingStatusAdapter$p = this.this$0.this$0.loadingStatusAdapter;
            C2668g.a(c8786k, "it");
            this.this$0.this$0.loadingStatusProvider.update(access$getLoadingStatusAdapter$p.fromRecsFetchResults(c8786k));
            c8786k = C15813i.f49016a;
        }
    }
}
