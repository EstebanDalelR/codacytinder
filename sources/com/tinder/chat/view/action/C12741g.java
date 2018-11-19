package com.tinder.chat.view.action;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.g */
public final class C12741g implements Factory<C8460f> {
    /* renamed from: a */
    private final Provider<C10588n> f41095a;

    public /* synthetic */ Object get() {
        return m50144a();
    }

    public C12741g(Provider<C10588n> provider) {
        this.f41095a = provider;
    }

    /* renamed from: a */
    public C8460f m50144a() {
        return C12741g.m50142a(this.f41095a);
    }

    /* renamed from: a */
    public static C8460f m50142a(Provider<C10588n> provider) {
        return new C8460f((C10588n) provider.get());
    }

    /* renamed from: b */
    public static C12741g m50143b(Provider<C10588n> provider) {
        return new C12741g(provider);
    }
}
