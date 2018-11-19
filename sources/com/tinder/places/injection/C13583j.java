package com.tinder.places.injection;

import com.tinder.recsgrid.C16487f;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.places.injection.j */
public final class C13583j implements Factory<C16487f> {
    /* renamed from: a */
    private final C10215g f43326a;

    public /* synthetic */ Object get() {
        return m53023a();
    }

    public C13583j(C10215g c10215g) {
        this.f43326a = c10215g;
    }

    /* renamed from: a */
    public C16487f m53023a() {
        return C13583j.m53020a(this.f43326a);
    }

    /* renamed from: a */
    public static C16487f m53020a(C10215g c10215g) {
        return C13583j.m53022c(c10215g);
    }

    /* renamed from: b */
    public static C13583j m53021b(C10215g c10215g) {
        return new C13583j(c10215g);
    }

    /* renamed from: c */
    public static C16487f m53022c(C10215g c10215g) {
        return (C16487f) C15521i.a(c10215g.m41540c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
