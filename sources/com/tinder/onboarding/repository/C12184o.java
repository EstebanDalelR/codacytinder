package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.GenderSelection.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.o */
final /* synthetic */ class C12184o implements Consumer {
    /* renamed from: a */
    private final Builder f39474a;

    private C12184o(Builder builder) {
        this.f39474a = builder;
    }

    /* renamed from: a */
    static Consumer m48321a(Builder builder) {
        return new C12184o(builder);
    }

    public void accept(Object obj) {
        this.f39474a.customGender((String) obj);
    }
}
