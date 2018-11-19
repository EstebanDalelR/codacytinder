package com.tinder.reactions.drawer.provider;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.drawer.provider.d */
public final class C17969d implements Factory<DrawerEventProvider> {
    /* renamed from: a */
    private final Provider<C16327e> f55902a;

    public /* synthetic */ Object get() {
        return m65310a();
    }

    public C17969d(Provider<C16327e> provider) {
        this.f55902a = provider;
    }

    /* renamed from: a */
    public DrawerEventProvider m65310a() {
        return C17969d.m65308a(this.f55902a);
    }

    /* renamed from: a */
    public static DrawerEventProvider m65308a(Provider<C16327e> provider) {
        return new DrawerEventProvider((C16327e) provider.get());
    }

    /* renamed from: b */
    public static C17969d m65309b(Provider<C16327e> provider) {
        return new C17969d(provider);
    }
}
