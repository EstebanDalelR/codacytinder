package com.tinder.auth.interactor;

import com.tinder.auth.observer.AuthObserver;
import com.tinder.auth.repository.AuthRepository;
import com.tinder.auth.repository.C10353p;
import com.tinder.common.repository.C10698c;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.k */
public final class C12584k implements Factory<C8279j> {
    /* renamed from: a */
    private final Provider<AuthRepository> f40652a;
    /* renamed from: b */
    private final Provider<C10698c> f40653b;
    /* renamed from: c */
    private final Provider<bk> f40654c;
    /* renamed from: d */
    private final Provider<C10353p> f40655d;
    /* renamed from: e */
    private final Provider<AuthObserver> f40656e;

    public /* synthetic */ Object get() {
        return m49734a();
    }

    public C12584k(Provider<AuthRepository> provider, Provider<C10698c> provider2, Provider<bk> provider3, Provider<C10353p> provider4, Provider<AuthObserver> provider5) {
        this.f40652a = provider;
        this.f40653b = provider2;
        this.f40654c = provider3;
        this.f40655d = provider4;
        this.f40656e = provider5;
    }

    /* renamed from: a */
    public C8279j m49734a() {
        return C12584k.m49732a(this.f40652a, this.f40653b, this.f40654c, this.f40655d, this.f40656e);
    }

    /* renamed from: a */
    public static C8279j m49732a(Provider<AuthRepository> provider, Provider<C10698c> provider2, Provider<bk> provider3, Provider<C10353p> provider4, Provider<AuthObserver> provider5) {
        return new C8279j((AuthRepository) provider.get(), (C10698c) provider2.get(), (bk) provider3.get(), (C10353p) provider4.get(), (AuthObserver) provider5.get());
    }

    /* renamed from: b */
    public static C12584k m49733b(Provider<AuthRepository> provider, Provider<C10698c> provider2, Provider<bk> provider3, Provider<C10353p> provider4, Provider<AuthObserver> provider5) {
        return new C12584k(provider, provider2, provider3, provider4, provider5);
    }
}
