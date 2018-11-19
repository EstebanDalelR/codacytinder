package com.tinder.boost.p179b;

import com.tinder.boost.p178a.C10400d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.b.b */
public final class C12625b implements Factory<C8338a> {
    /* renamed from: a */
    private final Provider<C10400d> f40733a;

    public /* synthetic */ Object get() {
        return m49851a();
    }

    public C12625b(Provider<C10400d> provider) {
        this.f40733a = provider;
    }

    /* renamed from: a */
    public C8338a m49851a() {
        return C12625b.m49849a(this.f40733a);
    }

    /* renamed from: a */
    public static C8338a m49849a(Provider<C10400d> provider) {
        return new C8338a((C10400d) provider.get());
    }

    /* renamed from: b */
    public static C12625b m49850b(Provider<C10400d> provider) {
        return new C12625b(provider);
    }
}
