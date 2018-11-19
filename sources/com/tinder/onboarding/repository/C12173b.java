package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.model.network.UpdateFieldsRequest.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.b */
final /* synthetic */ class C12173b implements Consumer {
    /* renamed from: a */
    private final Builder f39463a;

    C12173b(Builder builder) {
        this.f39463a = builder;
    }

    public void accept(Object obj) {
        C9986a.m40971a(this.f39463a, (OnboardingEmail) obj);
    }
}
