package com.tinder.recs.presenter;

import com.tinder.recs.model.RecsDecoratedLoadingStatusInfo;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "recsDecoratedLoadingStatusInfo", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.RecsStatusPresenter$subscribeToRecsDecoratedLoadingStatusProvider$1 */
final class C16403x7d00acec<T> implements Consumer<RecsDecoratedLoadingStatusInfo> {
    final /* synthetic */ RecsStatusPresenter this$0;

    C16403x7d00acec(RecsStatusPresenter recsStatusPresenter) {
        this.this$0 = recsStatusPresenter;
    }

    public final void accept(RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo) {
        RecsStatusPresenter recsStatusPresenter = this.this$0;
        C2668g.a(recsDecoratedLoadingStatusInfo, "recsDecoratedLoadingStatusInfo");
        recsStatusPresenter.recsDecoratedLoadingStatusInfo = recsDecoratedLoadingStatusInfo;
    }
}
