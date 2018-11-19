package com.tinder.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.discovery.analytics.C13147g;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.d */
public final class C8002d implements Factory<C8000b> {
    /* renamed from: a */
    private final Provider<CurrentScreenTracker> f28622a;
    /* renamed from: b */
    private final Provider<DiscoverySegmentRepository> f28623b;
    /* renamed from: c */
    private final Provider<C13147g> f28624c;
    /* renamed from: d */
    private final Provider<C2630h> f28625d;
    /* renamed from: e */
    private final Provider<Schedulers> f28626e;

    public /* synthetic */ Object get() {
        return m33900a();
    }

    public C8002d(Provider<CurrentScreenTracker> provider, Provider<DiscoverySegmentRepository> provider2, Provider<C13147g> provider3, Provider<C2630h> provider4, Provider<Schedulers> provider5) {
        this.f28622a = provider;
        this.f28623b = provider2;
        this.f28624c = provider3;
        this.f28625d = provider4;
        this.f28626e = provider5;
    }

    /* renamed from: a */
    public C8000b m33900a() {
        return C8002d.m33898a(this.f28622a, this.f28623b, this.f28624c, this.f28625d, this.f28626e);
    }

    /* renamed from: a */
    public static C8000b m33898a(Provider<CurrentScreenTracker> provider, Provider<DiscoverySegmentRepository> provider2, Provider<C13147g> provider3, Provider<C2630h> provider4, Provider<Schedulers> provider5) {
        return new C8000b((CurrentScreenTracker) provider.get(), (DiscoverySegmentRepository) provider2.get(), (C13147g) provider3.get(), (C2630h) provider4.get(), (Schedulers) provider5.get());
    }

    /* renamed from: b */
    public static C8002d m33899b(Provider<CurrentScreenTracker> provider, Provider<DiscoverySegmentRepository> provider2, Provider<C13147g> provider3, Provider<C2630h> provider4, Provider<Schedulers> provider5) {
        return new C8002d(provider, provider2, provider3, provider4, provider5);
    }
}
