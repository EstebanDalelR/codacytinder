package com.tinder.boost.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.boost.model.h */
final /* synthetic */ class C10427h implements Function {
    /* renamed from: a */
    static final Function f33995a = new C10427h();

    private C10427h() {
    }

    public Object apply(Object obj) {
        return Long.valueOf(((GlobalConfig) obj).getBoostDuration());
    }
}
