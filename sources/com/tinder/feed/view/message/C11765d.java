package com.tinder.feed.view.message;

import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.action.C9482a;
import com.tinder.feed.view.feed.C9491c;
import com.tinder.feed.view.feed.C9496h;
import com.tinder.feed.view.provider.C9542a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.message.d */
public final class C11765d implements MembersInjector<FeedCommentView> {
    /* renamed from: a */
    private final Provider<C9542a> f38466a;
    /* renamed from: b */
    private final Provider<C9482a> f38467b;
    /* renamed from: c */
    private final Provider<C9496h> f38468c;
    /* renamed from: d */
    private final Provider<C9491c> f38469d;
    /* renamed from: e */
    private final Provider<C9467d> f38470e;

    public /* synthetic */ void injectMembers(Object obj) {
        m47675a((FeedCommentView) obj);
    }

    /* renamed from: a */
    public void m47675a(FeedCommentView feedCommentView) {
        C11765d.m47674a(feedCommentView, (C9542a) this.f38466a.get());
        C11765d.m47671a(feedCommentView, (C9482a) this.f38467b.get());
        C11765d.m47673a(feedCommentView, (C9496h) this.f38468c.get());
        C11765d.m47672a(feedCommentView, (C9491c) this.f38469d.get());
        C11765d.m47670a(feedCommentView, (C9467d) this.f38470e.get());
    }

    /* renamed from: a */
    public static void m47674a(FeedCommentView feedCommentView, C9542a c9542a) {
        feedCommentView.f38444b = c9542a;
    }

    /* renamed from: a */
    public static void m47671a(FeedCommentView feedCommentView, C9482a c9482a) {
        feedCommentView.f38445c = c9482a;
    }

    /* renamed from: a */
    public static void m47673a(FeedCommentView feedCommentView, C9496h c9496h) {
        feedCommentView.f38446d = c9496h;
    }

    /* renamed from: a */
    public static void m47672a(FeedCommentView feedCommentView, C9491c c9491c) {
        feedCommentView.f38447e = c9491c;
    }

    /* renamed from: a */
    public static void m47670a(FeedCommentView feedCommentView, C9467d c9467d) {
        feedCommentView.f38448f = c9467d;
    }
}
