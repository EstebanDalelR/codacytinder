package com.tinder.smsauth.core;

import com.tinder.smsauth.entity.OneTimePasswordFormatValidator;
import com.tinder.smsauth.entity.PhoneNumberFormatValidator;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.core.d */
public final class C18085d implements Factory<C14965c> {
    /* renamed from: a */
    private final Provider<PhoneNumberFormatValidator> f56174a;
    /* renamed from: b */
    private final Provider<OneTimePasswordFormatValidator> f56175b;

    public /* synthetic */ Object get() {
        return m65667a();
    }

    public C18085d(Provider<PhoneNumberFormatValidator> provider, Provider<OneTimePasswordFormatValidator> provider2) {
        this.f56174a = provider;
        this.f56175b = provider2;
    }

    /* renamed from: a */
    public C14965c m65667a() {
        return C18085d.m65665a(this.f56174a, this.f56175b);
    }

    /* renamed from: a */
    public static C14965c m65665a(Provider<PhoneNumberFormatValidator> provider, Provider<OneTimePasswordFormatValidator> provider2) {
        return new C14965c((PhoneNumberFormatValidator) provider.get(), (OneTimePasswordFormatValidator) provider2.get());
    }

    /* renamed from: b */
    public static C18085d m65666b(Provider<PhoneNumberFormatValidator> provider, Provider<OneTimePasswordFormatValidator> provider2) {
        return new C18085d(provider, provider2);
    }
}
