package com.tinder.module;

import com.squareup.moshi.C5987p;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class cx implements Factory<C5987p> {
    /* renamed from: a */
    private final bs f42896a;

    public /* synthetic */ Object get() {
        return m52323a();
    }

    public cx(bs bsVar) {
        this.f42896a = bsVar;
    }

    /* renamed from: a */
    public C5987p m52323a() {
        return m52320a(this.f42896a);
    }

    /* renamed from: a */
    public static C5987p m52320a(bs bsVar) {
        return m52322c(bsVar);
    }

    /* renamed from: b */
    public static cx m52321b(bs bsVar) {
        return new cx(bsVar);
    }

    /* renamed from: c */
    public static C5987p m52322c(bs bsVar) {
        return (C5987p) C15521i.a(bsVar.m40846j(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
