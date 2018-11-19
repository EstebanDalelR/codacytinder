package com.tinder.recs.view;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "onConfirm", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
final class RecsView$showTutorialSwipeDialog$swipeDialog$1 implements OnClickListener {
    final /* synthetic */ Function0 $dialogConfirmAction;
    final /* synthetic */ RecsView this$0;

    RecsView$showTutorialSwipeDialog$swipeDialog$1(RecsView recsView, Function0 function0) {
        this.this$0 = recsView;
        this.$dialogConfirmAction = function0;
    }

    public final void onClick(View view) {
        this.$dialogConfirmAction.invoke();
        this.this$0.getCardStack$Tinder_release().h();
    }
}
