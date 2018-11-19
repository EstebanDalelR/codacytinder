package com.tinder.places.injection;

import com.tinder.recsgrid.C14782d;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.places.injection.h */
public final class C13581h implements Factory<C14782d> {
    /* renamed from: a */
    private final C10215g f43323a;

    public /* synthetic */ Object get() {
        return m53015a();
    }

    public C13581h(C10215g c10215g) {
        this.f43323a = c10215g;
    }

    /* renamed from: a */
    public C14782d m53015a() {
        return C13581h.m53012a(this.f43323a);
    }

    /* renamed from: a */
    public static C14782d m53012a(C10215g c10215g) {
        return C13581h.m53014c(c10215g);
    }

    /* renamed from: b */
    public static C13581h m53013b(C10215g c10215g) {
        return new C13581h(c10215g);
    }

    /* renamed from: c */
    public static C14782d m53014c(C10215g c10215g) {
        return (C14782d) C15521i.a(c10215g.m41539b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
