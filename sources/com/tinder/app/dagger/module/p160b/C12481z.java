package com.tinder.app.dagger.module.p160b;

import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.fireboarding.domain.C11806k;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.z */
public final class C12481z implements Factory<C11806k> {
    /* renamed from: a */
    private final C8245a f40253a;
    /* renamed from: b */
    private final Provider<AuthLedgerRepository> f40254b;

    public /* synthetic */ Object get() {
        return m49098a();
    }

    public C12481z(C8245a c8245a, Provider<AuthLedgerRepository> provider) {
        this.f40253a = c8245a;
        this.f40254b = provider;
    }

    /* renamed from: a */
    public C11806k m49098a() {
        return C12481z.m49096a(this.f40253a, this.f40254b);
    }

    /* renamed from: a */
    public static C11806k m49096a(C8245a c8245a, Provider<AuthLedgerRepository> provider) {
        return C12481z.m49095a(c8245a, (AuthLedgerRepository) provider.get());
    }

    /* renamed from: b */
    public static C12481z m49097b(C8245a c8245a, Provider<AuthLedgerRepository> provider) {
        return new C12481z(c8245a, provider);
    }

    /* renamed from: a */
    public static C11806k m49095a(C8245a c8245a, AuthLedgerRepository authLedgerRepository) {
        return (C11806k) C15521i.a(c8245a.m35167a(authLedgerRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
