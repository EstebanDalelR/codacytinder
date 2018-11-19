package com.tinder.feed.view.message;

import com.tinder.feed.presenter.C9464a;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.message.b */
public final class C11764b implements MembersInjector<FeedCommentComposerView> {
    /* renamed from: a */
    private final Provider<C9464a> f38464a;
    /* renamed from: b */
    private final Provider<C9542a> f38465b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47669a((FeedCommentComposerView) obj);
    }

    /* renamed from: a */
    public void m47669a(FeedCommentComposerView feedCommentComposerView) {
        C11764b.m47667a(feedCommentComposerView, (C9464a) this.f38464a.get());
        C11764b.m47668a(feedCommentComposerView, (C9542a) this.f38465b.get());
    }

    /* renamed from: a */
    public static void m47667a(FeedCommentComposerView feedCommentComposerView, C9464a c9464a) {
        feedCommentComposerView.f38437a = c9464a;
    }

    /* renamed from: a */
    public static void m47668a(FeedCommentComposerView feedCommentComposerView, C9542a c9542a) {
        feedCommentComposerView.f38438b = c9542a;
    }
}
