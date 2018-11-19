package com.tinder.feed.view.footer;

import com.tinder.feed.view.feed.C9496h;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.footer.c */
public final class C11753c implements MembersInjector<FeedFooterView> {
    /* renamed from: a */
    private final Provider<C9496h> f38413a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47632a((FeedFooterView) obj);
    }

    /* renamed from: a */
    public void m47632a(FeedFooterView feedFooterView) {
        C11753c.m47631a(feedFooterView, (C9496h) this.f38413a.get());
    }

    /* renamed from: a */
    public static void m47631a(FeedFooterView feedFooterView, C9496h c9496h) {
        feedFooterView.f31825b = c9496h;
    }
}
