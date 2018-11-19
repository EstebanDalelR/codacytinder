package com.tinder.passport.p302c;

import com.tinder.passport.p093d.C3945a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.passport.c.c */
public final class C13541c implements Factory<C10039a> {
    /* renamed from: a */
    private final Provider<C3945a> f43261a;

    public /* synthetic */ Object get() {
        return m52924a();
    }

    public C13541c(Provider<C3945a> provider) {
        this.f43261a = provider;
    }

    /* renamed from: a */
    public C10039a m52924a() {
        return C13541c.m52922a(this.f43261a);
    }

    /* renamed from: a */
    public static C10039a m52922a(Provider<C3945a> provider) {
        return new C10039a((C3945a) provider.get());
    }

    /* renamed from: b */
    public static C13541c m52923b(Provider<C3945a> provider) {
        return new C13541c(provider);
    }

    /* renamed from: a */
    public static C10039a m52921a(C3945a c3945a) {
        return new C10039a(c3945a);
    }
}
