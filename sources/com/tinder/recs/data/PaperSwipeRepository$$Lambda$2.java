package com.tinder.recs.data;

import java.util.Set;
import rx.functions.Action1;

final /* synthetic */ class PaperSwipeRepository$$Lambda$2 implements Action1 {
    private final PaperSwipeRepository arg$1;

    PaperSwipeRepository$$Lambda$2(PaperSwipeRepository paperSwipeRepository) {
        this.arg$1 = paperSwipeRepository;
    }

    public void call(Object obj) {
        this.arg$1.lambda$subscribeToCacheUpdate$1$PaperSwipeRepository((Set) obj);
    }
}
