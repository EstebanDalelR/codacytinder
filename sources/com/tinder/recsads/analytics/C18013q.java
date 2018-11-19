package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.q */
public final class C18013q implements Factory<C16438p> {
    /* renamed from: a */
    private final Provider<C2630h> f55952a;
    /* renamed from: b */
    private final Provider<C14729c> f55953b;

    public /* synthetic */ Object get() {
        return m65398a();
    }

    public C18013q(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55952a = provider;
        this.f55953b = provider2;
    }

    /* renamed from: a */
    public C16438p m65398a() {
        return C18013q.m65396a(this.f55952a, this.f55953b);
    }

    /* renamed from: a */
    public static C16438p m65396a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16438p((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18013q m65397b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18013q(provider, provider2);
    }
}
