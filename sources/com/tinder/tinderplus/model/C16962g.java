package com.tinder.tinderplus.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.model.g */
final /* synthetic */ class C16962g implements Function {
    /* renamed from: a */
    static final Function f52350a = new C16962g();

    private C16962g() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).getDiscountAvailable());
    }
}
