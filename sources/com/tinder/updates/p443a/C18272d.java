package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.d */
public final class C18272d implements Factory<C17205c> {
    /* renamed from: a */
    private final Provider<C2630h> f56601a;

    public /* synthetic */ Object get() {
        return m66194a();
    }

    public C18272d(Provider<C2630h> provider) {
        this.f56601a = provider;
    }

    /* renamed from: a */
    public C17205c m66194a() {
        return C18272d.m66192a(this.f56601a);
    }

    /* renamed from: a */
    public static C17205c m66192a(Provider<C2630h> provider) {
        return new C17205c((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18272d m66193b(Provider<C2630h> provider) {
        return new C18272d(provider);
    }
}
