package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.Field;
import com.tinder.onboarding.model.network.Field.Type;
import java8.util.function.Function;

/* renamed from: com.tinder.onboarding.repository.g */
final /* synthetic */ class C12177g implements Function {
    /* renamed from: a */
    private final Type f39467a;

    C12177g(Type type) {
        this.f39467a = type;
    }

    public Object apply(Object obj) {
        return Field.create(this.f39467a, obj);
    }
}
