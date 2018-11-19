package com.tinder.recs.data;

import rx.Notification;
import rx.functions.Func1;

final /* synthetic */ class RatingResultAdapter$$Lambda$1 implements Func1 {
    static final Func1 $instance = new RatingResultAdapter$$Lambda$1();

    private RatingResultAdapter$$Lambda$1() {
    }

    public Object call(Object obj) {
        return RatingResultAdapter.lambda$fromSuperLikeRatingResponse$1$RatingResultAdapter((Notification) obj);
    }
}
