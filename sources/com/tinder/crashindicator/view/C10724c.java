package com.tinder.crashindicator.view;

import com.tinder.crashindicator.p203b.C8605a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.crashindicator.view.c */
public final class C10724c implements MembersInjector<AppCrashDialog> {
    /* renamed from: a */
    private final Provider<C8605a> f35101a;

    public /* synthetic */ void injectMembers(Object obj) {
        m43060a((AppCrashDialog) obj);
    }

    /* renamed from: a */
    public void m43060a(AppCrashDialog appCrashDialog) {
        C10724c.m43059a(appCrashDialog, (C8605a) this.f35101a.get());
    }

    /* renamed from: a */
    public static void m43059a(AppCrashDialog appCrashDialog, C8605a c8605a) {
        appCrashDialog.f41234a = c8605a;
    }
}
