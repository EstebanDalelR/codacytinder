package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.o */
public final class C18105o implements Factory<C18104n> {
    /* renamed from: a */
    private final Provider<C14964a> f56200a;

    public /* synthetic */ Object get() {
        return m65715a();
    }

    public C18105o(Provider<C14964a> provider) {
        this.f56200a = provider;
    }

    /* renamed from: a */
    public C18104n m65715a() {
        return C18105o.m65713a(this.f56200a);
    }

    /* renamed from: a */
    public static C18104n m65713a(Provider<C14964a> provider) {
        return new C18104n((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18105o m65714b(Provider<C14964a> provider) {
        return new C18105o(provider);
    }
}
