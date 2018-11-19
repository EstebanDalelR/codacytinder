package com.tinder.tinderplus.p429b;

import com.tinder.tinderplus.model.TinderPlusIncentive;
import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.b.i */
final /* synthetic */ class C16942i implements Function {
    /* renamed from: a */
    static final Function f52222a = new C16942i();

    private C16942i() {
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((TinderPlusIncentive) obj).getAnalyticsValue());
    }
}
