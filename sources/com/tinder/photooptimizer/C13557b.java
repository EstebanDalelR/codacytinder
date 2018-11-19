package com.tinder.photooptimizer;

import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.photooptimizer.b */
public final class C13557b implements Factory<C10110a> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f43286a;
    /* renamed from: b */
    private final Provider<bk> f43287b;

    public /* synthetic */ Object get() {
        return m52965a();
    }

    public C13557b(Provider<ManagerProfile> provider, Provider<bk> provider2) {
        this.f43286a = provider;
        this.f43287b = provider2;
    }

    /* renamed from: a */
    public C10110a m52965a() {
        return C13557b.m52963a(this.f43286a, this.f43287b);
    }

    /* renamed from: a */
    public static C10110a m52963a(Provider<ManagerProfile> provider, Provider<bk> provider2) {
        return new C10110a((ManagerProfile) provider.get(), (bk) provider2.get());
    }

    /* renamed from: b */
    public static C13557b m52964b(Provider<ManagerProfile> provider, Provider<bk> provider2) {
        return new C13557b(provider, provider2);
    }
}
