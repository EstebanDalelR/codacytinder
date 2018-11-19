package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.e */
public final class C18008e implements Factory<C16432d> {
    /* renamed from: a */
    private final Provider<C2630h> f55942a;
    /* renamed from: b */
    private final Provider<C14729c> f55943b;

    public /* synthetic */ Object get() {
        return m65383a();
    }

    public C18008e(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55942a = provider;
        this.f55943b = provider2;
    }

    /* renamed from: a */
    public C16432d m65383a() {
        return C18008e.m65381a(this.f55942a, this.f55943b);
    }

    /* renamed from: a */
    public static C16432d m65381a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16432d((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18008e m65382b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18008e(provider, provider2);
    }
}
