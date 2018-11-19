package com.tinder.module;

import com.tinder.analytics.attribution.C3916g;
import com.tinder.analytics.fireworks.BatchScheduleStrategy;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.fireworks.C7322d;
import com.tinder.analytics.fireworks.C7330k;
import com.tinder.analytics.fireworks.FireworksNetworkClient;
import com.tinder.analytics.fireworks.FireworksSyncListener;
import com.tinder.analytics.p153b.C7317d;
import com.tinder.auth.p168c.C10330a;
import com.tinder.pushnotifications.PushReceiveBugInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ai implements Factory<C2630h> {
    /* renamed from: a */
    private final aa f42755a;
    /* renamed from: b */
    private final Provider<C7330k> f42756b;
    /* renamed from: c */
    private final Provider<FireworksNetworkClient> f42757c;
    /* renamed from: d */
    private final Provider<BatchScheduleStrategy> f42758d;
    /* renamed from: e */
    private final Provider<C7322d> f42759e;
    /* renamed from: f */
    private final Provider<C7317d> f42760f;
    /* renamed from: g */
    private final Provider<C3916g> f42761g;
    /* renamed from: h */
    private final Provider<PushReceiveBugInterceptor> f42762h;
    /* renamed from: i */
    private final Provider<C10330a> f42763i;
    /* renamed from: j */
    private final Provider<FireworksSyncListener> f42764j;

    public /* synthetic */ Object get() {
        return m52082a();
    }

    public ai(aa aaVar, Provider<C7330k> provider, Provider<FireworksNetworkClient> provider2, Provider<BatchScheduleStrategy> provider3, Provider<C7322d> provider4, Provider<C7317d> provider5, Provider<C3916g> provider6, Provider<PushReceiveBugInterceptor> provider7, Provider<C10330a> provider8, Provider<FireworksSyncListener> provider9) {
        this.f42755a = aaVar;
        this.f42756b = provider;
        this.f42757c = provider2;
        this.f42758d = provider3;
        this.f42759e = provider4;
        this.f42760f = provider5;
        this.f42761g = provider6;
        this.f42762h = provider7;
        this.f42763i = provider8;
        this.f42764j = provider9;
    }

    /* renamed from: a */
    public C2630h m52082a() {
        return m52080a(this.f42755a, this.f42756b, this.f42757c, this.f42758d, this.f42759e, this.f42760f, this.f42761g, this.f42762h, this.f42763i, this.f42764j);
    }

    /* renamed from: a */
    public static C2630h m52080a(aa aaVar, Provider<C7330k> provider, Provider<FireworksNetworkClient> provider2, Provider<BatchScheduleStrategy> provider3, Provider<C7322d> provider4, Provider<C7317d> provider5, Provider<C3916g> provider6, Provider<PushReceiveBugInterceptor> provider7, Provider<C10330a> provider8, Provider<FireworksSyncListener> provider9) {
        return m52079a(aaVar, (C7330k) provider.get(), (FireworksNetworkClient) provider2.get(), (BatchScheduleStrategy) provider3.get(), (C7322d) provider4.get(), (C7317d) provider5.get(), (C3916g) provider6.get(), (PushReceiveBugInterceptor) provider7.get(), (C10330a) provider8.get(), (FireworksSyncListener) provider9.get());
    }

    /* renamed from: b */
    public static ai m52081b(aa aaVar, Provider<C7330k> provider, Provider<FireworksNetworkClient> provider2, Provider<BatchScheduleStrategy> provider3, Provider<C7322d> provider4, Provider<C7317d> provider5, Provider<C3916g> provider6, Provider<PushReceiveBugInterceptor> provider7, Provider<C10330a> provider8, Provider<FireworksSyncListener> provider9) {
        return new ai(aaVar, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: a */
    public static C2630h m52079a(aa aaVar, C7330k c7330k, FireworksNetworkClient fireworksNetworkClient, BatchScheduleStrategy batchScheduleStrategy, C7322d c7322d, C7317d c7317d, C3916g c3916g, PushReceiveBugInterceptor pushReceiveBugInterceptor, C10330a c10330a, FireworksSyncListener fireworksSyncListener) {
        return (C2630h) C15521i.a(aaVar.m40768a(c7330k, fireworksNetworkClient, batchScheduleStrategy, c7322d, c7317d, c3916g, pushReceiveBugInterceptor, c10330a, fireworksSyncListener), "Cannot return null from a non-@Nullable @Provides method");
    }
}
