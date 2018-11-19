package com.tinder.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.concurrent.CyclicBarrier;

public final class ag implements Factory<CyclicBarrier> {
    /* renamed from: a */
    private final aa f42752a;

    public /* synthetic */ Object get() {
        return m52075a();
    }

    public ag(aa aaVar) {
        this.f42752a = aaVar;
    }

    /* renamed from: a */
    public CyclicBarrier m52075a() {
        return m52072a(this.f42752a);
    }

    /* renamed from: a */
    public static CyclicBarrier m52072a(aa aaVar) {
        return m52074c(aaVar);
    }

    /* renamed from: b */
    public static ag m52073b(aa aaVar) {
        return new ag(aaVar);
    }

    /* renamed from: c */
    public static CyclicBarrier m52074c(aa aaVar) {
        return (CyclicBarrier) C15521i.a(aaVar.m40779e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
