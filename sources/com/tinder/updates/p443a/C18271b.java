package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.b */
public final class C18271b implements Factory<C17204a> {
    /* renamed from: a */
    private final Provider<C2630h> f56600a;

    public /* synthetic */ Object get() {
        return m66191a();
    }

    public C18271b(Provider<C2630h> provider) {
        this.f56600a = provider;
    }

    /* renamed from: a */
    public C17204a m66191a() {
        return C18271b.m66189a(this.f56600a);
    }

    /* renamed from: a */
    public static C17204a m66189a(Provider<C2630h> provider) {
        return new C17204a((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18271b m66190b(Provider<C2630h> provider) {
        return new C18271b(provider);
    }
}
