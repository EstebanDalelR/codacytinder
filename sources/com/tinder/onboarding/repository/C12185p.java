package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.GenderSelection.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.p */
final /* synthetic */ class C12185p implements Consumer {
    /* renamed from: a */
    private final Builder f39475a;

    private C12185p(Builder builder) {
        this.f39475a = builder;
    }

    /* renamed from: a */
    static Consumer m48322a(Builder builder) {
        return new C12185p(builder);
    }

    public void accept(Object obj) {
        this.f39475a.showGenderOnProfile((Boolean) obj);
    }
}
