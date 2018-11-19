package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11816q;
import com.tinder.fireboarding.domain.C9562d;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.t */
public final class C12475t implements Factory<C11816q> {
    /* renamed from: a */
    private final C8245a f40237a;
    /* renamed from: b */
    private final Provider<C11809n> f40238b;
    /* renamed from: c */
    private final Provider<C9562d> f40239c;
    /* renamed from: d */
    private final Provider<C11811o> f40240d;

    public /* synthetic */ Object get() {
        return m49074a();
    }

    public C12475t(C8245a c8245a, Provider<C11809n> provider, Provider<C9562d> provider2, Provider<C11811o> provider3) {
        this.f40237a = c8245a;
        this.f40238b = provider;
        this.f40239c = provider2;
        this.f40240d = provider3;
    }

    /* renamed from: a */
    public C11816q m49074a() {
        return C12475t.m49072a(this.f40237a, this.f40238b, this.f40239c, this.f40240d);
    }

    /* renamed from: a */
    public static C11816q m49072a(C8245a c8245a, Provider<C11809n> provider, Provider<C9562d> provider2, Provider<C11811o> provider3) {
        return C12475t.m49071a(c8245a, (C11809n) provider.get(), (C9562d) provider2.get(), (C11811o) provider3.get());
    }

    /* renamed from: b */
    public static C12475t m49073b(C8245a c8245a, Provider<C11809n> provider, Provider<C9562d> provider2, Provider<C11811o> provider3) {
        return new C12475t(c8245a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C11816q m49071a(C8245a c8245a, C11809n c11809n, C9562d c9562d, C11811o c11811o) {
        return (C11816q) C15521i.a(c8245a.m35170a(c11809n, c9562d, c11811o), "Cannot return null from a non-@Nullable @Provides method");
    }
}
