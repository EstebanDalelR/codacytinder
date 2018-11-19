package com.tinder.smsauth.sdk.di;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.smsauth.sdk.di.o */
public final class C18132o implements Factory<PhoneNumberUtil> {
    /* renamed from: a */
    private final C14996k f56264a;

    public /* synthetic */ Object get() {
        return m65791a();
    }

    public C18132o(C14996k c14996k) {
        this.f56264a = c14996k;
    }

    /* renamed from: a */
    public PhoneNumberUtil m65791a() {
        return C18132o.m65788a(this.f56264a);
    }

    /* renamed from: a */
    public static PhoneNumberUtil m65788a(C14996k c14996k) {
        return C18132o.m65790c(c14996k);
    }

    /* renamed from: b */
    public static C18132o m65789b(C14996k c14996k) {
        return new C18132o(c14996k);
    }

    /* renamed from: c */
    public static PhoneNumberUtil m65790c(C14996k c14996k) {
        return (PhoneNumberUtil) C15521i.m58001a(c14996k.m56600a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
