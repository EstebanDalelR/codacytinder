package com.tinder.smsauth.ui;

import com.tinder.common.logger.Logger;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.j */
public final class C16786j implements MembersInjector<C18141i> {
    /* renamed from: a */
    private final Provider<Logger> f51804a;
    /* renamed from: b */
    private final Provider<SmsAuthViewModelFactory> f51805b;
    /* renamed from: c */
    private final Provider<PhoneNumberCollector> f51806c;

    public /* synthetic */ void injectMembers(Object obj) {
        m62311a((C18141i) obj);
    }

    /* renamed from: a */
    public void m62311a(C18141i c18141i) {
        C16786j.m62308a(c18141i, (Logger) this.f51804a.get());
        C16786j.m62310a(c18141i, (SmsAuthViewModelFactory) this.f51805b.get());
        C16786j.m62309a(c18141i, (PhoneNumberCollector) this.f51806c.get());
    }

    /* renamed from: a */
    public static void m62308a(C18141i c18141i, Logger logger) {
        c18141i.f56286a = logger;
    }

    /* renamed from: a */
    public static void m62310a(C18141i c18141i, SmsAuthViewModelFactory smsAuthViewModelFactory) {
        c18141i.f56287b = smsAuthViewModelFactory;
    }

    /* renamed from: a */
    public static void m62309a(C18141i c18141i, PhoneNumberCollector phoneNumberCollector) {
        c18141i.f56288c = phoneNumberCollector;
    }
}
