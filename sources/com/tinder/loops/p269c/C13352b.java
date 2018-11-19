package com.tinder.loops.p269c;

import com.tinder.base.p172b.C8301a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.c.b */
public final class C13352b implements Factory<C9763a> {
    /* renamed from: a */
    private final Provider<C8301a> f42355a;

    public /* synthetic */ Object get() {
        return m51657a();
    }

    public C13352b(Provider<C8301a> provider) {
        this.f42355a = provider;
    }

    /* renamed from: a */
    public C9763a m51657a() {
        return C13352b.m51655a(this.f42355a);
    }

    /* renamed from: a */
    public static C9763a m51655a(Provider<C8301a> provider) {
        return new C9763a((C8301a) provider.get());
    }

    /* renamed from: b */
    public static C13352b m51656b(Provider<C8301a> provider) {
        return new C13352b(provider);
    }
}
