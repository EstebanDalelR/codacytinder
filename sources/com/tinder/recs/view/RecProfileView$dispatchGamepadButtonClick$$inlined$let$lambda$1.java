package com.tinder.recs.view;

import com.tinder.enums.SwipeType;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import com.tinder.recs.view.RecProfileView.Listener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "DATA", "onAnimationEnd", "com/tinder/recs/view/RecProfileView$dispatchGamepadButtonClick$1$1"}, k = 3, mv = {1, 1, 10})
final class RecProfileView$dispatchGamepadButtonClick$$inlined$let$lambda$1 implements EndListener {
    final /* synthetic */ SwipeType $swipeType$inlined;
    final /* synthetic */ RecProfileView this$0;

    RecProfileView$dispatchGamepadButtonClick$$inlined$let$lambda$1(RecProfileView recProfileView, SwipeType swipeType) {
        this.this$0 = recProfileView;
        this.$swipeType$inlined = swipeType;
    }

    public final void onAnimationEnd() {
        Listener access$getListener$p = this.this$0.listener;
        if (access$getListener$p != null) {
            access$getListener$p.onGamepadButtonClick(this.$swipeType$inlined, this.this$0.getBoundData());
        }
    }
}
