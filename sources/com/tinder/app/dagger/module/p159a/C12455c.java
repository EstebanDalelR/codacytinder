package com.tinder.app.dagger.module.p159a;

import com.tinder.discovery.analytics.C11125b;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import com.tinder.discovery.view.DiscoveryTabView;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.a.c */
public final class C12455c implements Factory<DiscoveryTooltipOwner> {
    /* renamed from: a */
    private final C8243a f40159a;
    /* renamed from: b */
    private final Provider<DiscoveryTabView> f40160b;
    /* renamed from: c */
    private final Provider<C11125b> f40161c;
    /* renamed from: d */
    private final Provider<DiscoverySegmentNotificationLedger> f40162d;

    public /* synthetic */ Object get() {
        return m48960a();
    }

    public C12455c(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        this.f40159a = c8243a;
        this.f40160b = provider;
        this.f40161c = provider2;
        this.f40162d = provider3;
    }

    /* renamed from: a */
    public DiscoveryTooltipOwner m48960a() {
        return C12455c.m48958a(this.f40159a, this.f40160b, this.f40161c, this.f40162d);
    }

    /* renamed from: a */
    public static DiscoveryTooltipOwner m48958a(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        return C12455c.m48957a(c8243a, C17281c.b(provider), (C11125b) provider2.get(), (DiscoverySegmentNotificationLedger) provider3.get());
    }

    /* renamed from: b */
    public static C12455c m48959b(C8243a c8243a, Provider<DiscoveryTabView> provider, Provider<C11125b> provider2, Provider<DiscoverySegmentNotificationLedger> provider3) {
        return new C12455c(c8243a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static DiscoveryTooltipOwner m48957a(C8243a c8243a, Lazy<DiscoveryTabView> lazy, C11125b c11125b, DiscoverySegmentNotificationLedger discoverySegmentNotificationLedger) {
        return (DiscoveryTooltipOwner) C15521i.a(c8243a.m35141b(lazy, c11125b, discoverySegmentNotificationLedger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
