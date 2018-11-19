package com.tinder.profile.view;

import android.content.Intent;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.profile.view.t */
final /* synthetic */ class C16165t implements Consumer {
    /* renamed from: a */
    private final ProfileRecommendToFriendView f50341a;
    /* renamed from: b */
    private final Intent f50342b;
    /* renamed from: c */
    private final Profile f50343c;
    /* renamed from: d */
    private final ProfileShareSource f50344d;
    /* renamed from: e */
    private final ProfileShareAction f50345e;

    C16165t(ProfileRecommendToFriendView profileRecommendToFriendView, Intent intent, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        this.f50341a = profileRecommendToFriendView;
        this.f50342b = intent;
        this.f50343c = profile;
        this.f50344d = profileShareSource;
        this.f50345e = profileShareAction;
    }

    public void accept(Object obj) {
        this.f50341a.m61036a(this.f50342b, this.f50343c, this.f50344d, this.f50345e, (String) obj);
    }
}
