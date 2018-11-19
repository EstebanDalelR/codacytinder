package com.tinder.auth.interactor;

import com.tinder.auth.observer.LoginObserver;
import com.tinder.auth.p167b.C8272a;
import com.tinder.auth.p168c.C8273d;
import com.tinder.data.profile.C10935e;
import com.tinder.model.auth.network.AuthRequestFactory;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.r */
public final class C12591r implements Factory<C8283q> {
    /* renamed from: a */
    private final Provider<AuthRequestFactory> f40667a;
    /* renamed from: b */
    private final Provider<C8279j> f40668b;
    /* renamed from: c */
    private final Provider<C10935e> f40669c;
    /* renamed from: d */
    private final Provider<C8272a> f40670d;
    /* renamed from: e */
    private final Provider<C8273d> f40671e;
    /* renamed from: f */
    private final Provider<Set<LoginObserver>> f40672f;

    public /* synthetic */ Object get() {
        return m49748a();
    }

    public C12591r(Provider<AuthRequestFactory> provider, Provider<C8279j> provider2, Provider<C10935e> provider3, Provider<C8272a> provider4, Provider<C8273d> provider5, Provider<Set<LoginObserver>> provider6) {
        this.f40667a = provider;
        this.f40668b = provider2;
        this.f40669c = provider3;
        this.f40670d = provider4;
        this.f40671e = provider5;
        this.f40672f = provider6;
    }

    /* renamed from: a */
    public C8283q m49748a() {
        return C12591r.m49746a(this.f40667a, this.f40668b, this.f40669c, this.f40670d, this.f40671e, this.f40672f);
    }

    /* renamed from: a */
    public static C8283q m49746a(Provider<AuthRequestFactory> provider, Provider<C8279j> provider2, Provider<C10935e> provider3, Provider<C8272a> provider4, Provider<C8273d> provider5, Provider<Set<LoginObserver>> provider6) {
        return new C8283q((AuthRequestFactory) provider.get(), (C8279j) provider2.get(), (C10935e) provider3.get(), (C8272a) provider4.get(), (C8273d) provider5.get(), (Set) provider6.get());
    }

    /* renamed from: b */
    public static C12591r m49747b(Provider<AuthRequestFactory> provider, Provider<C8279j> provider2, Provider<C10935e> provider3, Provider<C8272a> provider4, Provider<C8273d> provider5, Provider<Set<LoginObserver>> provider6) {
        return new C12591r(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
