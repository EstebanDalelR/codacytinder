package com.tinder.auth;

import com.tinder.auth.p168c.C8274f;
import com.tinder.auth.repository.AuthLedgerRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.r */
public final class C12602r implements Factory<C8274f> {
    /* renamed from: a */
    private final C8266a f40693a;
    /* renamed from: b */
    private final Provider<AuthLedgerRepository> f40694b;

    public /* synthetic */ Object get() {
        return m49787a();
    }

    public C12602r(C8266a c8266a, Provider<AuthLedgerRepository> provider) {
        this.f40693a = c8266a;
        this.f40694b = provider;
    }

    /* renamed from: a */
    public C8274f m49787a() {
        return C12602r.m49785a(this.f40693a, this.f40694b);
    }

    /* renamed from: a */
    public static C8274f m49785a(C8266a c8266a, Provider<AuthLedgerRepository> provider) {
        return C12602r.m49784a(c8266a, (AuthLedgerRepository) provider.get());
    }

    /* renamed from: b */
    public static C12602r m49786b(C8266a c8266a, Provider<AuthLedgerRepository> provider) {
        return new C12602r(c8266a, provider);
    }

    /* renamed from: a */
    public static C8274f m49784a(C8266a c8266a, AuthLedgerRepository authLedgerRepository) {
        return (C8274f) C15521i.a(c8266a.m35295a(authLedgerRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
