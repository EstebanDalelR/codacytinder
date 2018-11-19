package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C9397p;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.p449a.C15453a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.i */
public final class C11679i implements MembersInjector<FastMatchUserRecCardView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f38173a;
    /* renamed from: b */
    private final Provider<C15453a> f38174b;
    /* renamed from: c */
    private final Provider<C9397p> f38175c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47481a((FastMatchUserRecCardView) obj);
    }

    /* renamed from: a */
    public void m47481a(FastMatchUserRecCardView fastMatchUserRecCardView) {
        C17263c.a(fastMatchUserRecCardView, (UserRecActivePhotoIndexProvider) this.f38173a.get());
        C17263c.a(fastMatchUserRecCardView, (C15453a) this.f38174b.get());
        C11679i.m47480a(fastMatchUserRecCardView, (C9397p) this.f38175c.get());
    }

    /* renamed from: a */
    public static void m47480a(FastMatchUserRecCardView fastMatchUserRecCardView, C9397p c9397p) {
        fastMatchUserRecCardView.f44072a = c9397p;
    }
}
