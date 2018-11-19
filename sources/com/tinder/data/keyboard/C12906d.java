package com.tinder.data.keyboard;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.keyboard.d */
public final class C12906d implements Factory<C10789c> {
    /* renamed from: a */
    private final Provider<C10788a> f41372a;

    public /* synthetic */ Object get() {
        return m50581a();
    }

    public C12906d(Provider<C10788a> provider) {
        this.f41372a = provider;
    }

    /* renamed from: a */
    public C10789c m50581a() {
        return C12906d.m50579a(this.f41372a);
    }

    /* renamed from: a */
    public static C10789c m50579a(Provider<C10788a> provider) {
        return new C10789c((C10788a) provider.get());
    }

    /* renamed from: b */
    public static C12906d m50580b(Provider<C10788a> provider) {
        return new C12906d(provider);
    }
}
