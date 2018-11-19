package com.tinder.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.concurrent.CyclicBarrier;

public final class af implements Factory<CyclicBarrier> {
    /* renamed from: a */
    private final aa f42751a;

    public /* synthetic */ Object get() {
        return m52071a();
    }

    public af(aa aaVar) {
        this.f42751a = aaVar;
    }

    /* renamed from: a */
    public CyclicBarrier m52071a() {
        return m52068a(this.f42751a);
    }

    /* renamed from: a */
    public static CyclicBarrier m52068a(aa aaVar) {
        return m52070c(aaVar);
    }

    /* renamed from: b */
    public static af m52069b(aa aaVar) {
        return new af(aaVar);
    }

    /* renamed from: c */
    public static CyclicBarrier m52070c(aa aaVar) {
        return (CyclicBarrier) C15521i.a(aaVar.m40778d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
