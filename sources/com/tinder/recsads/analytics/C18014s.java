package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.s */
public final class C18014s implements Factory<C16439r> {
    /* renamed from: a */
    private final Provider<C2630h> f55954a;
    /* renamed from: b */
    private final Provider<C14729c> f55955b;

    public /* synthetic */ Object get() {
        return m65401a();
    }

    public C18014s(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55954a = provider;
        this.f55955b = provider2;
    }

    /* renamed from: a */
    public C16439r m65401a() {
        return C18014s.m65399a(this.f55954a, this.f55955b);
    }

    /* renamed from: a */
    public static C16439r m65399a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C16439r((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18014s m65400b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18014s(provider, provider2);
    }
}
