package com.tinder.reactions.navigation.p398c;

import com.tinder.reactions.common.C14613b;
import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.navigation.c.c */
public final class C17994c implements Factory<C14684a> {
    /* renamed from: a */
    private final Provider<C14613b> f55930a;
    /* renamed from: b */
    private final Provider<DrawerEventProvider> f55931b;

    public /* synthetic */ Object get() {
        return m65363a();
    }

    public C17994c(Provider<C14613b> provider, Provider<DrawerEventProvider> provider2) {
        this.f55930a = provider;
        this.f55931b = provider2;
    }

    /* renamed from: a */
    public C14684a m65363a() {
        return C17994c.m65361a(this.f55930a, this.f55931b);
    }

    /* renamed from: a */
    public static C14684a m65361a(Provider<C14613b> provider, Provider<DrawerEventProvider> provider2) {
        return new C14684a((C14613b) provider.get(), (DrawerEventProvider) provider2.get());
    }

    /* renamed from: b */
    public static C17994c m65362b(Provider<C14613b> provider, Provider<DrawerEventProvider> provider2) {
        return new C17994c(provider, provider2);
    }
}
