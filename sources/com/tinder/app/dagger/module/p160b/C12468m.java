package com.tinder.app.dagger.module.p160b;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.fireboarding.domain.C11804j;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.m */
public final class C12468m implements Factory<C11804j> {
    /* renamed from: a */
    private final C8245a f40222a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f40223b;
    /* renamed from: c */
    private final Provider<RecsFirstInserted> f40224c;

    public /* synthetic */ Object get() {
        return m49047a();
    }

    public C12468m(C8245a c8245a, Provider<RecsEngineRegistry> provider, Provider<RecsFirstInserted> provider2) {
        this.f40222a = c8245a;
        this.f40223b = provider;
        this.f40224c = provider2;
    }

    /* renamed from: a */
    public C11804j m49047a() {
        return C12468m.m49045a(this.f40222a, this.f40223b, this.f40224c);
    }

    /* renamed from: a */
    public static C11804j m49045a(C8245a c8245a, Provider<RecsEngineRegistry> provider, Provider<RecsFirstInserted> provider2) {
        return C12468m.m49044a(c8245a, (RecsEngineRegistry) provider.get(), (RecsFirstInserted) provider2.get());
    }

    /* renamed from: b */
    public static C12468m m49046b(C8245a c8245a, Provider<RecsEngineRegistry> provider, Provider<RecsFirstInserted> provider2) {
        return new C12468m(c8245a, provider, provider2);
    }

    /* renamed from: a */
    public static C11804j m49044a(C8245a c8245a, RecsEngineRegistry recsEngineRegistry, RecsFirstInserted recsFirstInserted) {
        return (C11804j) C15521i.a(c8245a.m35166a(recsEngineRegistry, recsFirstInserted), "Cannot return null from a non-@Nullable @Provides method");
    }
}
