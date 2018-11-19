package com.tinder.recs.provider;

import com.tinder.recs.model.RecsDecoratedLoadingStatusInfo;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "recsDecoratedLoadingStatusInfo", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.provider.RecsDecoratedLoadingStatusProvider$subscribedToLoadingStatusDiscoverySettings$2 */
final class C16406xc019e2a1<T> implements Consumer<RecsDecoratedLoadingStatusInfo> {
    final /* synthetic */ RecsDecoratedLoadingStatusProvider this$0;

    C16406xc019e2a1(RecsDecoratedLoadingStatusProvider recsDecoratedLoadingStatusProvider) {
        this.this$0 = recsDecoratedLoadingStatusProvider;
    }

    public final void accept(RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo) {
        this.this$0.subject.onNext(recsDecoratedLoadingStatusInfo);
    }
}
