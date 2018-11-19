package com.tinder.recs.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.enums.SwipeType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "DATA", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tinder/recs/view/RecProfileView$setGamepadClickListeners$1$1"}, k = 3, mv = {1, 1, 10})
final class RecProfileView$setGamepadClickListeners$$inlined$apply$lambda$1 implements OnClickListener {
    final /* synthetic */ RecProfileView this$0;

    RecProfileView$setGamepadClickListeners$$inlined$apply$lambda$1(RecProfileView recProfileView) {
        this.this$0 = recProfileView;
    }

    public final void onClick(View view) {
        this.this$0.dispatchGamepadButtonClick(SwipeType.LIKE_BUTTON);
    }
}
