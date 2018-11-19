package com.tinder.app.dagger.module.main;

import com.tinder.discovery.domain.C11143a;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.domain.DiscoverySegmentSequencer;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.l */
public final class C12511l implements Factory<C11143a> {
    /* renamed from: a */
    private final C8251a f40333a;
    /* renamed from: b */
    private final Provider<DiscoverySegmentRepository> f40334b;
    /* renamed from: c */
    private final Provider<DiscoverySegmentSequencer> f40335c;

    public /* synthetic */ Object get() {
        return m49240a();
    }

    public C12511l(C8251a c8251a, Provider<DiscoverySegmentRepository> provider, Provider<DiscoverySegmentSequencer> provider2) {
        this.f40333a = c8251a;
        this.f40334b = provider;
        this.f40335c = provider2;
    }

    /* renamed from: a */
    public C11143a m49240a() {
        return C12511l.m49238a(this.f40333a, this.f40334b, this.f40335c);
    }

    /* renamed from: a */
    public static C11143a m49238a(C8251a c8251a, Provider<DiscoverySegmentRepository> provider, Provider<DiscoverySegmentSequencer> provider2) {
        return C12511l.m49237a(c8251a, (DiscoverySegmentRepository) provider.get(), (DiscoverySegmentSequencer) provider2.get());
    }

    /* renamed from: b */
    public static C12511l m49239b(C8251a c8251a, Provider<DiscoverySegmentRepository> provider, Provider<DiscoverySegmentSequencer> provider2) {
        return new C12511l(c8251a, provider, provider2);
    }

    /* renamed from: a */
    public static C11143a m49237a(C8251a c8251a, DiscoverySegmentRepository discoverySegmentRepository, DiscoverySegmentSequencer discoverySegmentSequencer) {
        return (C11143a) C15521i.a(c8251a.m35206a(discoverySegmentRepository, discoverySegmentSequencer), "Cannot return null from a non-@Nullable @Provides method");
    }
}
