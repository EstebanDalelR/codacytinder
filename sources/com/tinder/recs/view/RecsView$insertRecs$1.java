package com.tinder.recs.view;

import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationEnd"}, k = 3, mv = {1, 1, 10})
final class RecsView$insertRecs$1 implements EndListener {
    final /* synthetic */ List $cards;
    final /* synthetic */ int $position;
    final /* synthetic */ RecsView this$0;

    RecsView$insertRecs$1(RecsView recsView, int i, List list) {
        this.this$0 = recsView;
        this.$position = i;
        this.$cards = list;
    }

    public final void onAnimationEnd() {
        this.this$0.getCardStack$Tinder_release().a(this.$position, this.$cards);
    }
}
