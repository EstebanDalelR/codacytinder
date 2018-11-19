package com.tinder.smsauth.sdk.di;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.tinder.common.logger.Logger;
import com.tinder.common.p194f.C8532a;
import com.tinder.smsauth.entity.PhoneNumberFormatValidator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.di.p */
public final class C18133p implements Factory<PhoneNumberFormatValidator> {
    /* renamed from: a */
    private final C14996k f56265a;
    /* renamed from: b */
    private final Provider<PhoneNumberUtil> f56266b;
    /* renamed from: c */
    private final Provider<C8532a> f56267c;
    /* renamed from: d */
    private final Provider<Logger> f56268d;

    public /* synthetic */ Object get() {
        return m65795a();
    }

    public C18133p(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2, Provider<Logger> provider3) {
        this.f56265a = c14996k;
        this.f56266b = provider;
        this.f56267c = provider2;
        this.f56268d = provider3;
    }

    /* renamed from: a */
    public PhoneNumberFormatValidator m65795a() {
        return C18133p.m65793a(this.f56265a, this.f56266b, this.f56267c, this.f56268d);
    }

    /* renamed from: a */
    public static PhoneNumberFormatValidator m65793a(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2, Provider<Logger> provider3) {
        return C18133p.m65792a(c14996k, (PhoneNumberUtil) provider.get(), (C8532a) provider2.get(), (Logger) provider3.get());
    }

    /* renamed from: b */
    public static C18133p m65794b(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2, Provider<Logger> provider3) {
        return new C18133p(c14996k, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static PhoneNumberFormatValidator m65792a(C14996k c14996k, PhoneNumberUtil phoneNumberUtil, C8532a c8532a, Logger logger) {
        return (PhoneNumberFormatValidator) C15521i.m58001a(c14996k.m56602a(phoneNumberUtil, c8532a, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
