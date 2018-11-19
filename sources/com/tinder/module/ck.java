package com.tinder.module;

import com.tinder.discovery.domain.DiscoverySegmentDataStore;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ck implements Factory<DiscoverySegmentRepository> {
    /* renamed from: a */
    private final bs f42867a;
    /* renamed from: b */
    private final Provider<DiscoverySegmentDataStore> f42868b;

    public /* synthetic */ Object get() {
        return m52272a();
    }

    public ck(bs bsVar, Provider<DiscoverySegmentDataStore> provider) {
        this.f42867a = bsVar;
        this.f42868b = provider;
    }

    /* renamed from: a */
    public DiscoverySegmentRepository m52272a() {
        return m52270a(this.f42867a, this.f42868b);
    }

    /* renamed from: a */
    public static DiscoverySegmentRepository m52270a(bs bsVar, Provider<DiscoverySegmentDataStore> provider) {
        return m52269a(bsVar, (DiscoverySegmentDataStore) provider.get());
    }

    /* renamed from: b */
    public static ck m52271b(bs bsVar, Provider<DiscoverySegmentDataStore> provider) {
        return new ck(bsVar, provider);
    }

    /* renamed from: a */
    public static DiscoverySegmentRepository m52269a(bs bsVar, DiscoverySegmentDataStore discoverySegmentDataStore) {
        return (DiscoverySegmentRepository) C15521i.a(bsVar.m40808a(discoverySegmentDataStore), "Cannot return null from a non-@Nullable @Provides method");
    }
}
