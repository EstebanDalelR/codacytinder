package com.tinder.profile.view;

import com.tinder.profile.presenter.bp;
import com.tinder.recs.model.TappyConfig;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ae implements MembersInjector<UserRecProfileView> {
    /* renamed from: a */
    private final Provider<bp> f50324a;
    /* renamed from: b */
    private final Provider<TappyConfig> f50325b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61064a((UserRecProfileView) obj);
    }

    /* renamed from: a */
    public void m61064a(UserRecProfileView userRecProfileView) {
        m61062a(userRecProfileView, (bp) this.f50324a.get());
        m61063a(userRecProfileView, (TappyConfig) this.f50325b.get());
    }

    /* renamed from: a */
    public static void m61062a(UserRecProfileView userRecProfileView, bp bpVar) {
        userRecProfileView.f50308a = bpVar;
    }

    /* renamed from: a */
    public static void m61063a(UserRecProfileView userRecProfileView, TappyConfig tappyConfig) {
        userRecProfileView.f50309b = tappyConfig;
    }
}
