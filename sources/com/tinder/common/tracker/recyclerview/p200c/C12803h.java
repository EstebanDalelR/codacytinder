package com.tinder.common.tracker.recyclerview.p200c;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.tracker.recyclerview.c.h */
public final class C12803h implements Factory<C8576g> {
    /* renamed from: a */
    private final Provider<C2642a> f41204a;

    public /* synthetic */ Object get() {
        return m50304a();
    }

    public C12803h(Provider<C2642a> provider) {
        this.f41204a = provider;
    }

    /* renamed from: a */
    public C8576g m50304a() {
        return C12803h.m50302a(this.f41204a);
    }

    /* renamed from: a */
    public static C8576g m50302a(Provider<C2642a> provider) {
        return new C8576g((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C12803h m50303b(Provider<C2642a> provider) {
        return new C12803h(provider);
    }
}
