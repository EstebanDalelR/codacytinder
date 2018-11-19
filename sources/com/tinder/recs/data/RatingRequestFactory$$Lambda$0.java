package com.tinder.recs.data;

import java8.util.function.Function;

final /* synthetic */ class RatingRequestFactory$$Lambda$0 implements Function {
    static final Function $instance = new RatingRequestFactory$$Lambda$0();

    private RatingRequestFactory$$Lambda$0() {
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((Boolean) obj).booleanValue());
    }
}
