package com.tinder.app.dagger.module;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.managers.bj;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.d */
public final class C12484d implements Factory<LoginObserver> {
    /* renamed from: a */
    private final C8244a f40260a;
    /* renamed from: b */
    private final Provider<bj> f40261b;

    public /* synthetic */ Object get() {
        return m49110a();
    }

    public C12484d(C8244a c8244a, Provider<bj> provider) {
        this.f40260a = c8244a;
        this.f40261b = provider;
    }

    /* renamed from: a */
    public LoginObserver m49110a() {
        return C12484d.m49108a(this.f40260a, this.f40261b);
    }

    /* renamed from: a */
    public static LoginObserver m49108a(C8244a c8244a, Provider<bj> provider) {
        return C12484d.m49107a(c8244a, (bj) provider.get());
    }

    /* renamed from: b */
    public static C12484d m49109b(C8244a c8244a, Provider<bj> provider) {
        return new C12484d(c8244a, provider);
    }

    /* renamed from: a */
    public static LoginObserver m49107a(C8244a c8244a, bj bjVar) {
        return (LoginObserver) C15521i.a(c8244a.m35145a(bjVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
