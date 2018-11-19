package com.tinder.domain.recs.engine.cardgrid;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecsAfterSuccessfulLoad$4 */
final class C13899xd8082cb6<T> implements Action1<Throwable> {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    C13899xd8082cb6(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    public final void call(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to refresh ");
        stringBuilder.append(this.this$0.this$0.getRecSource());
        stringBuilder.append(" recs");
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
        synchronized (this.this$0) {
            LoadingStatusAdapter access$getLoadingStatusAdapter$p = this.this$0.this$0.loadingStatusAdapter;
            C2668g.a(th, "it");
            this.this$0.this$0.loadingStatusProvider.update(access$getLoadingStatusAdapter$p.fromThrowable(th));
            th = C15813i.f49016a;
        }
    }
}
