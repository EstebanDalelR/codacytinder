package com.tinder.data.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.adapter.r */
public final class C12835r implements Factory<C10742q> {
    /* renamed from: a */
    private final Provider<C10738l> f41268a;

    public /* synthetic */ Object get() {
        return m50417a();
    }

    public C12835r(Provider<C10738l> provider) {
        this.f41268a = provider;
    }

    /* renamed from: a */
    public C10742q m50417a() {
        return C12835r.m50415a(this.f41268a);
    }

    /* renamed from: a */
    public static C10742q m50415a(Provider<C10738l> provider) {
        return new C10742q((C10738l) provider.get());
    }

    /* renamed from: b */
    public static C12835r m50416b(Provider<C10738l> provider) {
        return new C12835r(provider);
    }
}
