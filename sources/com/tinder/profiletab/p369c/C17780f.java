package com.tinder.profiletab.p369c;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.photooptimizer.C10110a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.c.f */
public final class C17780f implements Factory<C16176d> {
    /* renamed from: a */
    private final Provider<C2630h> f55479a;
    /* renamed from: b */
    private final Provider<C10110a> f55480b;

    public /* synthetic */ Object get() {
        return m64978a();
    }

    public C17780f(Provider<C2630h> provider, Provider<C10110a> provider2) {
        this.f55479a = provider;
        this.f55480b = provider2;
    }

    /* renamed from: a */
    public C16176d m64978a() {
        return C17780f.m64976a(this.f55479a, this.f55480b);
    }

    /* renamed from: a */
    public static C16176d m64976a(Provider<C2630h> provider, Provider<C10110a> provider2) {
        return new C16176d((C2630h) provider.get(), (C10110a) provider2.get());
    }

    /* renamed from: b */
    public static C17780f m64977b(Provider<C2630h> provider, Provider<C10110a> provider2) {
        return new C17780f(provider, provider2);
    }
}
