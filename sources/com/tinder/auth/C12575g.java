package com.tinder.auth;

import android.content.SharedPreferences;
import com.tinder.auth.repository.AuthLedgerRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.g */
public final class C12575g implements Factory<AuthLedgerRepository> {
    /* renamed from: a */
    private final C8266a f40628a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f40629b;

    public /* synthetic */ Object get() {
        return m49709a();
    }

    public C12575g(C8266a c8266a, Provider<SharedPreferences> provider) {
        this.f40628a = c8266a;
        this.f40629b = provider;
    }

    /* renamed from: a */
    public AuthLedgerRepository m49709a() {
        return C12575g.m49707a(this.f40628a, this.f40629b);
    }

    /* renamed from: a */
    public static AuthLedgerRepository m49707a(C8266a c8266a, Provider<SharedPreferences> provider) {
        return C12575g.m49706a(c8266a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12575g m49708b(C8266a c8266a, Provider<SharedPreferences> provider) {
        return new C12575g(c8266a, provider);
    }

    /* renamed from: a */
    public static AuthLedgerRepository m49706a(C8266a c8266a, SharedPreferences sharedPreferences) {
        return (AuthLedgerRepository) C15521i.a(c8266a.m35306b(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
