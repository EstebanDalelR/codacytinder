package com.tinder.auth;

import com.tinder.auth.repository.AuthSessionDataStore;
import com.tinder.auth.repository.AuthSessionRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.k */
public final class C12595k implements Factory<AuthSessionRepository> {
    /* renamed from: a */
    private final C8266a f40678a;
    /* renamed from: b */
    private final Provider<AuthSessionDataStore> f40679b;

    public /* synthetic */ Object get() {
        return m49760a();
    }

    public C12595k(C8266a c8266a, Provider<AuthSessionDataStore> provider) {
        this.f40678a = c8266a;
        this.f40679b = provider;
    }

    /* renamed from: a */
    public AuthSessionRepository m49760a() {
        return C12595k.m49758a(this.f40678a, this.f40679b);
    }

    /* renamed from: a */
    public static AuthSessionRepository m49758a(C8266a c8266a, Provider<AuthSessionDataStore> provider) {
        return C12595k.m49757a(c8266a, (AuthSessionDataStore) provider.get());
    }

    /* renamed from: b */
    public static C12595k m49759b(C8266a c8266a, Provider<AuthSessionDataStore> provider) {
        return new C12595k(c8266a, provider);
    }

    /* renamed from: a */
    public static AuthSessionRepository m49757a(C8266a c8266a, AuthSessionDataStore authSessionDataStore) {
        return (AuthSessionRepository) C15521i.a(c8266a.m35300a(authSessionDataStore), "Cannot return null from a non-@Nullable @Provides method");
    }
}
