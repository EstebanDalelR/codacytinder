package com.tinder.module;

import com.tinder.p071a.C2602d;
import com.tinder.p071a.C3870m;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dz implements Factory<C3870m> {
    /* renamed from: a */
    private final dx f42954a;
    /* renamed from: b */
    private final Provider<C2602d> f42955b;

    public /* synthetic */ Object get() {
        return m52429a();
    }

    public dz(dx dxVar, Provider<C2602d> provider) {
        this.f42954a = dxVar;
        this.f42955b = provider;
    }

    /* renamed from: a */
    public C3870m m52429a() {
        return m52427a(this.f42954a, this.f42955b);
    }

    /* renamed from: a */
    public static C3870m m52427a(dx dxVar, Provider<C2602d> provider) {
        return m52426a(dxVar, (C2602d) provider.get());
    }

    /* renamed from: b */
    public static dz m52428b(dx dxVar, Provider<C2602d> provider) {
        return new dz(dxVar, provider);
    }

    /* renamed from: a */
    public static C3870m m52426a(dx dxVar, C2602d c2602d) {
        return (C3870m) C15521i.a(dxVar.m40875a(c2602d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
