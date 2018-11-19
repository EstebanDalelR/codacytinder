package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.f */
public final class C17752f implements Factory<C14378e> {
    /* renamed from: a */
    private final Provider<C2630h> f55392a;

    public /* synthetic */ Object get() {
        return m64909a();
    }

    public C17752f(Provider<C2630h> provider) {
        this.f55392a = provider;
    }

    /* renamed from: a */
    public C14378e m64909a() {
        return C17752f.m64907a(this.f55392a);
    }

    /* renamed from: a */
    public static C14378e m64907a(Provider<C2630h> provider) {
        return new C14378e((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C17752f m64908b(Provider<C2630h> provider) {
        return new C17752f(provider);
    }
}
