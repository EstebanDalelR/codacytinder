package com.tinder.profile.presenter;

import com.tinder.profile.model.Profile;
import rx.functions.Action1;

final /* synthetic */ class ay implements Action1 {
    /* renamed from: a */
    private final ax f57969a;
    /* renamed from: b */
    private final Profile f57970b;

    ay(ax axVar, Profile profile) {
        this.f57969a = axVar;
        this.f57970b = profile;
    }

    public void call(Object obj) {
        this.f57969a.m55011a(this.f57970b, (String) obj);
    }
}
