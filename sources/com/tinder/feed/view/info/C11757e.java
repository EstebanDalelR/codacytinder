package com.tinder.feed.view.info;

import com.tinder.feed.view.action.C11723c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.info.e */
public final class C11757e implements MembersInjector<FeedInfoView> {
    /* renamed from: a */
    private final Provider<C11723c> f38424a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47641a((FeedInfoView) obj);
    }

    /* renamed from: a */
    public void m47641a(FeedInfoView feedInfoView) {
        C11757e.m47640a(feedInfoView, (C11723c) this.f38424a.get());
    }

    /* renamed from: a */
    public static void m47640a(FeedInfoView feedInfoView, C11723c c11723c) {
        feedInfoView.f38418b = c11723c;
    }
}
