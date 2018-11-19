package com.tinder.auth;

import com.tinder.auth.repository.C10351n;
import com.tinder.domain.auth.UniqueIdFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.s */
public final class C12607s implements Factory<UniqueIdFactory> {
    /* renamed from: a */
    private final C8266a f40699a;
    /* renamed from: b */
    private final Provider<C10351n> f40700b;

    public /* synthetic */ Object get() {
        return m49801a();
    }

    public C12607s(C8266a c8266a, Provider<C10351n> provider) {
        this.f40699a = c8266a;
        this.f40700b = provider;
    }

    /* renamed from: a */
    public UniqueIdFactory m49801a() {
        return C12607s.m49799a(this.f40699a, this.f40700b);
    }

    /* renamed from: a */
    public static UniqueIdFactory m49799a(C8266a c8266a, Provider<C10351n> provider) {
        return C12607s.m49798a(c8266a, (C10351n) provider.get());
    }

    /* renamed from: b */
    public static C12607s m49800b(C8266a c8266a, Provider<C10351n> provider) {
        return new C12607s(c8266a, provider);
    }

    /* renamed from: a */
    public static UniqueIdFactory m49798a(C8266a c8266a, C10351n c10351n) {
        return (UniqueIdFactory) C15521i.a(c8266a.m35302a(c10351n), "Cannot return null from a non-@Nullable @Provides method");
    }
}
