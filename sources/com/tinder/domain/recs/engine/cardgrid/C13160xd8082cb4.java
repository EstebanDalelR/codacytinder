package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.data.recs.C8786k;
import com.tinder.domain.recs.RecsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecsAfterSuccessfulLoad$2 */
final class C13160xd8082cb4<T, R> implements Func1<T, Single<? extends R>> {
    final /* synthetic */ RecsLoadingRefreshingCoordinator this$0;

    C13160xd8082cb4(RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator) {
        this.this$0 = recsLoadingRefreshingCoordinator;
    }

    @NotNull
    public final Single<C8786k> call(C8786k c8786k) {
        RecsRepository access$getRecsRepository$p = this.this$0.this$0.recsRepository;
        C2668g.a(c8786k, "it");
        return access$getRecsRepository$p.cacheRecs(c8786k);
    }
}
