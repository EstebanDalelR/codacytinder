package com.tinder.toppicks.emptyview;

import com.tinder.toppicks.SettingsLauncher;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.emptyview.d */
public final class C17022d implements MembersInjector<TopPicksEmptyView> {
    /* renamed from: a */
    private final Provider<C15257a> f52452a;
    /* renamed from: b */
    private final Provider<SettingsLauncher> f52453b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62805a((TopPicksEmptyView) obj);
    }

    /* renamed from: a */
    public void m62805a(TopPicksEmptyView topPicksEmptyView) {
        C17022d.m62804a(topPicksEmptyView, (C15257a) this.f52452a.get());
        C17022d.m62803a(topPicksEmptyView, (SettingsLauncher) this.f52453b.get());
    }

    /* renamed from: a */
    public static void m62804a(TopPicksEmptyView topPicksEmptyView, C15257a c15257a) {
        topPicksEmptyView.f52439a = c15257a;
    }

    /* renamed from: a */
    public static void m62803a(TopPicksEmptyView topPicksEmptyView, SettingsLauncher settingsLauncher) {
        topPicksEmptyView.f52440b = settingsLauncher;
    }
}
