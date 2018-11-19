package com.tinder.smsauth.sdk.di;

import com.tinder.common.logger.Logger;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.smsauth.sdk.di.m */
public final class C18130m implements Factory<Logger> {
    /* renamed from: a */
    private final C14996k f56262a;

    public /* synthetic */ Object get() {
        return m65783a();
    }

    public C18130m(C14996k c14996k) {
        this.f56262a = c14996k;
    }

    /* renamed from: a */
    public Logger m65783a() {
        return C18130m.m65780a(this.f56262a);
    }

    /* renamed from: a */
    public static Logger m65780a(C14996k c14996k) {
        return C18130m.m65782c(c14996k);
    }

    /* renamed from: b */
    public static C18130m m65781b(C14996k c14996k) {
        return new C18130m(c14996k);
    }

    /* renamed from: c */
    public static Logger m65782c(C14996k c14996k) {
        return (Logger) C15521i.m58001a(c14996k.m56605d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
