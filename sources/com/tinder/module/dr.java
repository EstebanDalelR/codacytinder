package com.tinder.module;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class dr implements Factory<BriteDatabase> {
    /* renamed from: a */
    private final bs f42939a;

    public /* synthetic */ Object get() {
        return m52401a();
    }

    public dr(bs bsVar) {
        this.f42939a = bsVar;
    }

    /* renamed from: a */
    public BriteDatabase m52401a() {
        return m52398a(this.f42939a);
    }

    /* renamed from: a */
    public static BriteDatabase m52398a(bs bsVar) {
        return m52400c(bsVar);
    }

    /* renamed from: b */
    public static dr m52399b(bs bsVar) {
        return new dr(bsVar);
    }

    /* renamed from: c */
    public static BriteDatabase m52400c(bs bsVar) {
        return (BriteDatabase) C15521i.a(bsVar.m40841h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
