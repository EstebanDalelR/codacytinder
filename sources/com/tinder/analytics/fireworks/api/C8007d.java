package com.tinder.analytics.fireworks.api;

import retrofit2.Response;
import rx.functions.Func1;

/* renamed from: com.tinder.analytics.fireworks.api.d */
final /* synthetic */ class C8007d implements Func1 {
    /* renamed from: a */
    private final RetrofitFireworksNetworkClient f28634a;

    C8007d(RetrofitFireworksNetworkClient retrofitFireworksNetworkClient) {
        this.f28634a = retrofitFireworksNetworkClient;
    }

    public Object call(Object obj) {
        return this.f28634a.m31227a((Response) obj);
    }
}
