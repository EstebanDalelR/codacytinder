package com.tinder.profile.view;

import com.tinder.profile.model.Profile;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.screenshotty.p401a.C14826a;
import rx.functions.Func1;

/* renamed from: com.tinder.profile.view.z */
final /* synthetic */ class C17775z implements Func1 {
    /* renamed from: a */
    private final ProfileView f55467a;
    /* renamed from: b */
    private final Profile f55468b;
    /* renamed from: c */
    private final String f55469c;
    /* renamed from: d */
    private final C14826a f55470d;

    C17775z(ProfileView profileView, Profile profile, String str, C14826a c14826a) {
        this.f55467a = profileView;
        this.f55468b = profile;
        this.f55469c = str;
        this.f55470d = c14826a;
    }

    public Object call(Object obj) {
        return this.f55467a.a(this.f55468b, this.f55469c, this.f55470d, (TinderNotification) obj);
    }
}
