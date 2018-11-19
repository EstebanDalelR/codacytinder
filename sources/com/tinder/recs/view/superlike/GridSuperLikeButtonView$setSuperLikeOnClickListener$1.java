package com.tinder.recs.view.superlike;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
final class GridSuperLikeButtonView$setSuperLikeOnClickListener$1 implements OnClickListener {
    final /* synthetic */ Function0 $action;
    final /* synthetic */ GridSuperLikeButtonView this$0;

    GridSuperLikeButtonView$setSuperLikeOnClickListener$1(GridSuperLikeButtonView gridSuperLikeButtonView, Function0 function0) {
        this.this$0 = gridSuperLikeButtonView;
        this.$action = function0;
    }

    public final void onClick(View view) {
        this.this$0.handleSuperLikeClick(this.$action);
    }
}
