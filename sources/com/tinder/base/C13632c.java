package com.tinder.base;

import rx.functions.Action1;

/* renamed from: com.tinder.base.c */
final /* synthetic */ class C13632c implements Action1 {
    /* renamed from: a */
    private final ActivitySignedInBase f43449a;

    C13632c(ActivitySignedInBase activitySignedInBase) {
        this.f43449a = activitySignedInBase;
    }

    public void call(Object obj) {
        this.f43449a.tryPresentAppRating((String) obj);
    }
}
