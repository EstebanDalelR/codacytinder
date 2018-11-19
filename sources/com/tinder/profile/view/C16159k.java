package com.tinder.profile.view;

import com.tinder.profile.presenter.C14429h;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.k */
public final class C16159k implements MembersInjector<CurrentUserProfileView> {
    /* renamed from: a */
    private final Provider<C14429h> f50332a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61074a((CurrentUserProfileView) obj);
    }

    /* renamed from: a */
    public void m61074a(CurrentUserProfileView currentUserProfileView) {
        C16159k.m61073a(currentUserProfileView, (C14429h) this.f50332a.get());
    }

    /* renamed from: a */
    public static void m61073a(CurrentUserProfileView currentUserProfileView, C14429h c14429h) {
        currentUserProfileView.f50228a = c14429h;
    }
}
