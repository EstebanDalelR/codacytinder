package com.tinder.chat.view.action;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.m */
public final class C12742m implements Factory<C10587l> {
    /* renamed from: a */
    private final Provider<C10588n> f41096a;

    public /* synthetic */ Object get() {
        return m50147a();
    }

    public C12742m(Provider<C10588n> provider) {
        this.f41096a = provider;
    }

    /* renamed from: a */
    public C10587l m50147a() {
        return C12742m.m50145a(this.f41096a);
    }

    /* renamed from: a */
    public static C10587l m50145a(Provider<C10588n> provider) {
        return new C10587l((C10588n) provider.get());
    }

    /* renamed from: b */
    public static C12742m m50146b(Provider<C10588n> provider) {
        return new C12742m(provider);
    }
}
