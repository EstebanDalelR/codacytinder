package com.tinder.profiletab.p367a;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.a.b */
public final class C17776b implements Factory<C14458a> {
    /* renamed from: a */
    private final Provider<C2642a> f55471a;

    public /* synthetic */ Object get() {
        return m64970a();
    }

    public C17776b(Provider<C2642a> provider) {
        this.f55471a = provider;
    }

    /* renamed from: a */
    public C14458a m64970a() {
        return C17776b.m64968a(this.f55471a);
    }

    /* renamed from: a */
    public static C14458a m64968a(Provider<C2642a> provider) {
        return new C14458a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C17776b m64969b(Provider<C2642a> provider) {
        return new C17776b(provider);
    }
}
