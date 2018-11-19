package com.tinder.module;

import com.tinder.data.places.p329a.C10888a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class de implements Factory<C10888a> {
    /* renamed from: a */
    private final bs f42908a;

    public /* synthetic */ Object get() {
        return m52349a();
    }

    public de(bs bsVar) {
        this.f42908a = bsVar;
    }

    /* renamed from: a */
    public C10888a m52349a() {
        return m52346a(this.f42908a);
    }

    /* renamed from: a */
    public static C10888a m52346a(bs bsVar) {
        return m52348c(bsVar);
    }

    /* renamed from: b */
    public static de m52347b(bs bsVar) {
        return new de(bsVar);
    }

    /* renamed from: c */
    public static C10888a m52348c(bs bsVar) {
        return (C10888a) C15521i.a(bsVar.m40834d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
