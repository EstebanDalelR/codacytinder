package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.f */
public final class C18273f implements Factory<C17206e> {
    /* renamed from: a */
    private final Provider<C2630h> f56602a;

    public /* synthetic */ Object get() {
        return m66197a();
    }

    public C18273f(Provider<C2630h> provider) {
        this.f56602a = provider;
    }

    /* renamed from: a */
    public C17206e m66197a() {
        return C18273f.m66195a(this.f56602a);
    }

    /* renamed from: a */
    public static C17206e m66195a(Provider<C2630h> provider) {
        return new C17206e((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18273f m66196b(Provider<C2630h> provider) {
        return new C18273f(provider);
    }
}
