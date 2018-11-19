package com.tinder.chat.view.action;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.d */
public final class C12740d implements Factory<C8458c> {
    /* renamed from: a */
    private final Provider<C10588n> f41093a;
    /* renamed from: b */
    private final Provider<FullscreenImageDisplayAction> f41094b;

    public /* synthetic */ Object get() {
        return m50141a();
    }

    public C12740d(Provider<C10588n> provider, Provider<FullscreenImageDisplayAction> provider2) {
        this.f41093a = provider;
        this.f41094b = provider2;
    }

    /* renamed from: a */
    public C8458c m50141a() {
        return C12740d.m50139a(this.f41093a, this.f41094b);
    }

    /* renamed from: a */
    public static C8458c m50139a(Provider<C10588n> provider, Provider<FullscreenImageDisplayAction> provider2) {
        return new C8458c((C10588n) provider.get(), (FullscreenImageDisplayAction) provider2.get());
    }

    /* renamed from: b */
    public static C12740d m50140b(Provider<C10588n> provider, Provider<FullscreenImageDisplayAction> provider2) {
        return new C12740d(provider, provider2);
    }
}
