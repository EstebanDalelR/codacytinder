package com.tinder.chat.view.action;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.b */
public final class C12739b implements Factory<C8457a> {
    /* renamed from: a */
    private final Provider<C10588n> f41092a;

    public /* synthetic */ Object get() {
        return m50138a();
    }

    public C12739b(Provider<C10588n> provider) {
        this.f41092a = provider;
    }

    /* renamed from: a */
    public C8457a m50138a() {
        return C12739b.m50136a(this.f41092a);
    }

    /* renamed from: a */
    public static C8457a m50136a(Provider<C10588n> provider) {
        return new C8457a((C10588n) provider.get());
    }

    /* renamed from: b */
    public static C12739b m50137b(Provider<C10588n> provider) {
        return new C12739b(provider);
    }
}
