package com.tinder.auth;

import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.auth.c */
public final class C12571c implements Factory<ResponseType> {
    /* renamed from: a */
    private final C8266a f40615a;

    public /* synthetic */ Object get() {
        return m49695a();
    }

    public C12571c(C8266a c8266a) {
        this.f40615a = c8266a;
    }

    /* renamed from: a */
    public ResponseType m49695a() {
        return C12571c.m49692a(this.f40615a);
    }

    /* renamed from: a */
    public static ResponseType m49692a(C8266a c8266a) {
        return C12571c.m49694c(c8266a);
    }

    /* renamed from: b */
    public static C12571c m49693b(C8266a c8266a) {
        return new C12571c(c8266a);
    }

    /* renamed from: c */
    public static ResponseType m49694c(C8266a c8266a) {
        return (ResponseType) C15521i.a(c8266a.m35307c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
