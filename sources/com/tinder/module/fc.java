package com.tinder.module;

import com.tinder.api.NetworkSamplerInterceptor;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.api.retrofit.InterceptorDecorator;
import com.tinder.api.timeout.PlacesTimeoutInterceptor;
import okhttp3.C17692o.C15961a;

final /* synthetic */ class fc implements InterceptorDecorator {
    /* renamed from: a */
    private final NetworkSamplerInterceptor f39380a;
    /* renamed from: b */
    private final NetworkPerfInterceptor f39381b;
    /* renamed from: c */
    private final PlacesTimeoutInterceptor f39382c;

    fc(NetworkSamplerInterceptor networkSamplerInterceptor, NetworkPerfInterceptor networkPerfInterceptor, PlacesTimeoutInterceptor placesTimeoutInterceptor) {
        this.f39380a = networkSamplerInterceptor;
        this.f39381b = networkPerfInterceptor;
        this.f39382c = placesTimeoutInterceptor;
    }

    public C15961a applyInterceptors(C15961a c15961a) {
        return c15961a.a(this.f39380a).a(this.f39381b).a(this.f39382c);
    }
}
