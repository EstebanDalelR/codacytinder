package com.tinder.auth.repository;

import com.google.android.gms.iid.C2553a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.repository.o */
public final class C12605o implements Factory<C10351n> {
    /* renamed from: a */
    private final Provider<C2553a> f40697a;

    public /* synthetic */ Object get() {
        return m49794a();
    }

    public C12605o(Provider<C2553a> provider) {
        this.f40697a = provider;
    }

    /* renamed from: a */
    public C10351n m49794a() {
        return C12605o.m49792a(this.f40697a);
    }

    /* renamed from: a */
    public static C10351n m49792a(Provider<C2553a> provider) {
        return new C10351n((C2553a) provider.get());
    }

    /* renamed from: b */
    public static C12605o m49793b(Provider<C2553a> provider) {
        return new C12605o(provider);
    }

    /* renamed from: a */
    public static C10351n m49791a(C2553a c2553a) {
        return new C10351n(c2553a);
    }
}
