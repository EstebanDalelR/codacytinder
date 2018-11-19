package com.tinder.boost.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.boost.model.f */
final /* synthetic */ class C10425f implements Function {
    /* renamed from: a */
    static final Function f33993a = new C10425f();

    private C10425f() {
    }

    public Object apply(Object obj) {
        return Double.valueOf(((GlobalConfig) obj).getBoostIntroMultiplier());
    }
}
