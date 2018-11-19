package com.tinder.profile.presenter;

import com.tinder.profile.model.Profile;
import rx.functions.Action1;

final /* synthetic */ class ab implements Action1 {
    /* renamed from: a */
    private final C14434z f57960a;
    /* renamed from: b */
    private final String f57961b;

    ab(C14434z c14434z, String str) {
        this.f57960a = c14434z;
        this.f57961b = str;
    }

    public void call(Object obj) {
        this.f57960a.m55110a(this.f57961b, (Profile) obj);
    }
}
