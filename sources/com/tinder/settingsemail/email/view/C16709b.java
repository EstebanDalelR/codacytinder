package com.tinder.settingsemail.email.view;

import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter;
import com.tinder.settingsemail.email.p410c.C14927a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settingsemail.email.view.b */
public final class C16709b implements MembersInjector<C16708a> {
    /* renamed from: a */
    private final Provider<C14927a> f51692a;
    /* renamed from: b */
    private final Provider<EmailSettingsAdapter> f51693b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62217a((C16708a) obj);
    }

    /* renamed from: a */
    public void m62217a(C16708a c16708a) {
        C16709b.m62216a(c16708a, (C14927a) this.f51692a.get());
        C16709b.m62215a(c16708a, (EmailSettingsAdapter) this.f51693b.get());
    }

    /* renamed from: a */
    public static void m62216a(C16708a c16708a, C14927a c14927a) {
        c16708a.f51688b = c14927a;
    }

    /* renamed from: a */
    public static void m62215a(C16708a c16708a, EmailSettingsAdapter emailSettingsAdapter) {
        c16708a.f51689c = emailSettingsAdapter;
    }
}
