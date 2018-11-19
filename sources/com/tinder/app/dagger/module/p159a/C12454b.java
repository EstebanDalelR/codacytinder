package com.tinder.app.dagger.module.p159a;

import com.tinder.discovery.analytics.C11125b;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.discovery.view.DiscoveryTabView;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.a.b */
public final class C12454b implements Factory<C8891a> {
    /* renamed from: a */
    private final C8243a f40155a;
    /* renamed from: b */
    private final Provider<DiscoveryTabView> f40156b;
    /* renamed from: c */
    private final Provider<C11125b> f40157c;
    /* renamed from: d */
    private final Provider<DiscoverySegmentNotificationLedger> f40158d;

    public /* synthetic */ Object get() {
        return m48956a();
    }

    public C12454b(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        this.f40155a = c8243a;
        this.f40156b = provider;
        this.f40157c = provider2;
        this.f40158d = provider3;
    }

    /* renamed from: a */
    public C8891a m48956a() {
        return C12454b.m48954a(this.f40155a, this.f40156b, this.f40157c, this.f40158d);
    }

    /* renamed from: a */
    public static C8891a m48954a(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        return C12454b.m48953a(c8243a, C17281c.b(provider), (C11125b) provider2.get(), (DiscoverySegmentNotificationLedger) provider3.get());
    }

    /* renamed from: b */
    public static C12454b m48955b(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        return new C12454b(c8243a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C8891a m48953a(C8243a c8243a, Lazy<DiscoveryTabView> lazy, C11125b c11125b, DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        return (C8891a) C15521i.a(c8243a.m35139a(lazy, c11125b, discoverySegmentNotificationLedger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
