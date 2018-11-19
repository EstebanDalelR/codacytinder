package com.tinder.interactors;

import com.tinder.utils.ad;
import rx.functions.Action1;

/* renamed from: com.tinder.interactors.m */
final /* synthetic */ class C14044m implements Action1 {
    /* renamed from: a */
    static final Action1 f44474a = new C14044m();

    private C14044m() {
    }

    public void call(Object obj) {
        ad.a("Something wrong when getting current user Spotify or boost data.", (Throwable) obj);
    }
}
