package com.tinder.activities;

import java8.util.function.Predicate;

final /* synthetic */ class ac implements Predicate {
    /* renamed from: a */
    private final Class f26206a;

    private ac(Class cls) {
        this.f26206a = cls;
    }

    /* renamed from: a */
    static Predicate m31108a(Class cls) {
        return new ac(cls);
    }

    public boolean test(Object obj) {
        return this.f26206a.isInstance(obj);
    }
}
