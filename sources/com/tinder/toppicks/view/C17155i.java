package com.tinder.toppicks.view;

import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.toppicks.presenter.C15295q;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.p449a.C15453a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.view.i */
public final class C17155i implements MembersInjector<TopPicksUserRecCardView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f52678a;
    /* renamed from: b */
    private final Provider<C15453a> f52679b;
    /* renamed from: c */
    private final Provider<C15295q> f52680c;

    public /* synthetic */ void injectMembers(Object obj) {
        m63028a((TopPicksUserRecCardView) obj);
    }

    /* renamed from: a */
    public void m63028a(TopPicksUserRecCardView topPicksUserRecCardView) {
        C17263c.m63205a((GridUserRecCardView) topPicksUserRecCardView, (UserRecActivePhotoIndexProvider) this.f52678a.get());
        C17263c.m63206a((GridUserRecCardView) topPicksUserRecCardView, (C15453a) this.f52679b.get());
        C17155i.m63027a(topPicksUserRecCardView, (C15295q) this.f52680c.get());
    }

    /* renamed from: a */
    public static void m63027a(TopPicksUserRecCardView topPicksUserRecCardView, C15295q c15295q) {
        topPicksUserRecCardView.f58708b = c15295q;
    }
}
