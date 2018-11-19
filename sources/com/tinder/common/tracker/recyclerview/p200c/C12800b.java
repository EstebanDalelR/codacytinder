package com.tinder.common.tracker.recyclerview.p200c;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.tracker.recyclerview.c.b */
public final class C12800b implements Factory<C8573a> {
    /* renamed from: a */
    private final Provider<C2642a> f41201a;

    public /* synthetic */ Object get() {
        return m50295a();
    }

    public C12800b(Provider<C2642a> provider) {
        this.f41201a = provider;
    }

    /* renamed from: a */
    public C8573a m50295a() {
        return C12800b.m50293a(this.f41201a);
    }

    /* renamed from: a */
    public static C8573a m50293a(Provider<C2642a> provider) {
        return new C8573a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C12800b m50294b(Provider<C2642a> provider) {
        return new C12800b(provider);
    }
}
