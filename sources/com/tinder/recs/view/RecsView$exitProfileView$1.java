package com.tinder.recs.view;

import com.tinder.recs.animation.RecProfileAnimationDecorator;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationEnd"}, k = 3, mv = {1, 1, 10})
final class RecsView$exitProfileView$1 implements EndListener {
    final /* synthetic */ RecProfileAnimationDecorator $exitAnimation;
    final /* synthetic */ EndListener $listener;
    final /* synthetic */ RecProfileView $recProfileView;

    RecsView$exitProfileView$1(RecProfileAnimationDecorator recProfileAnimationDecorator, EndListener endListener, RecProfileView recProfileView) {
        this.$exitAnimation = recProfileAnimationDecorator;
        this.$listener = endListener;
        this.$recProfileView = recProfileView;
    }

    public final void onAnimationEnd() {
        this.$exitAnimation.addEndListener(this.$listener);
        this.$recProfileView.exit();
    }
}
