package com.tinder.analytics.fireworks.api;

import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.tinder.analytics.fireworks.api.e */
final /* synthetic */ class C8008e implements Func1 {
    /* renamed from: a */
    private final RetrofitFireworksNetworkClient f28635a;
    /* renamed from: b */
    private final int f28636b;

    C8008e(RetrofitFireworksNetworkClient retrofitFireworksNetworkClient, int i) {
        this.f28635a = retrofitFireworksNetworkClient;
        this.f28636b = i;
    }

    public Object call(Object obj) {
        return this.f28635a.m31229a(this.f28636b, (Observable) obj);
    }
}
