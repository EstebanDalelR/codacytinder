package com.tinder.settings.feed.view;

import com.tinder.settings.feed.presenter.C14874a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.view.a */
public final class C16639a implements MembersInjector<FeedSettingsItemView> {
    /* renamed from: a */
    private final Provider<C14874a> f51518a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62099a((FeedSettingsItemView) obj);
    }

    /* renamed from: a */
    public void m62099a(FeedSettingsItemView feedSettingsItemView) {
        C16639a.m62098a(feedSettingsItemView, (C14874a) this.f51518a.get());
    }

    /* renamed from: a */
    public static void m62098a(FeedSettingsItemView feedSettingsItemView, C14874a c14874a) {
        feedSettingsItemView.f51508a = c14874a;
    }
}
