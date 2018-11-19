package com.tinder.views.grid.presenter;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.SwipeOrigin;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/tinder/views/grid/presenter/RecsGridPresenter;", "", "likeOnRec", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "origin", "Lcom/tinder/domain/recs/model/SwipeOrigin;", "passOnRec", "superlikeOnRec", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface RecsGridPresenter {
    void likeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin);

    void passOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin);

    void superlikeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin);
}
