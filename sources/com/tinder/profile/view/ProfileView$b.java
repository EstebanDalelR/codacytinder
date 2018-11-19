package com.tinder.profile.view;

import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.profile.model.Profile;

class ProfileView$b implements OnPhotoPageChangeListener {
    /* renamed from: a */
    final /* synthetic */ ProfileView f50298a;
    /* renamed from: b */
    private final Profile f50299b;

    ProfileView$b(ProfileView profileView, Profile profile) {
        this.f50298a = profileView;
        this.f50299b = profile;
    }

    public void onPhotoPageChange(String str, int i, int i2) {
        if (ProfileView.a(this.f50298a) != null) {
            this.f50298a.f12466a.m54997a(i, i2, this.f50299b);
            ProfileView.a(this.f50298a).onPhotoPageChange(str, i, i2);
        }
    }
}
