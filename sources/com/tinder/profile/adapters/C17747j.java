package com.tinder.profile.adapters;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.adapters.j */
public final class C17747j implements Factory<C14366i> {
    /* renamed from: a */
    private final Provider<C14364e> f55375a;
    /* renamed from: b */
    private final Provider<C14365g> f55376b;

    public /* synthetic */ Object get() {
        return m64876a();
    }

    public C17747j(Provider<C14364e> provider, Provider<C14365g> provider2) {
        this.f55375a = provider;
        this.f55376b = provider2;
    }

    /* renamed from: a */
    public C14366i m64876a() {
        return C17747j.m64874a(this.f55375a, this.f55376b);
    }

    /* renamed from: a */
    public static C14366i m64874a(Provider<C14364e> provider, Provider<C14365g> provider2) {
        return new C14366i((C14364e) provider.get(), (C14365g) provider2.get());
    }

    /* renamed from: b */
    public static C17747j m64875b(Provider<C14364e> provider, Provider<C14365g> provider2) {
        return new C17747j(provider, provider2);
    }
}
