package com.tinder.deeplink.p333a;

import android.support.annotation.NonNull;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.deeplink.exception.ProfileLoadFailedException;
import com.tinder.deeplink.p229b.C8819a;
import com.tinder.deeplink.p229b.C8819a.C8818a;
import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;

/* renamed from: com.tinder.deeplink.a.a */
public class C11099a implements DeepLinkedSharedRecInterceptor {
    @NonNull
    /* renamed from: a */
    private final C8819a f35884a;

    public C11099a(@NonNull C8819a c8819a) {
        this.f35884a = c8819a;
    }

    public boolean interceptOnProfileLoaded(@NonNull User user, @NonNull DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f35884a.m37524a(new C8818a(user, deepLinkReferralInfo));
        return true;
    }

    public boolean interceptOnProfileLoadFailed() {
        this.f35884a.m37526a(new ProfileLoadFailedException());
        return true;
    }
}
