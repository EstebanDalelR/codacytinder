package com.tinder.auth;

import com.facebook.accountkit.ui.UIManager;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.w */
public final class C12611w implements Factory<UIManager> {
    /* renamed from: a */
    private final C8266a f40710a;
    /* renamed from: b */
    private final Provider<AddSmsValidateEvent> f40711b;

    public /* synthetic */ Object get() {
        return m49815a();
    }

    public C12611w(C8266a c8266a, Provider<AddSmsValidateEvent> provider) {
        this.f40710a = c8266a;
        this.f40711b = provider;
    }

    /* renamed from: a */
    public UIManager m49815a() {
        return C12611w.m49813a(this.f40710a, this.f40711b);
    }

    /* renamed from: a */
    public static UIManager m49813a(C8266a c8266a, Provider<AddSmsValidateEvent> provider) {
        return C12611w.m49812a(c8266a, (AddSmsValidateEvent) provider.get());
    }

    /* renamed from: b */
    public static C12611w m49814b(C8266a c8266a, Provider<AddSmsValidateEvent> provider) {
        return new C12611w(c8266a, provider);
    }

    /* renamed from: a */
    public static UIManager m49812a(C8266a c8266a, AddSmsValidateEvent addSmsValidateEvent) {
        return (UIManager) C15521i.a(c8266a.m35290a(addSmsValidateEvent), "Cannot return null from a non-@Nullable @Provides method");
    }
}
