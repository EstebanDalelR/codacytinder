package com.tinder.smsauth.sdk.di;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.tinder.common.p194f.C8532a;
import com.tinder.smsauth.entity.CountryCodeRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.di.l */
public final class C18129l implements Factory<CountryCodeRepository> {
    /* renamed from: a */
    private final C14996k f56259a;
    /* renamed from: b */
    private final Provider<PhoneNumberUtil> f56260b;
    /* renamed from: c */
    private final Provider<C8532a> f56261c;

    public /* synthetic */ Object get() {
        return m65779a();
    }

    public C18129l(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2) {
        this.f56259a = c14996k;
        this.f56260b = provider;
        this.f56261c = provider2;
    }

    /* renamed from: a */
    public CountryCodeRepository m65779a() {
        return C18129l.m65777a(this.f56259a, this.f56260b, this.f56261c);
    }

    /* renamed from: a */
    public static CountryCodeRepository m65777a(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2) {
        return C18129l.m65776a(c14996k, (PhoneNumberUtil) provider.get(), (C8532a) provider2.get());
    }

    /* renamed from: b */
    public static C18129l m65778b(C14996k c14996k, Provider<PhoneNumberUtil> provider, Provider<C8532a> provider2) {
        return new C18129l(c14996k, provider, provider2);
    }

    /* renamed from: a */
    public static CountryCodeRepository m65776a(C14996k c14996k, PhoneNumberUtil phoneNumberUtil, C8532a c8532a) {
        return (CountryCodeRepository) C15521i.m58001a(c14996k.m56601a(phoneNumberUtil, c8532a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
