package com.tinder.module;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class br implements Factory<RecsEngine> {
    /* renamed from: a */
    private final FastMatchModule f42827a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f42828b;

    public /* synthetic */ Object get() {
        return m52196a();
    }

    /* renamed from: a */
    public RecsEngine m52196a() {
        return m52195a(this.f42827a, this.f42828b);
    }

    /* renamed from: a */
    public static RecsEngine m52195a(FastMatchModule fastMatchModule, Provider<RecsEngineRegistry> provider) {
        return m52194a(fastMatchModule, (RecsEngineRegistry) provider.get());
    }

    /* renamed from: a */
    public static RecsEngine m52194a(FastMatchModule fastMatchModule, RecsEngineRegistry recsEngineRegistry) {
        return (RecsEngine) C15521i.a(fastMatchModule.m40760a(recsEngineRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }
}
