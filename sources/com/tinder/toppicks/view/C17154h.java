package com.tinder.toppicks.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.chat.activity.C8406b;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.toppicks.exhausted.C15267e;
import com.tinder.toppicks.presenter.C17082e;
import com.tinder.views.grid.C17264e;
import com.tinder.views.grid.RefreshableGridRecsView;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.view.h */
public final class C17154h implements MembersInjector<TopPicksGridRecsView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f52673a;
    /* renamed from: b */
    private final Provider<C8406b> f52674b;
    /* renamed from: c */
    private final Provider<C17082e> f52675c;
    /* renamed from: d */
    private final Provider<C15267e> f52676d;
    /* renamed from: e */
    private final Provider<Lifecycle> f52677e;

    public /* synthetic */ void injectMembers(Object obj) {
        m63026a((TopPicksGridRecsView) obj);
    }

    /* renamed from: a */
    public void m63026a(TopPicksGridRecsView topPicksGridRecsView) {
        C17264e.m63209a((RefreshableGridRecsView) topPicksGridRecsView, (UserRecActivePhotoIndexProvider) this.f52673a.get());
        C17264e.m63208a((RefreshableGridRecsView) topPicksGridRecsView, (C8406b) this.f52674b.get());
        C17154h.m63025a(topPicksGridRecsView, (C17082e) this.f52675c.get());
        C17154h.m63024a(topPicksGridRecsView, (C15267e) this.f52676d.get());
        C17154h.m63023a(topPicksGridRecsView, (Lifecycle) this.f52677e.get());
    }

    /* renamed from: a */
    public static void m63025a(TopPicksGridRecsView topPicksGridRecsView, C17082e c17082e) {
        topPicksGridRecsView.f14067a = c17082e;
    }

    /* renamed from: a */
    public static void m63024a(TopPicksGridRecsView topPicksGridRecsView, C15267e c15267e) {
        topPicksGridRecsView.f14068b = c15267e;
    }

    /* renamed from: a */
    public static void m63023a(TopPicksGridRecsView topPicksGridRecsView, Lifecycle lifecycle) {
        topPicksGridRecsView.f14069c = lifecycle;
    }
}
