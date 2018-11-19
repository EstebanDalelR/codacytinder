package com.tinder.profile.view;

import com.tinder.profile.presenter.be;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.x */
public final class C16170x implements MembersInjector<ProfileTopArtistsView> {
    /* renamed from: a */
    private final Provider<be> f50362a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61099a((ProfileTopArtistsView) obj);
    }

    /* renamed from: a */
    public void m61099a(ProfileTopArtistsView profileTopArtistsView) {
        C16170x.m61098a(profileTopArtistsView, (be) this.f50362a.get());
    }

    /* renamed from: a */
    public static void m61098a(ProfileTopArtistsView profileTopArtistsView, be beVar) {
        profileTopArtistsView.f50294a = beVar;
    }
}
