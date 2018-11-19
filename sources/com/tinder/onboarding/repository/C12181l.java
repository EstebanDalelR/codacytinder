package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingPassword;
import com.tinder.onboarding.model.network.UpdateFieldsRequest.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.l */
final /* synthetic */ class C12181l implements Consumer {
    /* renamed from: a */
    private final Builder f39471a;

    C12181l(Builder builder) {
        this.f39471a = builder;
    }

    public void accept(Object obj) {
        C9986a.m40972a(this.f39471a, (OnboardingPassword) obj);
    }
}
