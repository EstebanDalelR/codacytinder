package com.tinder.loops.engine.creation.p278e;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.creation.e.b */
public final class C13364b implements Factory<C9785a> {
    /* renamed from: a */
    private final Provider<C9787e> f42372a;
    /* renamed from: b */
    private final Provider<C11934c> f42373b;

    public /* synthetic */ Object get() {
        return m51696a();
    }

    public C13364b(Provider<C9787e> provider, Provider<C11934c> provider2) {
        this.f42372a = provider;
        this.f42373b = provider2;
    }

    /* renamed from: a */
    public C9785a m51696a() {
        return C13364b.m51694a(this.f42372a, this.f42373b);
    }

    /* renamed from: a */
    public static C9785a m51694a(Provider<C9787e> provider, Provider<C11934c> provider2) {
        return new C9785a((C9787e) provider.get(), (C11934c) provider2.get());
    }

    /* renamed from: b */
    public static C13364b m51695b(Provider<C9787e> provider, Provider<C11934c> provider2) {
        return new C13364b(provider, provider2);
    }
}
