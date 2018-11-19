package com.tinder.module;

import com.tinder.purchase.billing.C14484a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ax implements Factory<C14484a> {
    /* renamed from: a */
    private final au f42791a;

    public /* synthetic */ Object get() {
        return m52134a();
    }

    public ax(au auVar) {
        this.f42791a = auVar;
    }

    /* renamed from: a */
    public C14484a m52134a() {
        return m52131a(this.f42791a);
    }

    /* renamed from: a */
    public static C14484a m52131a(au auVar) {
        return m52133c(auVar);
    }

    /* renamed from: b */
    public static ax m52132b(au auVar) {
        return new ax(auVar);
    }

    /* renamed from: c */
    public static C14484a m52133c(au auVar) {
        return (C14484a) C15521i.a(auVar.m40788c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
