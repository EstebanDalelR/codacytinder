package com.tinder.app.dagger.module.p160b;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.fireboarding.domain.C11817r;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.v */
public final class C12477v implements Factory<C11817r> {
    /* renamed from: a */
    private final C8245a f40243a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f40244b;

    public /* synthetic */ Object get() {
        return m49082a();
    }

    public C12477v(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        this.f40243a = c8245a;
        this.f40244b = provider;
    }

    /* renamed from: a */
    public C11817r m49082a() {
        return C12477v.m49080a(this.f40243a, this.f40244b);
    }

    /* renamed from: a */
    public static C11817r m49080a(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return C12477v.m49079a(c8245a, (RecsEngineRegistry) provider.get());
    }

    /* renamed from: b */
    public static C12477v m49081b(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return new C12477v(c8245a, provider);
    }

    /* renamed from: a */
    public static C11817r m49079a(C8245a c8245a, RecsEngineRegistry recsEngineRegistry) {
        return (C11817r) C15521i.a(c8245a.m35171a(recsEngineRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }
}
