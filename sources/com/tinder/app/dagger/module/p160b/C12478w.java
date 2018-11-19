package com.tinder.app.dagger.module.p160b;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.fireboarding.domain.C11820s;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.w */
public final class C12478w implements Factory<C11820s> {
    /* renamed from: a */
    private final C8245a f40245a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f40246b;

    public /* synthetic */ Object get() {
        return m49086a();
    }

    public C12478w(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        this.f40245a = c8245a;
        this.f40246b = provider;
    }

    /* renamed from: a */
    public C11820s m49086a() {
        return C12478w.m49084a(this.f40245a, this.f40246b);
    }

    /* renamed from: a */
    public static C11820s m49084a(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return C12478w.m49083a(c8245a, (RecsEngineRegistry) provider.get());
    }

    /* renamed from: b */
    public static C12478w m49085b(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return new C12478w(c8245a, provider);
    }

    /* renamed from: a */
    public static C11820s m49083a(C8245a c8245a, RecsEngineRegistry recsEngineRegistry) {
        return (C11820s) C15521i.a(c8245a.m35182c(recsEngineRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }
}
