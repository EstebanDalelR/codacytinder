package com.tinder.activities;

import android.support.annotation.NonNull;
import com.tinder.managers.ManagerDeepLinking.OnProfileLoadedListener;
import com.tinder.model.DeepLinkParams;
import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;

class MainActivity$1 implements OnProfileLoadedListener {
    /* renamed from: a */
    final /* synthetic */ DeepLinkParams f26196a;
    /* renamed from: b */
    final /* synthetic */ MainActivity f26197b;

    MainActivity$1(MainActivity mainActivity, DeepLinkParams deepLinkParams) {
        this.f26197b = mainActivity;
        this.f26196a = deepLinkParams;
    }

    public void onProfileLoaded(User user, @NonNull DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f26197b.f14939i.a(user, this.f26196a.getReferringLink(), deepLinkReferralInfo);
    }

    public void onProfileLoadFailed() {
        MainActivity.a(this.f26197b);
    }
}
