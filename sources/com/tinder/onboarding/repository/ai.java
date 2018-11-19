package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.FieldsResponse;
import rx.functions.Func1;

final /* synthetic */ class ai implements Func1 {
    /* renamed from: a */
    private final C9986a f43211a;

    private ai(C9986a c9986a) {
        this.f43211a = c9986a;
    }

    /* renamed from: a */
    static Func1 m52885a(C9986a c9986a) {
        return new ai(c9986a);
    }

    public Object call(Object obj) {
        return this.f43211a.m40979a((FieldsResponse) obj);
    }
}
