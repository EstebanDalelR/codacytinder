package com.tinder.onboarding.repository;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.repository.r */
public final class C13529r implements Factory<C9986a> {
    /* renamed from: a */
    private final Provider<Gson> f43227a;

    public /* synthetic */ Object get() {
        return m52893a();
    }

    public C13529r(Provider<Gson> provider) {
        this.f43227a = provider;
    }

    /* renamed from: a */
    public C9986a m52893a() {
        return C13529r.m52891a(this.f43227a);
    }

    /* renamed from: a */
    public static C9986a m52891a(Provider<Gson> provider) {
        return new C9986a((Gson) provider.get());
    }

    /* renamed from: b */
    public static C13529r m52892b(Provider<Gson> provider) {
        return new C13529r(provider);
    }
}
