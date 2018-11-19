package com.tinder.tinderplus.model;

import com.tinder.domain.common.model.TimeInterval;
import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.model.r */
final /* synthetic */ class C16972r implements Function {
    /* renamed from: a */
    static final Function f52360a = new C16972r();

    private C16972r() {
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((TimeInterval) obj).length());
    }
}
