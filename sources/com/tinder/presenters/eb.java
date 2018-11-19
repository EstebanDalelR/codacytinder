package com.tinder.presenters;

import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;
import rx.functions.Action1;

final /* synthetic */ class eb implements Action1 {
    /* renamed from: a */
    private final df f57916a;
    /* renamed from: b */
    private final User f57917b;
    /* renamed from: c */
    private final String f57918c;
    /* renamed from: d */
    private final DeepLinkReferralInfo f57919d;

    eb(df dfVar, User user, String str, DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f57916a = dfVar;
        this.f57917b = user;
        this.f57918c = str;
        this.f57919d = deepLinkReferralInfo;
    }

    public void call(Object obj) {
        this.f57916a.m64817a(this.f57917b, this.f57918c, this.f57919d, (CurrentUser) obj);
    }
}
