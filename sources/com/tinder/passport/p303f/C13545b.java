package com.tinder.passport.p303f;

import com.tinder.passport.provider.PassportLocationProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.passport.f.b */
public final class C13545b implements Factory<C12263a> {
    /* renamed from: a */
    private final Provider<PassportLocationProvider> f43267a;

    public /* synthetic */ Object get() {
        return m52935a();
    }

    public C13545b(Provider<PassportLocationProvider> provider) {
        this.f43267a = provider;
    }

    /* renamed from: a */
    public C12263a m52935a() {
        return C13545b.m52933a(this.f43267a);
    }

    /* renamed from: a */
    public static C12263a m52933a(Provider<PassportLocationProvider> provider) {
        return new C12263a((PassportLocationProvider) provider.get());
    }

    /* renamed from: b */
    public static C13545b m52934b(Provider<PassportLocationProvider> provider) {
        return new C13545b(provider);
    }
}
