package com.tinder.typingindicator.provider;

import com.tinder.typingindicator.p440f.C18258l;
import com.tinder.typingindicator.usecase.C17183m;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.provider.c */
public final class C18261c implements Factory<C15327a> {
    /* renamed from: a */
    private final Provider<C17183m> f56576a;
    /* renamed from: b */
    private final Provider<C18258l> f56577b;

    public /* synthetic */ Object get() {
        return m66161a();
    }

    public C18261c(Provider<C17183m> provider, Provider<C18258l> provider2) {
        this.f56576a = provider;
        this.f56577b = provider2;
    }

    /* renamed from: a */
    public C15327a m66161a() {
        return C18261c.m66159a(this.f56576a, this.f56577b);
    }

    /* renamed from: a */
    public static C15327a m66159a(Provider<C17183m> provider, Provider<C18258l> provider2) {
        return new C15327a((C17183m) provider.get(), (C18258l) provider2.get());
    }

    /* renamed from: b */
    public static C18261c m66160b(Provider<C17183m> provider, Provider<C18258l> provider2) {
        return new C18261c(provider, provider2);
    }
}
