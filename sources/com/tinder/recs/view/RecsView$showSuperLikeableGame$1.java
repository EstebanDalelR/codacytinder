package com.tinder.recs.view;

import com.tinder.superlikeable.view.SuperLikeableViewContainer.OnExitAnimationEndListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/view/RecsView$showSuperLikeableGame$1", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnExitAnimationEndListener;", "(Lcom/tinder/recs/view/RecsView;)V", "onAnimationEnd", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$showSuperLikeableGame$1 implements OnExitAnimationEndListener {
    final /* synthetic */ RecsView this$0;

    RecsView$showSuperLikeableGame$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onAnimationEnd() {
        RecsView.access$removeSuperLikeableView(this.this$0);
    }
}
