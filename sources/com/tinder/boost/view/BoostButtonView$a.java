package com.tinder.boost.view;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/boost/view/BoostButtonView$attachBoostEmitterView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/boost/view/BoostButtonView;J)V", "onGlobalLayout", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BoostButtonView$a implements OnGlobalLayoutListener {
    /* renamed from: a */
    final /* synthetic */ BoostButtonView f29664a;
    /* renamed from: b */
    final /* synthetic */ long f29665b;

    BoostButtonView$a(BoostButtonView boostButtonView, long j) {
        this.f29664a = boostButtonView;
        this.f29665b = j;
    }

    public void onGlobalLayout() {
        this.f29664a.getBoostButton$Tinder_release().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f29664a.attachBoostEmitterView(this.f29665b);
    }
}
