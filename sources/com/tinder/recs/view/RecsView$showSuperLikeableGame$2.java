package com.tinder.recs.view;

import android.view.View;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.superlikeable.view.SuperLikeableViewContainer.OnRecClickedListener;
import com.tinder.superlikeable.view.cardview.GridCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/recs/view/RecsView$showSuperLikeableGame$2", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnRecClickedListener;", "(Lcom/tinder/recs/view/RecsView;)V", "onRecClicked", "", "view", "Landroid/view/View;", "index", "", "rec", "Lcom/tinder/domain/recs/model/UserRec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$showSuperLikeableGame$2 implements OnRecClickedListener {
    final /* synthetic */ RecsView this$0;

    RecsView$showSuperLikeableGame$2(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onRecClicked(@NotNull View view, int i, @NotNull UserRec userRec) {
        C2668g.b(view, "view");
        C2668g.b(userRec, "rec");
        RecsView.access$getSuperLikeableRecClickListenerProxy$p(this.this$0).onRecClicked((GridCardView) view, i, userRec, this.this$0);
    }
}
