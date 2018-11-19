package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.j */
public final class C18101j implements Factory<C18100i> {
    /* renamed from: a */
    private final Provider<C14964a> f56196a;

    public /* synthetic */ Object get() {
        return m65705a();
    }

    public C18101j(Provider<C14964a> provider) {
        this.f56196a = provider;
    }

    /* renamed from: a */
    public C18100i m65705a() {
        return C18101j.m65703a(this.f56196a);
    }

    /* renamed from: a */
    public static C18100i m65703a(Provider<C14964a> provider) {
        return new C18100i((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18101j m65704b(Provider<C14964a> provider) {
        return new C18101j(provider);
    }
}
