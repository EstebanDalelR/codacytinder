package com.tinder.analytics.fireworks.api;

import com.tinder.analytics.fireworks.api.RetrofitFireworksNetworkClient.C6221a;
import rx.functions.Func1;

/* renamed from: com.tinder.analytics.fireworks.api.g */
final /* synthetic */ class C8010g implements Func1 {
    /* renamed from: a */
    private final RetrofitFireworksNetworkClient f28638a;
    /* renamed from: b */
    private final int f28639b;

    C8010g(RetrofitFireworksNetworkClient retrofitFireworksNetworkClient, int i) {
        this.f28638a = retrofitFireworksNetworkClient;
        this.f28639b = i;
    }

    public Object call(Object obj) {
        return this.f28638a.m31228a(this.f28639b, (C6221a) obj);
    }
}
