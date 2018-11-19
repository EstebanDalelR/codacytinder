package com.tinder.app.dagger.module;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.interactors.C9719k;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e */
public final class C12494e implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40284a;
    /* renamed from: b */
    private final Provider<C9719k> f40285b;

    public /* synthetic */ Object get() {
        return m49149a();
    }

    public C12494e(C8244a c8244a, Provider<C9719k> provider) {
        this.f40284a = c8244a;
        this.f40285b = provider;
    }

    /* renamed from: a */
    public LoginObserver m49149a() {
        return C12494e.m49147a(this.f40284a, this.f40285b);
    }

    /* renamed from: a */
    public static LoginObserver m49147a(C8244a c8244a, Provider<C9719k> provider) {
        return C12494e.m49146a(c8244a, (C9719k) provider.get());
    }

    /* renamed from: b */
    public static C12494e m49148b(C8244a c8244a, Provider<C9719k> provider) {
        return new C12494e(c8244a, provider);
    }

    /* renamed from: a */
    public static LoginObserver m49146a(C8244a c8244a, C9719k c9719k) {
        return (LoginObserver) C15521i.a(c8244a.m35143a(c9719k), "Cannot return null from a non-@Nullable @Provides method");
    }
}
