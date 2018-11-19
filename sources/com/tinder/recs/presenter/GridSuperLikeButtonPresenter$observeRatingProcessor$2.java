package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.recs.provider.SuperLikeRatingStatus;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/recs/provider/SuperLikeRatingStatus;", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "apply"}, k = 3, mv = {1, 1, 10})
final class GridSuperLikeButtonPresenter$observeRatingProcessor$2<T, R> implements Function<T, R> {
    final /* synthetic */ GridSuperLikeButtonPresenter this$0;

    GridSuperLikeButtonPresenter$observeRatingProcessor$2(GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        this.this$0 = gridSuperLikeButtonPresenter;
    }

    @NotNull
    public final SuperLikeRatingStatus apply(@NotNull SwipeRatingStatus swipeRatingStatus) {
        C2668g.b(swipeRatingStatus, "it");
        return this.this$0.convertToSuperLikeRatingStatus(swipeRatingStatus);
    }
}
