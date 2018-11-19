package com.tinder.common.provider;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.provider.b */
public final class C12787b implements Factory<C8549a> {
    /* renamed from: a */
    private final Provider<C2642a> f41182a;

    public /* synthetic */ Object get() {
        return m50272a();
    }

    public C12787b(Provider<C2642a> provider) {
        this.f41182a = provider;
    }

    /* renamed from: a */
    public C8549a m50272a() {
        return C12787b.m50270a(this.f41182a);
    }

    /* renamed from: a */
    public static C8549a m50270a(Provider<C2642a> provider) {
        return new C8549a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C12787b m50271b(Provider<C2642a> provider) {
        return new C12787b(provider);
    }
}
