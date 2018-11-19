package com.tinder.app.dagger.module;

import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.verification.usecase.C15392c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aj implements Factory<C15392c> {
    /* renamed from: a */
    private final ad f40186a;
    /* renamed from: b */
    private final Provider<AuthLedgerRepository> f40187b;

    public /* synthetic */ Object get() {
        return m48992a();
    }

    /* renamed from: a */
    public C15392c m48992a() {
        return m48991a(this.f40186a, this.f40187b);
    }

    /* renamed from: a */
    public static C15392c m48991a(ad adVar, Provider<AuthLedgerRepository> provider) {
        return m48990a(adVar, (AuthLedgerRepository) provider.get());
    }

    /* renamed from: a */
    public static C15392c m48990a(ad adVar, AuthLedgerRepository authLedgerRepository) {
        return (C15392c) C15521i.a(adVar.m35157b(authLedgerRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
