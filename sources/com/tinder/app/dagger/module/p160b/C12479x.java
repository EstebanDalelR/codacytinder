package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11823t;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.x */
public final class C12479x implements Factory<C11823t> {
    /* renamed from: a */
    private final C8245a f40247a;
    /* renamed from: b */
    private final Provider<C11809n> f40248b;
    /* renamed from: c */
    private final Provider<RecsFirstInserted> f40249c;
    /* renamed from: d */
    private final Provider<C11811o> f40250d;

    public /* synthetic */ Object get() {
        return m49090a();
    }

    public C12479x(C8245a c8245a, Provider<C11809n> provider, Provider<RecsFirstInserted> provider2, Provider<C11811o> provider3) {
        this.f40247a = c8245a;
        this.f40248b = provider;
        this.f40249c = provider2;
        this.f40250d = provider3;
    }

    /* renamed from: a */
    public C11823t m49090a() {
        return C12479x.m49088a(this.f40247a, this.f40248b, this.f40249c, this.f40250d);
    }

    /* renamed from: a */
    public static C11823t m49088a(C8245a c8245a, Provider<C11809n> provider, Provider<RecsFirstInserted> provider2, Provider<C11811o> provider3) {
        return C12479x.m49087a(c8245a, (C11809n) provider.get(), (RecsFirstInserted) provider2.get(), (C11811o) provider3.get());
    }

    /* renamed from: b */
    public static C12479x m49089b(C8245a c8245a, Provider<C11809n> provider, Provider<RecsFirstInserted> provider2, Provider<C11811o> provider3) {
        return new C12479x(c8245a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C11823t m49087a(C8245a c8245a, C11809n c11809n, RecsFirstInserted recsFirstInserted, C11811o c11811o) {
        return (C11823t) C15521i.a(c8245a.m35172a(c11809n, recsFirstInserted, c11811o), "Cannot return null from a non-@Nullable @Provides method");
    }
}
