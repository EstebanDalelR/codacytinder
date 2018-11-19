package com.tinder.bitmoji;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.bitmoji.b */
public final class C12618b implements Factory<C8321a> {
    /* renamed from: a */
    private final Provider<C8323c> f40720a;

    public /* synthetic */ Object get() {
        return m49838a();
    }

    public C12618b(Provider<C8323c> provider) {
        this.f40720a = provider;
    }

    /* renamed from: a */
    public C8321a m49838a() {
        return C12618b.m49836a(this.f40720a);
    }

    /* renamed from: a */
    public static C8321a m49836a(Provider<C8323c> provider) {
        return new C8321a((C8323c) provider.get());
    }

    /* renamed from: b */
    public static C12618b m49837b(Provider<C8323c> provider) {
        return new C12618b(provider);
    }
}
