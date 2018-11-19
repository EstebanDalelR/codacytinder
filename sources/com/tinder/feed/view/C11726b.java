package com.tinder.feed.view;

import com.tinder.feed.p249d.C9462a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.b */
public final class C11726b implements MembersInjector<FeedCarouselView> {
    /* renamed from: a */
    private final Provider<C9462a> f38245a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47552a((FeedCarouselView) obj);
    }

    /* renamed from: a */
    public void m47552a(FeedCarouselView feedCarouselView) {
        C11726b.m47551a(feedCarouselView, (C9462a) this.f38245a.get());
    }

    /* renamed from: a */
    public static void m47551a(FeedCarouselView feedCarouselView, C9462a c9462a) {
        feedCarouselView.f42040a = c9462a;
    }
}
