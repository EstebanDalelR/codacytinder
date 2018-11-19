package com.tinder.profile.view;

import com.tinder.profile.presenter.C14434z;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.l */
public final class C16160l implements MembersInjector<MatchProfileView> {
    /* renamed from: a */
    private final Provider<C14434z> f50333a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61076a((MatchProfileView) obj);
    }

    /* renamed from: a */
    public void m61076a(MatchProfileView matchProfileView) {
        C16160l.m61075a(matchProfileView, (C14434z) this.f50333a.get());
    }

    /* renamed from: a */
    public static void m61075a(MatchProfileView matchProfileView, C14434z c14434z) {
        matchProfileView.f50239a = c14434z;
    }
}
