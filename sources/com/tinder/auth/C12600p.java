package com.tinder.auth;

import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;
import com.facebook.accountkit.ui.UIManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.p */
public final class C12600p implements Factory<AccountKitConfiguration> {
    /* renamed from: a */
    private final C8266a f40687a;
    /* renamed from: b */
    private final Provider<UIManager> f40688b;
    /* renamed from: c */
    private final Provider<LoginType> f40689c;
    /* renamed from: d */
    private final Provider<ResponseType> f40690d;

    public /* synthetic */ Object get() {
        return m49779a();
    }

    public C12600p(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        this.f40687a = c8266a;
        this.f40688b = provider;
        this.f40689c = provider2;
        this.f40690d = provider3;
    }

    /* renamed from: a */
    public AccountKitConfiguration m49779a() {
        return C12600p.m49777a(this.f40687a, this.f40688b, this.f40689c, this.f40690d);
    }

    /* renamed from: a */
    public static AccountKitConfiguration m49777a(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        return C12600p.m49776a(c8266a, (UIManager) provider.get(), (LoginType) provider2.get(), (ResponseType) provider3.get());
    }

    /* renamed from: b */
    public static C12600p m49778b(C8266a c8266a, Provider<UIManager> provider, Provider<LoginType> provider2, Provider<ResponseType> provider3) {
        return new C12600p(c8266a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static AccountKitConfiguration m49776a(C8266a c8266a, UIManager uIManager, LoginType loginType, ResponseType responseType) {
        return (AccountKitConfiguration) C15521i.a(c8266a.m35289a(uIManager, loginType, responseType), "Cannot return null from a non-@Nullable @Provides method");
    }
}
