package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.model.network.UpdateFieldsRequest.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.k */
final /* synthetic */ class C12180k implements Consumer {
    /* renamed from: a */
    private final Builder f39470a;

    C12180k(Builder builder) {
        this.f39470a = builder;
    }

    public void accept(Object obj) {
        C9986a.m40970a(this.f39470a, (GenderSelection) obj);
    }
}
