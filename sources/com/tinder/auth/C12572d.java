package com.tinder.auth;

import com.tinder.auth.accountkit.C10326a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.auth.d */
public final class C12572d implements Factory<C10326a> {
    /* renamed from: a */
    private final C8266a f40616a;

    public /* synthetic */ Object get() {
        return m49699a();
    }

    public C12572d(C8266a c8266a) {
        this.f40616a = c8266a;
    }

    /* renamed from: a */
    public C10326a m49699a() {
        return C12572d.m49696a(this.f40616a);
    }

    /* renamed from: a */
    public static C10326a m49696a(C8266a c8266a) {
        return C12572d.m49698c(c8266a);
    }

    /* renamed from: b */
    public static C12572d m49697b(C8266a c8266a) {
        return new C12572d(c8266a);
    }

    /* renamed from: c */
    public static C10326a m49698c(C8266a c8266a) {
        return (C10326a) C15521i.a(c8266a.m35309e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
