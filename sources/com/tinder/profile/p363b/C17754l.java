package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.l */
public final class C17754l implements Factory<C14386k> {
    /* renamed from: a */
    private final Provider<C2630h> f55394a;

    public /* synthetic */ Object get() {
        return m64915a();
    }

    public C17754l(Provider<C2630h> provider) {
        this.f55394a = provider;
    }

    /* renamed from: a */
    public C14386k m64915a() {
        return C17754l.m64913a(this.f55394a);
    }

    /* renamed from: a */
    public static C14386k m64913a(Provider<C2630h> provider) {
        return new C14386k((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C17754l m64914b(Provider<C2630h> provider) {
        return new C17754l(provider);
    }
}
