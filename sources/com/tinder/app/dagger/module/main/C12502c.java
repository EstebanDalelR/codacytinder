package com.tinder.app.dagger.module.main;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.discovery.analytics.C13143a;
import com.tinder.discovery.analytics.C13147g;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.c */
public final class C12502c implements Factory<C13143a> {
    /* renamed from: a */
    private final C8251a f40307a;
    /* renamed from: b */
    private final Provider<DiscoverySegmentNotificationLedger> f40308b;
    /* renamed from: c */
    private final Provider<C2630h> f40309c;
    /* renamed from: d */
    private final Provider<DiscoverySegmentRepository> f40310d;
    /* renamed from: e */
    private final Provider<C13147g> f40311e;
    /* renamed from: f */
    private final Provider<C15679f> f40312f;

    public /* synthetic */ Object get() {
        return m49204a();
    }

    public C12502c(C8251a c8251a, Provider<DiscoverySegmentNotificationLedger> provider, Provider<C2630h> provider2, Provider<DiscoverySegmentRepository> provider3, Provider<C13147g> provider4, Provider<C15679f> provider5) {
        this.f40307a = c8251a;
        this.f40308b = provider;
        this.f40309c = provider2;
        this.f40310d = provider3;
        this.f40311e = provider4;
        this.f40312f = provider5;
    }

    /* renamed from: a */
    public C13143a m49204a() {
        return C12502c.m49202a(this.f40307a, this.f40308b, this.f40309c, this.f40310d, this.f40311e, this.f40312f);
    }

    /* renamed from: a */
    public static C13143a m49202a(C8251a c8251a, Provider<DiscoverySegmentNotificationLedger> provider, Provider<C2630h> provider2, Provider<DiscoverySegmentRepository> provider3, Provider<C13147g> provider4, Provider<C15679f> provider5) {
        return C12502c.m49201a(c8251a, (DiscoverySegmentNotificationLedger) provider.get(), (C2630h) provider2.get(), (DiscoverySegmentRepository) provider3.get(), (C13147g) provider4.get(), (C15679f) provider5.get());
    }

    /* renamed from: b */
    public static C12502c m49203b(C8251a c8251a, Provider<DiscoverySegmentNotificationLedger> provider, Provider<C2630h> provider2, Provider<DiscoverySegmentRepository> provider3, Provider<C13147g> provider4, Provider<C15679f> provider5) {
        return new C12502c(c8251a, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static C13143a m49201a(C8251a c8251a, DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger, C2630h c2630h, DiscoverySegmentRepository discoverySegmentRepository, C13147g c13147g, C15679f c15679f) {
        return (C13143a) C15521i.a(c8251a.m35203a(discoverySegmentNotificationLedger, c2630h, discoverySegmentRepository, c13147g, c15679f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
