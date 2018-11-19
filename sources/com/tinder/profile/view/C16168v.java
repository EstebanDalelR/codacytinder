package com.tinder.profile.view;

import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.presenter.ax;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.v */
public final class C16168v implements MembersInjector<ProfileRecommendToFriendView> {
    /* renamed from: a */
    private final Provider<ax> f50359a;
    /* renamed from: b */
    private final Provider<C16093z> f50360b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61095a((ProfileRecommendToFriendView) obj);
    }

    /* renamed from: a */
    public void m61095a(ProfileRecommendToFriendView profileRecommendToFriendView) {
        C16168v.m61094a(profileRecommendToFriendView, (ax) this.f50359a.get());
        C16168v.m61093a(profileRecommendToFriendView, (C16093z) this.f50360b.get());
    }

    /* renamed from: a */
    public static void m61094a(ProfileRecommendToFriendView profileRecommendToFriendView, ax axVar) {
        profileRecommendToFriendView.f50282a = axVar;
    }

    /* renamed from: a */
    public static void m61093a(ProfileRecommendToFriendView profileRecommendToFriendView, C16093z c16093z) {
        profileRecommendToFriendView.f50283b = c16093z;
    }
}
