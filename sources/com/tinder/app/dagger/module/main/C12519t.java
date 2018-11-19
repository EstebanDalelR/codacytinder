package com.tinder.app.dagger.module.main;

import com.tinder.discovery.domain.C11144b;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.t */
public final class C12519t implements Factory<C11144b> {
    /* renamed from: a */
    private final C8251a f40352a;
    /* renamed from: b */
    private final Provider<DiscoverySegmentRepository> f40353b;

    public /* synthetic */ Object get() {
        return m49271a();
    }

    public C12519t(C8251a c8251a, Provider<DiscoverySegmentRepository> provider) {
        this.f40352a = c8251a;
        this.f40353b = provider;
    }

    /* renamed from: a */
    public C11144b m49271a() {
        return C12519t.m49269a(this.f40352a, this.f40353b);
    }

    /* renamed from: a */
    public static C11144b m49269a(C8251a c8251a, Provider<DiscoverySegmentRepository> provider) {
        return C12519t.m49268a(c8251a, (DiscoverySegmentRepository) provider.get());
    }

    /* renamed from: b */
    public static C12519t m49270b(C8251a c8251a, Provider<DiscoverySegmentRepository> provider) {
        return new C12519t(c8251a, provider);
    }

    /* renamed from: a */
    public static C11144b m49268a(C8251a c8251a, DiscoverySegmentRepository discoverySegmentRepository) {
        return (C11144b) C15521i.a(c8251a.m35207a(discoverySegmentRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
