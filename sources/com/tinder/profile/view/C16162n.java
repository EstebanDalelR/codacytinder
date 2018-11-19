package com.tinder.profile.view;

import com.tinder.profile.presenter.C14426e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.n */
public final class C16162n implements MembersInjector<ProfileBitmojiAuthView> {
    /* renamed from: a */
    private final Provider<C14426e> f50337a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61082a((ProfileBitmojiAuthView) obj);
    }

    /* renamed from: a */
    public void m61082a(ProfileBitmojiAuthView profileBitmojiAuthView) {
        C16162n.m61081a(profileBitmojiAuthView, (C14426e) this.f50337a.get());
    }

    /* renamed from: a */
    public static void m61081a(ProfileBitmojiAuthView profileBitmojiAuthView, C14426e c14426e) {
        profileBitmojiAuthView.f50251a = c14426e;
    }
}
