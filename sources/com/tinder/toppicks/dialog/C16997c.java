package com.tinder.toppicks.dialog;

import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.presenter.C17090j;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.dialog.c */
public final class C16997c implements MembersInjector<TopPicksPaywallView> {
    /* renamed from: a */
    private final Provider<C17090j> f52415a;
    /* renamed from: b */
    private final Provider<SettingsLauncher> f52416b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62775a((TopPicksPaywallView) obj);
    }

    /* renamed from: a */
    public void m62775a(TopPicksPaywallView topPicksPaywallView) {
        C16997c.m62774a(topPicksPaywallView, (C17090j) this.f52415a.get());
        C16997c.m62773a(topPicksPaywallView, (SettingsLauncher) this.f52416b.get());
    }

    /* renamed from: a */
    public static void m62774a(TopPicksPaywallView topPicksPaywallView, C17090j c17090j) {
        topPicksPaywallView.f52403b = c17090j;
    }

    /* renamed from: a */
    public static void m62773a(TopPicksPaywallView topPicksPaywallView, SettingsLauncher settingsLauncher) {
        topPicksPaywallView.f52404c = settingsLauncher;
    }
}
