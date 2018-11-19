package com.tinder.views.grid;

import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.views.grid.p449a.C15453a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.views.grid.c */
public final class C17263c implements MembersInjector<GridUserRecCardView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f52929a;
    /* renamed from: b */
    private final Provider<C15453a> f52930b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63207a((GridUserRecCardView) obj);
    }

    /* renamed from: a */
    public void m63207a(GridUserRecCardView gridUserRecCardView) {
        C17263c.m63205a(gridUserRecCardView, (UserRecActivePhotoIndexProvider) this.f52929a.get());
        C17263c.m63206a(gridUserRecCardView, (C15453a) this.f52930b.get());
    }

    /* renamed from: a */
    public static void m63205a(GridUserRecCardView gridUserRecCardView, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        gridUserRecCardView.f56673c = userRecActivePhotoIndexProvider;
    }

    /* renamed from: a */
    public static void m63206a(GridUserRecCardView gridUserRecCardView, C15453a c15453a) {
        gridUserRecCardView.f56674d = c15453a;
    }
}
