package com.tinder.auth;

import com.facebook.accountkit.ui.UIManager;
import com.tinder.auth.interactor.C10333h;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.q */
public final class C12601q implements Factory<UIManager> {
    /* renamed from: a */
    private final C8266a f40691a;
    /* renamed from: b */
    private final Provider<C10333h> f40692b;

    public /* synthetic */ Object get() {
        return m49783a();
    }

    public C12601q(C8266a c8266a, Provider<C10333h> provider) {
        this.f40691a = c8266a;
        this.f40692b = provider;
    }

    /* renamed from: a */
    public UIManager m49783a() {
        return C12601q.m49781a(this.f40691a, this.f40692b);
    }

    /* renamed from: a */
    public static UIManager m49781a(C8266a c8266a, Provider<C10333h> provider) {
        return C12601q.m49780a(c8266a, (C10333h) provider.get());
    }

    /* renamed from: b */
    public static C12601q m49782b(C8266a c8266a, Provider<C10333h> provider) {
        return new C12601q(c8266a, provider);
    }

    /* renamed from: a */
    public static UIManager m49780a(C8266a c8266a, C10333h c10333h) {
        return (UIManager) C15521i.a(c8266a.m35291a(c10333h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
