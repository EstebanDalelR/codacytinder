package com.tinder.smsauth.ui;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.b */
public final class C16776b implements MembersInjector<C18136a> {
    /* renamed from: a */
    private final Provider<SmsAuthViewModelFactory> f51793a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62298a((C18136a) obj);
    }

    /* renamed from: a */
    public void m62298a(C18136a c18136a) {
        C16776b.m62297a(c18136a, (SmsAuthViewModelFactory) this.f51793a.get());
    }

    /* renamed from: a */
    public static void m62297a(C18136a c18136a, SmsAuthViewModelFactory smsAuthViewModelFactory) {
        c18136a.f56272a = smsAuthViewModelFactory;
    }
}
