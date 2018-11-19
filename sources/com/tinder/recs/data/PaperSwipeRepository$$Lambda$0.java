package com.tinder.recs.data;

import java.util.Set;
import rx.functions.Action1;

final /* synthetic */ class PaperSwipeRepository$$Lambda$0 implements Action1 {
    private final SwipeCache arg$1;

    private PaperSwipeRepository$$Lambda$0(SwipeCache swipeCache) {
        this.arg$1 = swipeCache;
    }

    static Action1 get$Lambda(SwipeCache swipeCache) {
        return new PaperSwipeRepository$$Lambda$0(swipeCache);
    }

    public void call(Object obj) {
        this.arg$1.saveSwipes((Set) obj);
    }
}
