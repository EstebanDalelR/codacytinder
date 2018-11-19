package com.tinder.smsauth.ui;

import com.tinder.common.logger.Logger;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.f */
public final class C16782f implements MembersInjector<C18138e> {
    /* renamed from: a */
    private final Provider<SmsAuthViewModelFactory> f51799a;
    /* renamed from: b */
    private final Provider<Logger> f51800b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62305a((C18138e) obj);
    }

    /* renamed from: a */
    public void m62305a(C18138e c18138e) {
        C16782f.m62304a(c18138e, (SmsAuthViewModelFactory) this.f51799a.get());
        C16782f.m62303a(c18138e, (Logger) this.f51800b.get());
    }

    /* renamed from: a */
    public static void m62304a(C18138e c18138e, SmsAuthViewModelFactory smsAuthViewModelFactory) {
        c18138e.f56278a = smsAuthViewModelFactory;
    }

    /* renamed from: a */
    public static void m62303a(C18138e c18138e, Logger logger) {
        c18138e.f56279b = logger;
    }
}
