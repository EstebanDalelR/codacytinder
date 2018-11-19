package com.tinder.smsauth.ui;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.d */
public final class C16779d implements MembersInjector<C18137c> {
    /* renamed from: a */
    private final Provider<SmsAuthViewModelFactory> f51796a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62301a((C18137c) obj);
    }

    /* renamed from: a */
    public void m62301a(C18137c c18137c) {
        C16779d.m62300a(c18137c, (SmsAuthViewModelFactory) this.f51796a.get());
    }

    /* renamed from: a */
    public static void m62300a(C18137c c18137c, SmsAuthViewModelFactory smsAuthViewModelFactory) {
        c18137c.f56275a = smsAuthViewModelFactory;
    }
}
