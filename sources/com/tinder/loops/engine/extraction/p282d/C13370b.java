package com.tinder.loops.engine.extraction.p282d;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.extraction.d.b */
public final class C13370b implements Factory<C9800a> {
    /* renamed from: a */
    private final Provider<C9802e> f42383a;
    /* renamed from: b */
    private final Provider<C11940c> f42384b;

    public /* synthetic */ Object get() {
        return m51714a();
    }

    public C13370b(Provider<C9802e> provider, Provider<C11940c> provider2) {
        this.f42383a = provider;
        this.f42384b = provider2;
    }

    /* renamed from: a */
    public C9800a m51714a() {
        return C13370b.m51712a(this.f42383a, this.f42384b);
    }

    /* renamed from: a */
    public static C9800a m51712a(Provider<C9802e> provider, Provider<C11940c> provider2) {
        return new C9800a((C9802e) provider.get(), (C11940c) provider2.get());
    }

    /* renamed from: b */
    public static C13370b m51713b(Provider<C9802e> provider, Provider<C11940c> provider2) {
        return new C13370b(provider, provider2);
    }
}
