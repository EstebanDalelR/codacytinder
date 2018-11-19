package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$rewindSwipe$4<R> implements Func0<Ended> {
    final /* synthetic */ Ended $swipeRatingStatus;

    RecsPresenter$rewindSwipe$4(Ended ended) {
        this.$swipeRatingStatus = ended;
    }

    @NotNull
    public final Ended call() {
        return this.$swipeRatingStatus;
    }
}
