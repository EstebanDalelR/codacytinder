package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "swipeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$observeSwipeRatingStatus$1<T, R> implements Func1<SwipeRatingStatus, Boolean> {
    public static final RecsPresenter$observeSwipeRatingStatus$1 INSTANCE = new RecsPresenter$observeSwipeRatingStatus$1();

    RecsPresenter$observeSwipeRatingStatus$1() {
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((SwipeRatingStatus) obj));
    }

    public final boolean call(SwipeRatingStatus swipeRatingStatus) {
        return swipeRatingStatus instanceof Ended;
    }
}
