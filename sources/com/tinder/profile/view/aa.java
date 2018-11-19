package com.tinder.profile.view;

import com.tinder.profile.model.Profile;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.screenshotty.p401a.C14826a;
import rx.functions.Action0;

final /* synthetic */ class aa implements Action0 {
    /* renamed from: a */
    private final ProfileView f57992a;
    /* renamed from: b */
    private final TinderNotification f57993b;
    /* renamed from: c */
    private final Profile f57994c;
    /* renamed from: d */
    private final String f57995d;
    /* renamed from: e */
    private final C14826a f57996e;

    aa(ProfileView profileView, TinderNotification tinderNotification, Profile profile, String str, C14826a c14826a) {
        this.f57992a = profileView;
        this.f57993b = tinderNotification;
        this.f57994c = profile;
        this.f57995d = str;
        this.f57996e = c14826a;
    }

    public void call() {
        this.f57992a.a(this.f57993b, this.f57994c, this.f57995d, this.f57996e);
    }
}
