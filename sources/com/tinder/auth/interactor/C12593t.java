package com.tinder.auth.interactor;

import com.tinder.auth.repository.AuthService;
import com.tinder.model.network.ErrorResponseConverter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.t */
public final class C12593t implements Factory<C10336s> {
    /* renamed from: a */
    private final Provider<AuthService> f40674a;
    /* renamed from: b */
    private final Provider<ErrorResponseConverter> f40675b;

    public /* synthetic */ Object get() {
        return m49752a();
    }

    public C12593t(Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2) {
        this.f40674a = provider;
        this.f40675b = provider2;
    }

    /* renamed from: a */
    public C10336s m49752a() {
        return C12593t.m49750a(this.f40674a, this.f40675b);
    }

    /* renamed from: a */
    public static C10336s m49750a(Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2) {
        return new C10336s((AuthService) provider.get(), (ErrorResponseConverter) provider2.get());
    }

    /* renamed from: b */
    public static C12593t m49751b(Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2) {
        return new C12593t(provider, provider2);
    }
}
