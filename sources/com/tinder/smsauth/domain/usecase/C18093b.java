package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.b */
public final class C18093b implements Factory<C18092a> {
    /* renamed from: a */
    private final Provider<C14964a> f56188a;

    public /* synthetic */ Object get() {
        return m65689a();
    }

    public C18093b(Provider<C14964a> provider) {
        this.f56188a = provider;
    }

    /* renamed from: a */
    public C18092a m65689a() {
        return C18093b.m65687a(this.f56188a);
    }

    /* renamed from: a */
    public static C18092a m65687a(Provider<C14964a> provider) {
        return new C18092a((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18093b m65688b(Provider<C14964a> provider) {
        return new C18093b(provider);
    }
}
