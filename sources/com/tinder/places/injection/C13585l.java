package com.tinder.places.injection;

import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.places.injection.l */
public final class C13585l implements Factory<C15453a> {
    /* renamed from: a */
    private final C10215g f43329a;

    public /* synthetic */ Object get() {
        return m53031a();
    }

    public C13585l(C10215g c10215g) {
        this.f43329a = c10215g;
    }

    /* renamed from: a */
    public C15453a m53031a() {
        return C13585l.m53028a(this.f43329a);
    }

    /* renamed from: a */
    public static C15453a m53028a(C10215g c10215g) {
        return C13585l.m53030c(c10215g);
    }

    /* renamed from: b */
    public static C13585l m53029b(C10215g c10215g) {
        return new C13585l(c10215g);
    }

    /* renamed from: c */
    public static C15453a m53030c(C10215g c10215g) {
        return (C15453a) C15521i.a(c10215g.m41537a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
