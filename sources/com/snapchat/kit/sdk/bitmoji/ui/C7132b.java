package com.snapchat.kit.sdk.bitmoji.ui;

import com.snapchat.kit.sdk.bitmoji.networking.C5900a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.b */
public final class C7132b implements MembersInjector<BitmojiIconFragment> {
    /* renamed from: a */
    private final Provider<AuthTokenManager> f25836a;
    /* renamed from: b */
    private final Provider<C5900a> f25837b;
    /* renamed from: c */
    private final Provider<LoginStateController> f25838c;
    /* renamed from: d */
    private final Provider<Picasso> f25839d;

    public /* synthetic */ void injectMembers(Object obj) {
        m30755a((BitmojiIconFragment) obj);
    }

    /* renamed from: a */
    public void m30755a(BitmojiIconFragment bitmojiIconFragment) {
        C7132b.m30753a(bitmojiIconFragment, (AuthTokenManager) this.f25836a.get());
        C7132b.m30751a(bitmojiIconFragment, (C5900a) this.f25837b.get());
        C7132b.m30752a(bitmojiIconFragment, (LoginStateController) this.f25838c.get());
        C7132b.m30754a(bitmojiIconFragment, (Picasso) this.f25839d.get());
    }

    /* renamed from: a */
    public static void m30753a(BitmojiIconFragment bitmojiIconFragment, AuthTokenManager authTokenManager) {
        bitmojiIconFragment.f28408a = authTokenManager;
    }

    /* renamed from: a */
    public static void m30751a(BitmojiIconFragment bitmojiIconFragment, C5900a c5900a) {
        bitmojiIconFragment.f28409b = c5900a;
    }

    /* renamed from: a */
    public static void m30752a(BitmojiIconFragment bitmojiIconFragment, LoginStateController loginStateController) {
        bitmojiIconFragment.f28410c = loginStateController;
    }

    /* renamed from: a */
    public static void m30754a(BitmojiIconFragment bitmojiIconFragment, Picasso picasso) {
        bitmojiIconFragment.f28411d = picasso;
    }
}
