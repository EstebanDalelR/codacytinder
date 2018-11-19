package com.tinder.app.dagger.module.main;

import com.tinder.discovery.domain.DiscoverySegmentSequencer;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.main.g */
public final class C12506g implements Factory<DiscoverySegmentSequencer> {
    /* renamed from: a */
    private final C8251a f40320a;

    public /* synthetic */ Object get() {
        return m49220a();
    }

    public C12506g(C8251a c8251a) {
        this.f40320a = c8251a;
    }

    /* renamed from: a */
    public DiscoverySegmentSequencer m49220a() {
        return C12506g.m49217a(this.f40320a);
    }

    /* renamed from: a */
    public static DiscoverySegmentSequencer m49217a(C8251a c8251a) {
        return C12506g.m49219c(c8251a);
    }

    /* renamed from: b */
    public static C12506g m49218b(C8251a c8251a) {
        return new C12506g(c8251a);
    }

    /* renamed from: c */
    public static DiscoverySegmentSequencer m49219c(C8251a c8251a) {
        return (DiscoverySegmentSequencer) C15521i.a(c8251a.m35205a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
