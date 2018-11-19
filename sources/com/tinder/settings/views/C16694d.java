package com.tinder.settings.views;

import com.tinder.settings.presenter.C18075n;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.views.d */
public final class C16694d implements MembersInjector<MoreGenderView> {
    /* renamed from: a */
    private final Provider<C18075n> f51665a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62185a((MoreGenderView) obj);
    }

    /* renamed from: a */
    public void m62185a(MoreGenderView moreGenderView) {
        C16694d.m62184a(moreGenderView, (C18075n) this.f51665a.get());
    }

    /* renamed from: a */
    public static void m62184a(MoreGenderView moreGenderView, C18075n c18075n) {
        moreGenderView.f51617a = c18075n;
    }
}
