package com.tinder.match.views;

import android.animation.Animator;
import com.tinder.utils.an;

class MatchListView$3 extends an {
    /* renamed from: a */
    final /* synthetic */ MatchListView f39256a;

    MatchListView$3(MatchListView matchListView) {
        this.f39256a = matchListView;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39256a.matchListRecycler.setVisibility(8);
        animator.removeAllListeners();
    }
}
