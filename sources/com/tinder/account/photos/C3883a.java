package com.tinder.account.photos;

import com.tinder.account.photos.photogrid.p075a.C2624a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.account.photos.a */
public final class C3883a implements MembersInjector<CurrentUserPhotosView> {
    /* renamed from: a */
    private final Provider<C2624a> f12154a;

    public /* synthetic */ void injectMembers(Object obj) {
        m14629a((CurrentUserPhotosView) obj);
    }

    /* renamed from: a */
    public void m14629a(CurrentUserPhotosView currentUserPhotosView) {
        C3883a.m14628a(currentUserPhotosView, (C2624a) this.f12154a.get());
    }

    /* renamed from: a */
    public static void m14628a(CurrentUserPhotosView currentUserPhotosView, C2624a c2624a) {
        currentUserPhotosView.f12148b = c2624a;
    }
}
