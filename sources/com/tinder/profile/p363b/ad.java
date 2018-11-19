package com.tinder.profile.p363b;

import retrofit2.Response;
import rx.functions.Action1;

/* renamed from: com.tinder.profile.b.ad */
final /* synthetic */ class ad implements Action1 {
    /* renamed from: a */
    private final ab f57956a;
    /* renamed from: b */
    private final String f57957b;

    ad(ab abVar, String str) {
        this.f57956a = abVar;
        this.f57957b = str;
    }

    public void call(Object obj) {
        this.f57956a.m54753a(this.f57957b, (Response) obj);
    }
}
