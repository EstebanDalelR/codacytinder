package com.tinder.feed.view;

import com.tinder.home.p342a.C11862a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.g */
public final class C11755g implements MembersInjector<MatchFeedTabView> {
    /* renamed from: a */
    private final Provider<C11862a> f38415a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47636a((MatchFeedTabView) obj);
    }

    /* renamed from: a */
    public void m47636a(MatchFeedTabView matchFeedTabView) {
        C11755g.m47635a(matchFeedTabView, (C11862a) this.f38415a.get());
    }

    /* renamed from: a */
    public static void m47635a(MatchFeedTabView matchFeedTabView, C11862a c11862a) {
        matchFeedTabView.f42059a = c11862a;
    }
}
