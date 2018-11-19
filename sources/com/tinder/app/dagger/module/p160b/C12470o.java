package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11808l;
import com.tinder.fireboarding.domain.C11809n;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.o */
public final class C12470o implements Factory<C11808l> {
    /* renamed from: a */
    private final C8245a f40227a;
    /* renamed from: b */
    private final Provider<C11809n> f40228b;

    public /* synthetic */ Object get() {
        return m49055a();
    }

    public C12470o(C8245a c8245a, Provider<C11809n> provider) {
        this.f40227a = c8245a;
        this.f40228b = provider;
    }

    /* renamed from: a */
    public C11808l m49055a() {
        return C12470o.m49053a(this.f40227a, this.f40228b);
    }

    /* renamed from: a */
    public static C11808l m49053a(C8245a c8245a, Provider<C11809n> provider) {
        return C12470o.m49052a(c8245a, (C11809n) provider.get());
    }

    /* renamed from: b */
    public static C12470o m49054b(C8245a c8245a, Provider<C11809n> provider) {
        return new C12470o(c8245a, provider);
    }

    /* renamed from: a */
    public static C11808l m49052a(C8245a c8245a, C11809n c11809n) {
        return (C11808l) C15521i.a(c8245a.m35168a(c11809n), "Cannot return null from a non-@Nullable @Provides method");
    }
}
