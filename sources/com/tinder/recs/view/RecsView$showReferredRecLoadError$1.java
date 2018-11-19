package com.tinder.recs.view;

import android.view.View;
import com.tinder.R;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import com.tinder.utils.at;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationEnd"}, k = 3, mv = {1, 1, 10})
final class RecsView$showReferredRecLoadError$1 implements EndListener {
    final /* synthetic */ RecsView this$0;

    RecsView$showReferredRecLoadError$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final void onAnimationEnd() {
        at.f47621a.m57630a((View) this.this$0, (int) R.string.user_not_found);
    }
}
