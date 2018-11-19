package com.tinder.module;

import com.tinder.discovery.analytics.C13147g;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ca implements Factory<C13147g> {
    /* renamed from: a */
    private final bs f42848a;

    public /* synthetic */ Object get() {
        return m52232a();
    }

    public ca(bs bsVar) {
        this.f42848a = bsVar;
    }

    /* renamed from: a */
    public C13147g m52232a() {
        return m52229a(this.f42848a);
    }

    /* renamed from: a */
    public static C13147g m52229a(bs bsVar) {
        return m52231c(bsVar);
    }

    /* renamed from: b */
    public static ca m52230b(bs bsVar) {
        return new ca(bsVar);
    }

    /* renamed from: c */
    public static C13147g m52231c(bs bsVar) {
        return (C13147g) C15521i.a(bsVar.m40852o(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
