package com.tinder.profile.view;

import com.tinder.profile.model.Profile;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;
import com.tinder.screenshotty.p401a.C14826a;

final /* synthetic */ class ab implements Listener {
    /* renamed from: a */
    private final ProfileView f50315a;
    /* renamed from: b */
    private final Profile f50316b;
    /* renamed from: c */
    private final String f50317c;
    /* renamed from: d */
    private final C14826a f50318d;

    ab(ProfileView profileView, Profile profile, String str, C14826a c14826a) {
        this.f50315a = profileView;
        this.f50316b = profile;
        this.f50317c = str;
        this.f50318d = c14826a;
    }

    public void onInAppNotificationClicked() {
        this.f50315a.a(this.f50316b, this.f50317c, this.f50318d);
    }
}
