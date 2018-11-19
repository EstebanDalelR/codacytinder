package com.tinder.auth;

import android.content.SharedPreferences;
import com.tinder.domain.auth.AuthStatusRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.l */
public final class C12596l implements Factory<AuthStatusRepository> {
    /* renamed from: a */
    private final C8266a f40680a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f40681b;

    public /* synthetic */ Object get() {
        return m49764a();
    }

    public C12596l(C8266a c8266a, Provider<SharedPreferences> provider) {
        this.f40680a = c8266a;
        this.f40681b = provider;
    }

    /* renamed from: a */
    public AuthStatusRepository m49764a() {
        return C12596l.m49762a(this.f40680a, this.f40681b);
    }

    /* renamed from: a */
    public static AuthStatusRepository m49762a(C8266a c8266a, Provider<SharedPreferences> provider) {
        return C12596l.m49761a(c8266a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12596l m49763b(C8266a c8266a, Provider<SharedPreferences> provider) {
        return new C12596l(c8266a, provider);
    }

    /* renamed from: a */
    public static AuthStatusRepository m49761a(C8266a c8266a, SharedPreferences sharedPreferences) {
        return (AuthStatusRepository) C15521i.a(c8266a.m35301a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
