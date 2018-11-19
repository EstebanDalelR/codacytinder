package com.tinder.common.tracker.recyclerview.p200c;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.tracker.recyclerview.c.f */
public final class C12802f implements Factory<C8575e> {
    /* renamed from: a */
    private final Provider<C2642a> f41203a;

    public /* synthetic */ Object get() {
        return m50301a();
    }

    public C12802f(Provider<C2642a> provider) {
        this.f41203a = provider;
    }

    /* renamed from: a */
    public C8575e m50301a() {
        return C12802f.m50299a(this.f41203a);
    }

    /* renamed from: a */
    public static C8575e m50299a(Provider<C2642a> provider) {
        return new C8575e((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C12802f m50300b(Provider<C2642a> provider) {
        return new C12802f(provider);
    }
}
