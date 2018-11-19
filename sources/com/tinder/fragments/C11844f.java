package com.tinder.fragments;

import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bt;
import com.tinder.photooptimizer.C13558c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fragments.f */
public final class C11844f implements MembersInjector<EditProfilePhotoView> {
    /* renamed from: a */
    private final Provider<bt> f38648a;
    /* renamed from: b */
    private final Provider<ManagerProfile> f38649b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f38650c;
    /* renamed from: d */
    private final Provider<C13558c> f38651d;

    public /* synthetic */ void injectMembers(Object obj) {
        m47807a((EditProfilePhotoView) obj);
    }

    /* renamed from: a */
    public void m47807a(EditProfilePhotoView editProfilePhotoView) {
        C11844f.m47805a(editProfilePhotoView, (bt) this.f38648a.get());
        C11844f.m47804a(editProfilePhotoView, (ManagerProfile) this.f38649b.get());
        C11844f.m47803a(editProfilePhotoView, (ManagerAnalytics) this.f38650c.get());
        C11844f.m47806a(editProfilePhotoView, (C13558c) this.f38651d.get());
    }

    /* renamed from: a */
    public static void m47805a(EditProfilePhotoView editProfilePhotoView, bt btVar) {
        editProfilePhotoView.f38591a = btVar;
    }

    /* renamed from: a */
    public static void m47804a(EditProfilePhotoView editProfilePhotoView, ManagerProfile managerProfile) {
        editProfilePhotoView.f38592b = managerProfile;
    }

    /* renamed from: a */
    public static void m47803a(EditProfilePhotoView editProfilePhotoView, ManagerAnalytics managerAnalytics) {
        editProfilePhotoView.f38593c = managerAnalytics;
    }

    /* renamed from: a */
    public static void m47806a(EditProfilePhotoView editProfilePhotoView, C13558c c13558c) {
        editProfilePhotoView.f38594d = c13558c;
    }
}
