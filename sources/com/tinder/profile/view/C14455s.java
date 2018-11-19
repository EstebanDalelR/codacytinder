package com.tinder.profile.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.profile.model.Profile;

/* renamed from: com.tinder.profile.view.s */
final /* synthetic */ class C14455s implements OnClickListener {
    /* renamed from: a */
    private final ProfileRecommendToFriendView f45804a;
    /* renamed from: b */
    private final Profile f45805b;

    C14455s(ProfileRecommendToFriendView profileRecommendToFriendView, Profile profile) {
        this.f45804a = profileRecommendToFriendView;
        this.f45805b = profile;
    }

    public void onClick(View view) {
        this.f45804a.m61037a(this.f45805b, view);
    }
}
