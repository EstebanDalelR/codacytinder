package com.tinder.app.dagger.module;

import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.verification.usecase.C15390a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ag implements Factory<C15390a> {
    /* renamed from: a */
    private final ad f40175a;
    /* renamed from: b */
    private final Provider<AuthLedgerRepository> f40176b;

    public /* synthetic */ Object get() {
        return m48982a();
    }

    public ag(ad adVar, Provider<AuthLedgerRepository> provider) {
        this.f40175a = adVar;
        this.f40176b = provider;
    }

    /* renamed from: a */
    public C15390a m48982a() {
        return m48980a(this.f40175a, this.f40176b);
    }

    /* renamed from: a */
    public static C15390a m48980a(ad adVar, Provider<AuthLedgerRepository> provider) {
        return m48979a(adVar, (AuthLedgerRepository) provider.get());
    }

    /* renamed from: b */
    public static ag m48981b(ad adVar, Provider<AuthLedgerRepository> provider) {
        return new ag(adVar, provider);
    }

    /* renamed from: a */
    public static C15390a m48979a(ad adVar, AuthLedgerRepository authLedgerRepository) {
        return (C15390a) C15521i.a(adVar.m35154a(authLedgerRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
