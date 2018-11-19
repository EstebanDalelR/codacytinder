package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C9395n;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.f */
public final class C11677f implements MembersInjector<FastMatchRecsToolbarView> {
    /* renamed from: a */
    private final Provider<C9395n> f38167a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47475a((FastMatchRecsToolbarView) obj);
    }

    /* renamed from: a */
    public void m47475a(FastMatchRecsToolbarView fastMatchRecsToolbarView) {
        C11677f.m47474a(fastMatchRecsToolbarView, (C9395n) this.f38167a.get());
    }

    /* renamed from: a */
    public static void m47474a(FastMatchRecsToolbarView fastMatchRecsToolbarView, C9395n c9395n) {
        fastMatchRecsToolbarView.f38143a = c9395n;
    }
}
