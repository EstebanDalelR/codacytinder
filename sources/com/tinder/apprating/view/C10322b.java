package com.tinder.apprating.view;

import com.tinder.apprating.p164b.C8261a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.apprating.view.b */
public final class C10322b implements MembersInjector<AppRatingDialog> {
    /* renamed from: a */
    private final Provider<C8261a> f33724a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42097a((AppRatingDialog) obj);
    }

    /* renamed from: a */
    public void m42097a(AppRatingDialog appRatingDialog) {
        C10322b.m42096a(appRatingDialog, (C8261a) this.f33724a.get());
    }

    /* renamed from: a */
    public static void m42096a(AppRatingDialog appRatingDialog, C8261a c8261a) {
        appRatingDialog.f40594b = c8261a;
    }
}
