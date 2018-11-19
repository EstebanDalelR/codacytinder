package com.tinder.app.dagger.module.main;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.discovery.analytics.C11131k;
import com.tinder.discovery.analytics.C13143a;
import com.tinder.discovery.analytics.C8881i;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.p */
public final class C12515p implements Factory<C11131k> {
    /* renamed from: a */
    private final C8251a f40340a;
    /* renamed from: b */
    private final Provider<C8881i> f40341b;
    /* renamed from: c */
    private final Provider<C2630h> f40342c;
    /* renamed from: d */
    private final Provider<C13143a> f40343d;
    /* renamed from: e */
    private final Provider<DiscoverySegmentRepository> f40344e;
    /* renamed from: f */
    private final Provider<C15679f> f40345f;

    public /* synthetic */ Object get() {
        return m49256a();
    }

    public C12515p(C8251a c8251a, Provider<C8881i> provider, Provider<C2630h> provider2, Provider<C13143a> provider3, Provider<DiscoverySegmentRepository> provider4, Provider<C15679f> provider5) {
        this.f40340a = c8251a;
        this.f40341b = provider;
        this.f40342c = provider2;
        this.f40343d = provider3;
        this.f40344e = provider4;
        this.f40345f = provider5;
    }

    /* renamed from: a */
    public C11131k m49256a() {
        return C12515p.m49254a(this.f40340a, this.f40341b, this.f40342c, this.f40343d, this.f40344e, this.f40345f);
    }

    /* renamed from: a */
    public static C11131k m49254a(C8251a c8251a, Provider<C8881i> provider, Provider<C2630h> provider2, Provider<C13143a> provider3, Provider<DiscoverySegmentRepository> provider4, Provider<C15679f> provider5) {
        return C12515p.m49253a(c8251a, (C8881i) provider.get(), (C2630h) provider2.get(), (C13143a) provider3.get(), (DiscoverySegmentRepository) provider4.get(), (C15679f) provider5.get());
    }

    /* renamed from: b */
    public static C12515p m49255b(C8251a c8251a, Provider<C8881i> provider, Provider<C2630h> provider2, Provider<C13143a> provider3, Provider<DiscoverySegmentRepository> provider4, Provider<C15679f> provider5) {
        return new C12515p(c8251a, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static C11131k m49253a(C8251a c8251a, C8881i c8881i, C2630h c2630h, C13143a c13143a, DiscoverySegmentRepository discoverySegmentRepository, C15679f c15679f) {
        return (C11131k) C15521i.a(c8251a.m35204a(c8881i, c2630h, c13143a, discoverySegmentRepository, c15679f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
