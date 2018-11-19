package com.tinder.recs.data;

import rx.functions.Func1;

final /* synthetic */ class PaperSwipeRepository$SwipeStorage$$Lambda$0 implements Func1 {
    private final SwipeStorage arg$1;

    PaperSwipeRepository$SwipeStorage$$Lambda$0(SwipeStorage swipeStorage) {
        this.arg$1 = swipeStorage;
    }

    public Object call(Object obj) {
        return this.arg$1.lambda$loadAllSwipes$0$PaperSwipeRepository$SwipeStorage((String) obj);
    }
}
