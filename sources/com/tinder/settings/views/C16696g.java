package com.tinder.settings.views;

import com.tinder.settings.presenter.bh;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.views.g */
public final class C16696g implements MembersInjector<ShowMeView> {
    /* renamed from: a */
    private final Provider<bh> f51667a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62189a((ShowMeView) obj);
    }

    /* renamed from: a */
    public void m62189a(ShowMeView showMeView) {
        C16696g.m62188a(showMeView, (bh) this.f51667a.get());
    }

    /* renamed from: a */
    public static void m62188a(ShowMeView showMeView, bh bhVar) {
        showMeView.f51651a = bhVar;
    }
}
