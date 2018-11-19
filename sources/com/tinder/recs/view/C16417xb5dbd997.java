package com.tinder.recs.view;

import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "DATA", "onAnimationEnd", "com/tinder/recs/view/RecProfileView$enterWithGamepadEntranceAnimationDisabled$1$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.RecProfileView$enterWithGamepadEntranceAnimationDisabled$$inlined$let$lambda$1 */
final class C16417xb5dbd997 implements EndListener {
    final /* synthetic */ RecProfileView this$0;

    C16417xb5dbd997(RecProfileView recProfileView) {
        this.this$0 = recProfileView;
    }

    public final void onAnimationEnd() {
        this.this$0.setGamepadClickListeners();
    }
}
