package com.tinder.session.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.analytics.b */
public final class C18053b implements Factory<C16579a> {
    /* renamed from: a */
    private final Provider<C14834c> f56061a;
    /* renamed from: b */
    private final Provider<C2630h> f56062b;

    public /* synthetic */ Object get() {
        return m65535a();
    }

    public C18053b(Provider<C14834c> provider, Provider<C2630h> provider2) {
        this.f56061a = provider;
        this.f56062b = provider2;
    }

    /* renamed from: a */
    public C16579a m65535a() {
        return C18053b.m65533a(this.f56061a, this.f56062b);
    }

    /* renamed from: a */
    public static C16579a m65533a(Provider<C14834c> provider, Provider<C2630h> provider2) {
        return new C16579a((C14834c) provider.get(), (C2630h) provider2.get());
    }

    /* renamed from: b */
    public static C18053b m65534b(Provider<C14834c> provider, Provider<C2630h> provider2) {
        return new C18053b(provider, provider2);
    }
}
