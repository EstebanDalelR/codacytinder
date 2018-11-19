package com.tinder.auth;

import com.facebook.accountkit.ui.LoginType;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.auth.b */
public final class C12568b implements Factory<LoginType> {
    /* renamed from: a */
    private final C8266a f40611a;

    public /* synthetic */ Object get() {
        return m49685a();
    }

    public C12568b(C8266a c8266a) {
        this.f40611a = c8266a;
    }

    /* renamed from: a */
    public LoginType m49685a() {
        return C12568b.m49682a(this.f40611a);
    }

    /* renamed from: a */
    public static LoginType m49682a(C8266a c8266a) {
        return C12568b.m49684c(c8266a);
    }

    /* renamed from: b */
    public static C12568b m49683b(C8266a c8266a) {
        return new C12568b(c8266a);
    }

    /* renamed from: c */
    public static LoginType m49684c(C8266a c8266a) {
        return (LoginType) C15521i.a(c8266a.m35305b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
