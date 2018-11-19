package com.tinder.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.common.logger.Logger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

public final class ff implements Factory<NetworkPerfInterceptor> {
    /* renamed from: a */
    private final fe f43015a;
    /* renamed from: b */
    private final Provider<Set<NetworkPerfInspector>> f43016b;
    /* renamed from: c */
    private final Provider<C2630h> f43017c;
    /* renamed from: d */
    private final Provider<ResponseErrorAdapter> f43018d;
    /* renamed from: e */
    private final Provider<Logger> f43019e;

    public /* synthetic */ Object get() {
        return m52517a();
    }

    public ff(fe feVar, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        this.f43015a = feVar;
        this.f43016b = provider;
        this.f43017c = provider2;
        this.f43018d = provider3;
        this.f43019e = provider4;
    }

    /* renamed from: a */
    public NetworkPerfInterceptor m52517a() {
        return m52515a(this.f43015a, this.f43016b, this.f43017c, this.f43018d, this.f43019e);
    }

    /* renamed from: a */
    public static NetworkPerfInterceptor m52515a(fe feVar, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return m52514a(feVar, (Set) provider.get(), (C2630h) provider2.get(), (ResponseErrorAdapter) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static ff m52516b(fe feVar, Provider<Set<NetworkPerfInspector>> provider, Provider<C2630h> provider2, Provider<ResponseErrorAdapter> provider3, Provider<Logger> provider4) {
        return new ff(feVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static NetworkPerfInterceptor m52514a(fe feVar, Set<NetworkPerfInspector> set, C2630h c2630h, ResponseErrorAdapter responseErrorAdapter, Logger logger) {
        return (NetworkPerfInterceptor) C15521i.a(feVar.m40899a(set, c2630h, responseErrorAdapter, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
