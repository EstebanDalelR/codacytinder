package com.tinder.app.dagger.module.p160b;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.u */
public final class C12476u implements Factory<RecsFirstInserted> {
    /* renamed from: a */
    private final C8245a f40241a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f40242b;

    public /* synthetic */ Object get() {
        return m49078a();
    }

    public C12476u(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        this.f40241a = c8245a;
        this.f40242b = provider;
    }

    /* renamed from: a */
    public RecsFirstInserted m49078a() {
        return C12476u.m49076a(this.f40241a, this.f40242b);
    }

    /* renamed from: a */
    public static RecsFirstInserted m49076a(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return C12476u.m49075a(c8245a, (RecsEngineRegistry) provider.get());
    }

    /* renamed from: b */
    public static C12476u m49077b(C8245a c8245a, Provider<RecsEngineRegistry> provider) {
        return new C12476u(c8245a, provider);
    }

    /* renamed from: a */
    public static RecsFirstInserted m49075a(C8245a c8245a, RecsEngineRegistry recsEngineRegistry) {
        return (RecsFirstInserted) C15521i.a(c8245a.m35181b(recsEngineRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }
}
