package com.tinder.views.grid;

import com.tinder.chat.activity.C8406b;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.views.grid.e */
public final class C17264e implements MembersInjector<RefreshableGridRecsView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f52931a;
    /* renamed from: b */
    private final Provider<C8406b> f52932b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63210a((RefreshableGridRecsView) obj);
    }

    /* renamed from: a */
    public void m63210a(RefreshableGridRecsView refreshableGridRecsView) {
        C17264e.m63209a(refreshableGridRecsView, (UserRecActivePhotoIndexProvider) this.f52931a.get());
        C17264e.m63208a(refreshableGridRecsView, (C8406b) this.f52932b.get());
    }

    /* renamed from: a */
    public static void m63209a(RefreshableGridRecsView refreshableGridRecsView, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        refreshableGridRecsView.f12561d = userRecActivePhotoIndexProvider;
    }

    /* renamed from: a */
    public static void m63208a(RefreshableGridRecsView refreshableGridRecsView, C8406b c8406b) {
        refreshableGridRecsView.f12562e = c8406b;
    }
}
