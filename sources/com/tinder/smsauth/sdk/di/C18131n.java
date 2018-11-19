package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.entity.OneTimePasswordFormatValidator;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.smsauth.sdk.di.n */
public final class C18131n implements Factory<OneTimePasswordFormatValidator> {
    /* renamed from: a */
    private final C14996k f56263a;

    public /* synthetic */ Object get() {
        return m65787a();
    }

    public C18131n(C14996k c14996k) {
        this.f56263a = c14996k;
    }

    /* renamed from: a */
    public OneTimePasswordFormatValidator m65787a() {
        return C18131n.m65784a(this.f56263a);
    }

    /* renamed from: a */
    public static OneTimePasswordFormatValidator m65784a(C14996k c14996k) {
        return C18131n.m65786c(c14996k);
    }

    /* renamed from: b */
    public static C18131n m65785b(C14996k c14996k) {
        return new C18131n(c14996k);
    }

    /* renamed from: c */
    public static OneTimePasswordFormatValidator m65786c(C14996k c14996k) {
        return (OneTimePasswordFormatValidator) C15521i.m58001a(c14996k.m56603b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
