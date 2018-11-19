package com.tinder.boost.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.boost.model.d */
final /* synthetic */ class C10423d implements Function {
    /* renamed from: a */
    static final Function f33991a = new C10423d();

    private C10423d() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).isBoostAvailable());
    }
}
