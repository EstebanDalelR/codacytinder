package com.tinder.auth.interactor;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.f */
public final class C12579f implements Factory<C8277d> {
    /* renamed from: a */
    private final Provider<C8276b> f40644a;

    public /* synthetic */ Object get() {
        return m49723a();
    }

    public C12579f(Provider<C8276b> provider) {
        this.f40644a = provider;
    }

    /* renamed from: a */
    public C8277d m49723a() {
        return C12579f.m49721a(this.f40644a);
    }

    /* renamed from: a */
    public static C8277d m49721a(Provider<C8276b> provider) {
        return new C8277d((C8276b) provider.get());
    }

    /* renamed from: b */
    public static C12579f m49722b(Provider<C8276b> provider) {
        return new C12579f(provider);
    }
}
