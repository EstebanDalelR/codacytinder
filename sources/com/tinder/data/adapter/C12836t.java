package com.tinder.data.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.adapter.t */
public final class C12836t implements Factory<C10743s> {
    /* renamed from: a */
    private final Provider<C10738l> f41269a;

    public /* synthetic */ Object get() {
        return m50420a();
    }

    public C12836t(Provider<C10738l> provider) {
        this.f41269a = provider;
    }

    /* renamed from: a */
    public C10743s m50420a() {
        return C12836t.m50418a(this.f41269a);
    }

    /* renamed from: a */
    public static C10743s m50418a(Provider<C10738l> provider) {
        return new C10743s((C10738l) provider.get());
    }

    /* renamed from: b */
    public static C12836t m50419b(Provider<C10738l> provider) {
        return new C12836t(provider);
    }
}
