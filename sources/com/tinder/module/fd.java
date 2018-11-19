package com.tinder.module;

import com.tinder.api.NetworkSamplerInterceptor;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.api.retrofit.InterceptorDecorator;
import com.tinder.api.timeout.PlacesTimeoutInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fd implements Factory<InterceptorDecorator> {
    /* renamed from: a */
    private final fb f43011a;
    /* renamed from: b */
    private final Provider<NetworkSamplerInterceptor> f43012b;
    /* renamed from: c */
    private final Provider<NetworkPerfInterceptor> f43013c;
    /* renamed from: d */
    private final Provider<PlacesTimeoutInterceptor> f43014d;

    public /* synthetic */ Object get() {
        return m52513a();
    }

    public fd(fb fbVar, Provider<NetworkSamplerInterceptor> provider, Provider<NetworkPerfInterceptor> provider2, Provider<PlacesTimeoutInterceptor> provider3) {
        this.f43011a = fbVar;
        this.f43012b = provider;
        this.f43013c = provider2;
        this.f43014d = provider3;
    }

    /* renamed from: a */
    public InterceptorDecorator m52513a() {
        return m52511a(this.f43011a, this.f43012b, this.f43013c, this.f43014d);
    }

    /* renamed from: a */
    public static InterceptorDecorator m52511a(fb fbVar, Provider<NetworkSamplerInterceptor> provider, Provider<NetworkPerfInterceptor> provider2, Provider<PlacesTimeoutInterceptor> provider3) {
        return m52510a(fbVar, (NetworkSamplerInterceptor) provider.get(), (NetworkPerfInterceptor) provider2.get(), (PlacesTimeoutInterceptor) provider3.get());
    }

    /* renamed from: b */
    public static fd m52512b(fb fbVar, Provider<NetworkSamplerInterceptor> provider, Provider<NetworkPerfInterceptor> provider2, Provider<PlacesTimeoutInterceptor> provider3) {
        return new fd(fbVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static InterceptorDecorator m52510a(fb fbVar, NetworkSamplerInterceptor networkSamplerInterceptor, NetworkPerfInterceptor networkPerfInterceptor, PlacesTimeoutInterceptor placesTimeoutInterceptor) {
        return (InterceptorDecorator) C15521i.a(fbVar.m40897a(networkSamplerInterceptor, networkPerfInterceptor, placesTimeoutInterceptor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
