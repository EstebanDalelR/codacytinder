package com.tinder.passport.activities;

import retrofit2.Response;
import rx.functions.Action1;

/* renamed from: com.tinder.passport.activities.a */
final /* synthetic */ class C14118a implements Action1 {
    /* renamed from: a */
    private final ActivityPassport f44814a;

    C14118a(ActivityPassport activityPassport) {
        this.f44814a = activityPassport;
    }

    public void call(Object obj) {
        this.f44814a.m54573a((Response) obj);
    }
}
