package com.tinder.recs.view;

import com.tinder.recs.animation.RecProfileAnimationDecorator.StartListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationStart"}, k = 3, mv = {1, 1, 10})
final class RecsView$prepareForProfileEntranceAnimation$1 implements StartListener {
    final /* synthetic */ RecsView this$0;

    RecsView$prepareForProfileEntranceAnimation$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final void onAnimationStart() {
        RecsView.access$onProfileEntranceAnimationStart(this.this$0);
    }
}
