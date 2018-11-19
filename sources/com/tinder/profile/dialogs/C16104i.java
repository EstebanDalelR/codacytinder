package com.tinder.profile.dialogs;

import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerProfile;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.dialogs.i */
public final class C16104i implements MembersInjector<InstagramPhotoViewerDialog> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f50086a;
    /* renamed from: b */
    private final Provider<ManagerAnalytics> f50087b;

    public /* synthetic */ void injectMembers(Object obj) {
        m60926a((InstagramPhotoViewerDialog) obj);
    }

    /* renamed from: a */
    public void m60926a(InstagramPhotoViewerDialog instagramPhotoViewerDialog) {
        C16104i.m60925a(instagramPhotoViewerDialog, (ManagerProfile) this.f50086a.get());
        C16104i.m60924a(instagramPhotoViewerDialog, (ManagerAnalytics) this.f50087b.get());
    }

    /* renamed from: a */
    public static void m60925a(InstagramPhotoViewerDialog instagramPhotoViewerDialog, ManagerProfile managerProfile) {
        instagramPhotoViewerDialog.f50057b = managerProfile;
    }

    /* renamed from: a */
    public static void m60924a(InstagramPhotoViewerDialog instagramPhotoViewerDialog, ManagerAnalytics managerAnalytics) {
        instagramPhotoViewerDialog.f50058c = managerAnalytics;
    }
}
