package com.tinder.module;

import com.tinder.passport.p093d.C3945a;
import com.tinder.passport.provider.PassportLocationProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dc implements Factory<PassportLocationProvider> {
    /* renamed from: a */
    private final bs f42905a;
    /* renamed from: b */
    private final Provider<C3945a> f42906b;

    public /* synthetic */ Object get() {
        return m52341a();
    }

    public dc(bs bsVar, Provider<C3945a> provider) {
        this.f42905a = bsVar;
        this.f42906b = provider;
    }

    /* renamed from: a */
    public PassportLocationProvider m52341a() {
        return m52339a(this.f42905a, this.f42906b);
    }

    /* renamed from: a */
    public static PassportLocationProvider m52339a(bs bsVar, Provider<C3945a> provider) {
        return m52338a(bsVar, (C3945a) provider.get());
    }

    /* renamed from: b */
    public static dc m52340b(bs bsVar, Provider<C3945a> provider) {
        return new dc(bsVar, provider);
    }

    /* renamed from: a */
    public static PassportLocationProvider m52338a(bs bsVar, C3945a c3945a) {
        return (PassportLocationProvider) C15521i.a(bsVar.m40819a(c3945a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
