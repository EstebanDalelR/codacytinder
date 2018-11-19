package com.tinder.recs.view;

import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tinder.base.p173c.C8304b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/view/RecsView$doWhenReadyForNudge$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/recs/view/RecsView;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "onGlobalLayout", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$doWhenReadyForNudge$1 implements OnGlobalLayoutListener {
    final /* synthetic */ Function0 $action;
    final /* synthetic */ ViewGroup $view;
    final /* synthetic */ RecsView this$0;

    RecsView$doWhenReadyForNudge$1(RecsView recsView, ViewGroup viewGroup, Function0 function0) {
        this.this$0 = recsView;
        this.$view = viewGroup;
        this.$action = function0;
    }

    public void onGlobalLayout() {
        if (C8304b.b(this.this$0) && this.$view.getChildCount() > 0) {
            this.$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.$action.invoke();
        }
    }
}
