package com.tinder.auth.p167b;

import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.b.b */
public final class C12567b implements Factory<C8272a> {
    /* renamed from: a */
    private final Provider<bk> f40610a;

    public /* synthetic */ Object get() {
        return m49681a();
    }

    public C12567b(Provider<bk> provider) {
        this.f40610a = provider;
    }

    /* renamed from: a */
    public C8272a m49681a() {
        return C12567b.m49679a(this.f40610a);
    }

    /* renamed from: a */
    public static C8272a m49679a(Provider<bk> provider) {
        return new C8272a((bk) provider.get());
    }

    /* renamed from: b */
    public static C12567b m49680b(Provider<bk> provider) {
        return new C12567b(provider);
    }
}
