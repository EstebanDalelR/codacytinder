package com.tinder.onboarding.repository;

import com.tinder.onboarding.repository.C9986a.C9985a;
import java8.util.function.Function;
import org.joda.time.LocalDate;

/* renamed from: com.tinder.onboarding.repository.i */
final /* synthetic */ class C12179i implements Function {
    /* renamed from: a */
    private final C9985a f39469a;

    private C12179i(C9985a c9985a) {
        this.f39469a = c9985a;
    }

    /* renamed from: a */
    static Function m48319a(C9985a c9985a) {
        return new C12179i(c9985a);
    }

    public Object apply(Object obj) {
        return this.f39469a.m40959a((LocalDate) obj);
    }
}
