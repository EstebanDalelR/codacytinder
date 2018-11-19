package com.tinder.bitmoji.view;

import com.tinder.bitmoji.presenter.C8329a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.bitmoji.view.a */
public final class C10397a implements MembersInjector<BitmojiIconView> {
    /* renamed from: a */
    private final Provider<C8329a> f33894a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42228a((BitmojiIconView) obj);
    }

    /* renamed from: a */
    public void m42228a(BitmojiIconView bitmojiIconView) {
        C10397a.m42227a(bitmojiIconView, (C8329a) this.f33894a.get());
    }

    /* renamed from: a */
    public static void m42227a(BitmojiIconView bitmojiIconView, C8329a c8329a) {
        bitmojiIconView.f33883a = c8329a;
    }
}
