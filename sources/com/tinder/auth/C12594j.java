package com.tinder.auth;

import android.content.Context;
import com.tinder.auth.repository.AuthSessionDataStore;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.j */
public final class C12594j implements Factory<AuthSessionDataStore> {
    /* renamed from: a */
    private final C8266a f40676a;
    /* renamed from: b */
    private final Provider<Context> f40677b;

    public /* synthetic */ Object get() {
        return m49756a();
    }

    public C12594j(C8266a c8266a, Provider<Context> provider) {
        this.f40676a = c8266a;
        this.f40677b = provider;
    }

    /* renamed from: a */
    public AuthSessionDataStore m49756a() {
        return C12594j.m49754a(this.f40676a, this.f40677b);
    }

    /* renamed from: a */
    public static AuthSessionDataStore m49754a(C8266a c8266a, Provider<Context> provider) {
        return C12594j.m49753a(c8266a, (Context) provider.get());
    }

    /* renamed from: b */
    public static C12594j m49755b(C8266a c8266a, Provider<Context> provider) {
        return new C12594j(c8266a, provider);
    }

    /* renamed from: a */
    public static AuthSessionDataStore m49753a(C8266a c8266a, Context context) {
        return (AuthSessionDataStore) C15521i.a(c8266a.m35299a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
