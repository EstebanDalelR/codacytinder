package com.tinder.recs.data;

import java.util.HashSet;
import java.util.List;
import rx.functions.Func1;

final /* synthetic */ class PaperSwipeRepository$SwipeStorage$$Lambda$1 implements Func1 {
    static final Func1 $instance = new PaperSwipeRepository$SwipeStorage$$Lambda$1();

    private PaperSwipeRepository$SwipeStorage$$Lambda$1() {
    }

    public Object call(Object obj) {
        return new HashSet((List) obj);
    }
}
