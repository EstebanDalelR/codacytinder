package com.tinder.profile.view;

import com.tinder.profile.presenter.bb;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.w */
public final class C16169w implements MembersInjector<ProfileReportUserView> {
    /* renamed from: a */
    private final Provider<bb> f50361a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61097a((ProfileReportUserView) obj);
    }

    /* renamed from: a */
    public void m61097a(ProfileReportUserView profileReportUserView) {
        C16169w.m61096a(profileReportUserView, (bb) this.f50361a.get());
    }

    /* renamed from: a */
    public static void m61096a(ProfileReportUserView profileReportUserView, bb bbVar) {
        profileReportUserView.f50287b = bbVar;
    }
}
