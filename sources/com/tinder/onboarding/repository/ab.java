package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.FieldsResponse;
import rx.functions.Func1;

final /* synthetic */ class ab implements Func1 {
    /* renamed from: a */
    private final C9986a f43208a;

    private ab(C9986a c9986a) {
        this.f43208a = c9986a;
    }

    /* renamed from: a */
    static Func1 m52884a(C9986a c9986a) {
        return new ab(c9986a);
    }

    public Object call(Object obj) {
        return this.f43208a.m40979a((FieldsResponse) obj);
    }
}
