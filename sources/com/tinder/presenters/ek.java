package com.tinder.presenters;

import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;
import com.tinder.targets.MainActivityTarget;
import io.reactivex.functions.Consumer;

final /* synthetic */ class ek implements Consumer {
    /* renamed from: a */
    private final df f49885a;
    /* renamed from: b */
    private final User f49886b;
    /* renamed from: c */
    private final CurrentUser f49887c;
    /* renamed from: d */
    private final MainActivityTarget f49888d;
    /* renamed from: e */
    private final String f49889e;
    /* renamed from: f */
    private final DeepLinkReferralInfo f49890f;

    ek(df dfVar, User user, CurrentUser currentUser, MainActivityTarget mainActivityTarget, String str, DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f49885a = dfVar;
        this.f49886b = user;
        this.f49887c = currentUser;
        this.f49888d = mainActivityTarget;
        this.f49889e = str;
        this.f49890f = deepLinkReferralInfo;
    }

    public void accept(Object obj) {
        this.f49885a.m64815a(this.f49886b, this.f49887c, this.f49888d, this.f49889e, this.f49890f, (Throwable) obj);
    }
}
