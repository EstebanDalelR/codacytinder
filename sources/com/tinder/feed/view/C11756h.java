package com.tinder.feed.view;

import com.tinder.feed.presenter.C9471h;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.h */
public final class C11756h implements MembersInjector<MatchMessagesTabView> {
    /* renamed from: a */
    private final Provider<C9471h> f38416a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47638a((MatchMessagesTabView) obj);
    }

    /* renamed from: a */
    public void m47638a(MatchMessagesTabView matchMessagesTabView) {
        C11756h.m47637a(matchMessagesTabView, (C9471h) this.f38416a.get());
    }

    /* renamed from: a */
    public static void m47637a(MatchMessagesTabView matchMessagesTabView, C9471h c9471h) {
        matchMessagesTabView.f42062a = c9471h;
    }
}
