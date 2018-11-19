package com.tinder.recs.view;

import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/recs/view/RecsView$CardAttachChangeListener;", "Landroid/support/v7/widget/RecyclerView$OnChildAttachStateChangeListener;", "(Lcom/tinder/recs/view/RecsView;)V", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class RecsView$CardAttachChangeListener implements OnChildAttachStateChangeListener {
    final /* synthetic */ RecsView this$0;

    public void onChildViewAttachedToWindow(@NotNull View view) {
        C2668g.b(view, "view");
    }

    public RecsView$CardAttachChangeListener(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onChildViewDetachedFromWindow(@NotNull View view) {
        C2668g.b(view, "view");
        if (view == RecsView.access$getTopRecCardView$p(this.this$0)) {
            RecsView.access$setTopRecCardView$p(this.this$0, (RecCardView) null);
        }
    }
}
