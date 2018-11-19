package com.tinder.match.views;

import android.animation.Animator;
import com.tinder.utils.an;

class MatchListView$2 extends an {
    /* renamed from: a */
    final /* synthetic */ MatchListView f39255a;

    MatchListView$2(MatchListView matchListView) {
        this.f39255a = matchListView;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39255a.searchFrostOverlay.setVisibility(8);
    }
}
