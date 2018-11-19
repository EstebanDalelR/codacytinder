package com.tinder.common;

import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.User;
import rx.functions.Action1;

/* renamed from: com.tinder.common.d */
final /* synthetic */ class C13761d implements Action1 {
    /* renamed from: a */
    private final C10656b f43744a;

    C13761d(C10656b c10656b) {
        this.f43744a = c10656b;
    }

    public void call(Object obj) {
        this.f43744a.m42973a((User) (ProfileUser) obj);
    }
}
