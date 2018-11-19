package com.tinder.auth;

import com.tinder.auth.repository.C10350m;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.auth.n */
public final class C12598n implements Factory<C10350m> {
    /* renamed from: a */
    private final C8266a f40685a;

    public /* synthetic */ Object get() {
        return m49771a();
    }

    public C12598n(C8266a c8266a) {
        this.f40685a = c8266a;
    }

    /* renamed from: a */
    public C10350m m49771a() {
        return C12598n.m49768a(this.f40685a);
    }

    /* renamed from: a */
    public static C10350m m49768a(C8266a c8266a) {
        return C12598n.m49770c(c8266a);
    }

    /* renamed from: b */
    public static C12598n m49769b(C8266a c8266a) {
        return new C12598n(c8266a);
    }

    /* renamed from: c */
    public static C10350m m49770c(C8266a c8266a) {
        return (C10350m) C15521i.a(c8266a.m35308d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
