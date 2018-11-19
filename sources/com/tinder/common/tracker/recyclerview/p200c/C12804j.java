package com.tinder.common.tracker.recyclerview.p200c;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.tracker.recyclerview.c.j */
public final class C12804j implements Factory<C8577i> {
    /* renamed from: a */
    private final Provider<C2642a> f41205a;

    public /* synthetic */ Object get() {
        return m50307a();
    }

    public C12804j(Provider<C2642a> provider) {
        this.f41205a = provider;
    }

    /* renamed from: a */
    public C8577i m50307a() {
        return C12804j.m50305a(this.f41205a);
    }

    /* renamed from: a */
    public static C8577i m50305a(Provider<C2642a> provider) {
        return new C8577i((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C12804j m50306b(Provider<C2642a> provider) {
        return new C12804j(provider);
    }
}
