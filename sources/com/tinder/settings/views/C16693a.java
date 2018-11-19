package com.tinder.settings.views;

import com.tinder.settings.presenter.C18076p;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.views.a */
public final class C16693a implements MembersInjector<GenderSearchView> {
    /* renamed from: a */
    private final Provider<C18076p> f51664a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62183a((GenderSearchView) obj);
    }

    /* renamed from: a */
    public void m62183a(GenderSearchView genderSearchView) {
        C16693a.m62182a(genderSearchView, (C18076p) this.f51664a.get());
    }

    /* renamed from: a */
    public static void m62182a(GenderSearchView genderSearchView, C18076p c18076p) {
        genderSearchView.f51608a = c18076p;
    }
}
