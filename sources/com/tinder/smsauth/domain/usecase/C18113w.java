package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.w */
public final class C18113w implements Factory<C18112v> {
    /* renamed from: a */
    private final Provider<C14964a> f56208a;

    public /* synthetic */ Object get() {
        return m65731a();
    }

    public C18113w(Provider<C14964a> provider) {
        this.f56208a = provider;
    }

    /* renamed from: a */
    public C18112v m65731a() {
        return C18113w.m65729a(this.f56208a);
    }

    /* renamed from: a */
    public static C18112v m65729a(Provider<C14964a> provider) {
        return new C18112v((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18113w m65730b(Provider<C14964a> provider) {
        return new C18113w(provider);
    }
}
