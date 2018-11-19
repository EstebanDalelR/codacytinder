package com.tinder.auth;

import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;
import com.facebook.accountkit.ui.UIManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.v */
public final class C12610v implements Factory<AccountKitConfiguration> {
    /* renamed from: a */
    private final C8266a f40706a;
    /* renamed from: b */
    private final Provider<UIManager> f40707b;
    /* renamed from: c */
    private final Provider<LoginType> f40708c;
    /* renamed from: d */
    private final Provider<ResponseType> f40709d;

    public /* synthetic */ Object get() {
        return m49811a();
    }

    public C12610v(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        this.f40706a = c8266a;
        this.f40707b = provider;
        this.f40708c = provider2;
        this.f40709d = provider3;
    }

    /* renamed from: a */
    public AccountKitConfiguration m49811a() {
        return C12610v.m49809a(this.f40706a, this.f40707b, this.f40708c, this.f40709d);
    }

    /* renamed from: a */
    public static AccountKitConfiguration m49809a(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        return C12610v.m49808a(c8266a, (UIManager) provider.get(), (LoginType) provider2.get(), (ResponseType) provider3.get());
    }

    /* renamed from: b */
    public static C12610v m49810b(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        return new C12610v(c8266a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static AccountKitConfiguration m49808a(C8266a c8266a, UIManager uIManager, LoginType loginType, ResponseType responseType) {
        return (AccountKitConfiguration) C15521i.a(c8266a.m35304b(uIManager, loginType, responseType), "Cannot return null from a non-@Nullable @Provides method");
    }
}
