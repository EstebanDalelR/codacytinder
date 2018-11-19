package com.tinder.recs;

import com.tinder.domain.recs.model.Rec;
import java8.util.function.Function;

final /* synthetic */ class RecsCardFactory$$Lambda$0 implements Function {
    private final RecsCardFactory arg$1;

    RecsCardFactory$$Lambda$0(RecsCardFactory recsCardFactory) {
        this.arg$1 = recsCardFactory;
    }

    public Object apply(Object obj) {
        return this.arg$1.createCard((Rec) obj);
    }
}
