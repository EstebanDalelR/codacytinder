package com.tinder.app.dagger.module;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.managers.C2652a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.c */
public final class C12483c implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40258a;
    /* renamed from: b */
    private final Provider<C2652a> f40259b;

    public /* synthetic */ Object get() {
        return m49106a();
    }

    public C12483c(C8244a c8244a, Provider<C2652a> provider) {
        this.f40258a = c8244a;
        this.f40259b = provider;
    }

    /* renamed from: a */
    public LoginObserver m49106a() {
        return C12483c.m49104a(this.f40258a, this.f40259b);
    }

    /* renamed from: a */
    public static LoginObserver m49104a(C8244a c8244a, Provider<C2652a> provider) {
        return C12483c.m49103a(c8244a, (C2652a) provider.get());
    }

    /* renamed from: b */
    public static C12483c m49105b(C8244a c8244a, Provider<C2652a> provider) {
        return new C12483c(c8244a, provider);
    }

    /* renamed from: a */
    public static LoginObserver m49103a(C8244a c8244a, C2652a c2652a) {
        return (LoginObserver) C15521i.a(c8244a.m35144a(c2652a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
