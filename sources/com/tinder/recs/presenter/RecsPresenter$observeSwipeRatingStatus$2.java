package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$observeSwipeRatingStatus$2<T, R> implements Func1<Ended, Boolean> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$observeSwipeRatingStatus$2(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((Ended) obj));
    }

    public final boolean call(Ended ended) {
        return this.this$0.isCoreRec(ended.getSwipe().getRec());
    }
}
