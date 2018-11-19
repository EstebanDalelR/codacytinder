package com.tinder.onboarding.repository;

import com.tinder.domain.common.model.Gender.Value;
import com.tinder.onboarding.model.GenderSelection.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.n */
final /* synthetic */ class C12183n implements Consumer {
    /* renamed from: a */
    private final Builder f39473a;

    C12183n(Builder builder) {
        this.f39473a = builder;
    }

    public void accept(Object obj) {
        this.f39473a.gender(Value.fromId(((Number) obj).intValue()));
    }
}
