package com.tinder.feed.view.footer;

import com.tinder.common.C8533f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.footer.a */
public final class C11752a implements MembersInjector<FeedFooterDescriptionView> {
    /* renamed from: a */
    private final Provider<C8533f> f38412a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47630a((FeedFooterDescriptionView) obj);
    }

    /* renamed from: a */
    public void m47630a(FeedFooterDescriptionView feedFooterDescriptionView) {
        C11752a.m47629a(feedFooterDescriptionView, (C8533f) this.f38412a.get());
    }

    /* renamed from: a */
    public static void m47629a(FeedFooterDescriptionView feedFooterDescriptionView, C8533f c8533f) {
        feedFooterDescriptionView.f31818b = c8533f;
    }
}
