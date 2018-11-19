package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.Field;
import com.tinder.onboarding.model.network.UpdateFieldsRequest.Builder;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.repository.h */
final /* synthetic */ class C12178h implements Consumer {
    /* renamed from: a */
    private final Builder f39468a;

    private C12178h(Builder builder) {
        this.f39468a = builder;
    }

    /* renamed from: a */
    static Consumer m48318a(Builder builder) {
        return new C12178h(builder);
    }

    public void accept(Object obj) {
        this.f39468a.addField((Field) obj);
    }
}
