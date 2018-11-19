package com.tinder.typingindicator.p485c;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.C8597m;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.c.b */
public final class C18247b implements Factory<C17160a> {
    /* renamed from: a */
    private final Provider<C8597m> f56564a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f56565b;

    public /* synthetic */ Object get() {
        return m66131a();
    }

    public C18247b(Provider<C8597m> provider, Provider<AbTestUtility> provider2) {
        this.f56564a = provider;
        this.f56565b = provider2;
    }

    /* renamed from: a */
    public C17160a m66131a() {
        return C18247b.m66129a(this.f56564a, this.f56565b);
    }

    /* renamed from: a */
    public static C17160a m66129a(Provider<C8597m> provider, Provider<AbTestUtility> provider2) {
        return new C17160a((C8597m) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static C18247b m66130b(Provider<C8597m> provider, Provider<AbTestUtility> provider2) {
        return new C18247b(provider, provider2);
    }
}
