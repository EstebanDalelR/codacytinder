package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.u */
public final class C18015u implements Factory<C16440t> {
    /* renamed from: a */
    private final Provider<C2630h> f55956a;
    /* renamed from: b */
    private final Provider<C14729c> f55957b;

    public /* synthetic */ Object get() {
        return m65404a();
    }

    public C18015u(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55956a = provider;
        this.f55957b = provider2;
    }

    /* renamed from: a */
    public C16440t m65404a() {
        return C18015u.m65402a(this.f55956a, this.f55957b);
    }

    /* renamed from: a */
    public static C16440t m65402a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16440t((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18015u m65403b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18015u(provider, provider2);
    }
}
