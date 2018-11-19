package com.tinder.activities;

import java8.util.function.Function;

final /* synthetic */ class ad implements Function {
    /* renamed from: a */
    private final Class f26207a;

    private ad(Class cls) {
        this.f26207a = cls;
    }

    /* renamed from: a */
    static Function m31109a(Class cls) {
        return new ad(cls);
    }

    public Object apply(Object obj) {
        return this.f26207a.cast(obj);
    }
}
