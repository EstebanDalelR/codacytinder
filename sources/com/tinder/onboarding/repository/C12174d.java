package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingEmail.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.d */
final /* synthetic */ class C12174d implements Consumer {
    /* renamed from: a */
    private final Builder f39464a;

    private C12174d(Builder builder) {
        this.f39464a = builder;
    }

    /* renamed from: a */
    static Consumer m48317a(Builder builder) {
        return new C12174d(builder);
    }

    public void accept(Object obj) {
        this.f39464a.email((String) obj);
    }
}
