package com.tinder.typingindicator.api;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.typingindicator.p440f.C18250c;
import com.tinder.typingindicator.p440f.C18256j;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.api.c */
public final class C18246c implements Factory<C15314a> {
    /* renamed from: a */
    private final Provider<KeepAliveScarletApi> f56561a;
    /* renamed from: b */
    private final Provider<C18250c> f56562b;
    /* renamed from: c */
    private final Provider<C18256j> f56563c;

    public /* synthetic */ Object get() {
        return m66128a();
    }

    public C18246c(Provider<KeepAliveScarletApi> provider, Provider<C18250c> provider2, Provider<C18256j> provider3) {
        this.f56561a = provider;
        this.f56562b = provider2;
        this.f56563c = provider3;
    }

    /* renamed from: a */
    public C15314a m66128a() {
        return C18246c.m66126a(this.f56561a, this.f56562b, this.f56563c);
    }

    /* renamed from: a */
    public static C15314a m66126a(Provider<KeepAliveScarletApi> provider, Provider<C18250c> provider2, Provider<C18256j> provider3) {
        return new C15314a((KeepAliveScarletApi) provider.get(), (C18250c) provider2.get(), (C18256j) provider3.get());
    }

    /* renamed from: b */
    public static C18246c m66127b(Provider<KeepAliveScarletApi> provider, Provider<C18250c> provider2, Provider<C18256j> provider3) {
        return new C18246c(provider, provider2, provider3);
    }
}
