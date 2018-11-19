package com.tinder.tinderplus.model;

import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.model.q */
final /* synthetic */ class C16971q implements Function {
    /* renamed from: a */
    static final Function f52359a = new C16971q();

    private C16971q() {
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((TinderPlusIncentive) obj).getAnalyticsValue());
    }
}
