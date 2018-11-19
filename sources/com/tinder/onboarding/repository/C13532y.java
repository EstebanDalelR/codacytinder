package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.FieldsResponse;
import rx.functions.Func1;

/* renamed from: com.tinder.onboarding.repository.y */
final /* synthetic */ class C13532y implements Func1 {
    /* renamed from: a */
    private final C9986a f43230a;

    private C13532y(C9986a c9986a) {
        this.f43230a = c9986a;
    }

    /* renamed from: a */
    static Func1 m52894a(C9986a c9986a) {
        return new C13532y(c9986a);
    }

    public Object call(Object obj) {
        return this.f43230a.m40979a((FieldsResponse) obj);
    }
}
