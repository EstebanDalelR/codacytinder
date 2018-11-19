package com.tinder.settings.feed.view;

import com.tinder.settings.feed.p406a.C14868a;
import com.tinder.settings.feed.presenter.C14876c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.view.b */
public final class C16640b implements MembersInjector<FeedSettingsView> {
    /* renamed from: a */
    private final Provider<C14876c> f51519a;
    /* renamed from: b */
    private final Provider<C14868a> f51520b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62102a((FeedSettingsView) obj);
    }

    /* renamed from: a */
    public void m62102a(FeedSettingsView feedSettingsView) {
        C16640b.m62101a(feedSettingsView, (C14876c) this.f51519a.get());
        C16640b.m62100a(feedSettingsView, (C14868a) this.f51520b.get());
    }

    /* renamed from: a */
    public static void m62101a(FeedSettingsView feedSettingsView, C14876c c14876c) {
        feedSettingsView.f12498a = c14876c;
    }

    /* renamed from: a */
    public static void m62100a(FeedSettingsView feedSettingsView, C14868a c14868a) {
        feedSettingsView.f12499b = c14868a;
    }
}
