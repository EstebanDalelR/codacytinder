package com.tinder.tinderplus.model;

import com.tinder.model.GlobalConfig;
import java8.util.function.Function;

/* renamed from: com.tinder.tinderplus.model.l */
final /* synthetic */ class C16967l implements Function {
    /* renamed from: a */
    static final Function f52355a = new C16967l();

    private C16967l() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((GlobalConfig) obj).isPlusEnabled());
    }
}
