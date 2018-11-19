package com.tinder.recs.view;

import com.tinder.boost.view.BoostButtonView$OnEmitterAttached;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/view/RecsView$heartsEmitterListener$1", "Lcom/tinder/boost/view/BoostButtonView$OnEmitterAttached;", "(Lcom/tinder/recs/view/RecsView;)V", "onAttached", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$heartsEmitterListener$1 implements BoostButtonView$OnEmitterAttached {
    final /* synthetic */ RecsView this$0;

    RecsView$heartsEmitterListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onAttached() {
        this.this$0.getGamepad$Tinder_release().boostButtonView.b();
    }
}
