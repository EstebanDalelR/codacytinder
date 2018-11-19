package com.tinder.tinderplus.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.model.n */
final /* synthetic */ class C16969n implements Function {
    /* renamed from: a */
    static final Function f52357a = new C16969n();

    private C16969n() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).isSubscriptionExpired());
    }
}
