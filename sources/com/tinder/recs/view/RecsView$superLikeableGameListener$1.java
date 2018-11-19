package com.tinder.recs.view;

import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.superlikeable.view.SuperLikeableViewContainer.C16902a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/tinder/recs/view/RecsView$superLikeableGameListener$1", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$SimpleGameListener;", "(Lcom/tinder/recs/view/RecsView;)V", "onBackClick", "", "onGameAbnormallyAborted", "onSkipClick", "onSuperLikeSwipe", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "recIndex", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$superLikeableGameListener$1 extends C16902a {
    final /* synthetic */ RecsView this$0;

    RecsView$superLikeableGameListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onSkipClick() {
        RecsView.access$removeSuperLikeableView(this.this$0);
    }

    public void onBackClick() {
        RecsView.access$removeSuperLikeableView(this.this$0);
    }

    public void onGameAbnormallyAborted() {
        RecsView.access$removeSuperLikeableView(this.this$0);
    }

    public void onSuperLikeSwipe(@NotNull UserRec userRec, @NotNull Method method, int i) {
        C2668g.b(userRec, "userRec");
        C2668g.b(method, "swipeMethod");
        this.this$0.getPresenter$Tinder_release().handleSuperlikeableGameSwipe(userRec);
    }
}
