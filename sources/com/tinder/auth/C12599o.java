package com.tinder.auth;

import com.facebook.CallbackManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.auth.o */
public final class C12599o implements Factory<CallbackManager> {
    /* renamed from: a */
    private final C8266a f40686a;

    public /* synthetic */ Object get() {
        return m49775a();
    }

    public C12599o(C8266a c8266a) {
        this.f40686a = c8266a;
    }

    /* renamed from: a */
    public CallbackManager m49775a() {
        return C12599o.m49772a(this.f40686a);
    }

    /* renamed from: a */
    public static CallbackManager m49772a(C8266a c8266a) {
        return C12599o.m49774c(c8266a);
    }

    /* renamed from: b */
    public static C12599o m49773b(C8266a c8266a) {
        return new C12599o(c8266a);
    }

    /* renamed from: c */
    public static CallbackManager m49774c(C8266a c8266a) {
        return (CallbackManager) C15521i.a(c8266a.m35288a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
