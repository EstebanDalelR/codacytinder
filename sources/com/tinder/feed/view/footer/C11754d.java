package com.tinder.feed.view.footer;

import com.tinder.feed.view.feed.C9498i;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.footer.d */
public final class C11754d implements MembersInjector<FeedInstagramFooterDescriptionView> {
    /* renamed from: a */
    private final Provider<C9498i> f38414a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47634a((FeedInstagramFooterDescriptionView) obj);
    }

    /* renamed from: a */
    public void m47634a(FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView) {
        C11754d.m47633a(feedInstagramFooterDescriptionView, (C9498i) this.f38414a.get());
    }

    /* renamed from: a */
    public static void m47633a(FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView, C9498i c9498i) {
        feedInstagramFooterDescriptionView.f31828b = c9498i;
    }
}
