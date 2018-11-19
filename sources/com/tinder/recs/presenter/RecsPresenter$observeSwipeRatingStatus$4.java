package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$observeSwipeRatingStatus$4<T, R> implements Func1<T, Observable<? extends R>> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$observeSwipeRatingStatus$4(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    @NotNull
    public final Observable<Ended> call(Ended ended) {
        RecsPresenter recsPresenter = this.this$0;
        C2668g.a(ended, "it");
        return recsPresenter.rewindSwipe(ended);
    }
}
