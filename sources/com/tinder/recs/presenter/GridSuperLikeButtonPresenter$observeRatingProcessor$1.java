package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "test"}, k = 3, mv = {1, 1, 10})
final class GridSuperLikeButtonPresenter$observeRatingProcessor$1<T> implements Predicate<SwipeRatingStatus> {
    public static final GridSuperLikeButtonPresenter$observeRatingProcessor$1 INSTANCE = new GridSuperLikeButtonPresenter$observeRatingProcessor$1();

    GridSuperLikeButtonPresenter$observeRatingProcessor$1() {
    }

    public final boolean test(@NotNull SwipeRatingStatus swipeRatingStatus) {
        C2668g.b(swipeRatingStatus, "it");
        return swipeRatingStatus.getSwipe().getType() == Type.SUPERLIKE ? true : null;
    }
}
