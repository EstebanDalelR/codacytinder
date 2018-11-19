package com.tinder.auth;

import com.tinder.auth.observer.AuthObserver;
import com.tinder.auth.p168c.C8274f;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.h */
public final class C12576h implements Factory<AuthObserver> {
    /* renamed from: a */
    private final C8266a f40630a;
    /* renamed from: b */
    private final Provider<C8274f> f40631b;

    public /* synthetic */ Object get() {
        return m49713a();
    }

    public C12576h(C8266a c8266a, Provider<C8274f> provider) {
        this.f40630a = c8266a;
        this.f40631b = provider;
    }

    /* renamed from: a */
    public AuthObserver m49713a() {
        return C12576h.m49711a(this.f40630a, this.f40631b);
    }

    /* renamed from: a */
    public static AuthObserver m49711a(C8266a c8266a, Provider<C8274f> provider) {
        return C12576h.m49710a(c8266a, (C8274f) provider.get());
    }

    /* renamed from: b */
    public static C12576h m49712b(C8266a c8266a, Provider<C8274f> provider) {
        return new C12576h(c8266a, provider);
    }

    /* renamed from: a */
    public static AuthObserver m49710a(C8266a c8266a, C8274f c8274f) {
        return (AuthObserver) C15521i.a(c8266a.m35296a(c8274f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
