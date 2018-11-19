package com.tinder.superlike.p421e;

import com.tinder.api.TinderApi;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.superlike.p418a.C15066a;
import javax.inject.Inject;
import rx.Observable;
import rx.Single;

/* renamed from: com.tinder.superlike.e.c */
public class C15081c {
    /* renamed from: a */
    private final TinderApi f46932a;
    /* renamed from: b */
    private final C15066a f46933b;

    @Inject
    public C15081c(TinderApi tinderApi, C15066a c15066a) {
        this.f46932a = tinderApi;
        this.f46933b = c15066a;
    }

    @Deprecated
    /* renamed from: a */
    public Single<SuperlikeStatus> m56830a() {
        Observable superLikeStatus = this.f46932a.getSuperLikeStatus();
        C15066a c15066a = this.f46933b;
        c15066a.getClass();
        return superLikeStatus.k(C18192d.m65965a(c15066a)).a();
    }
}
