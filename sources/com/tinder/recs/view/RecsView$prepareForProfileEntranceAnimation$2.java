package com.tinder.recs.view;

import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationEnd"}, k = 3, mv = {1, 1, 10})
final class RecsView$prepareForProfileEntranceAnimation$2 implements EndListener {
    final /* synthetic */ RecsView this$0;

    RecsView$prepareForProfileEntranceAnimation$2(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final void onAnimationEnd() {
        RecsView.access$onProfileEntranceAnimationEnd(this.this$0);
    }
}
