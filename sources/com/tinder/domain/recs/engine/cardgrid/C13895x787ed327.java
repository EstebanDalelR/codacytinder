package com.tinder.domain.recs.engine.cardgrid;

import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$loadMoreRecs$1 */
final class C13895x787ed327 implements Action0 {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    C13895x787ed327(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    public final void call() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.this$0.this$0.getRecSource());
        stringBuilder.append(" - subscribed to loadMoreRecs()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }
}
