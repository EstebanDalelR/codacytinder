package com.tinder.app.dagger.module.toppicks;

import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.toppicks.n */
public final class C12544n implements Factory<C15453a> {
    /* renamed from: a */
    private final C8254a f40412a;

    public /* synthetic */ Object get() {
        return m49366a();
    }

    /* renamed from: a */
    public C15453a m49366a() {
        return C12544n.m49364a(this.f40412a);
    }

    /* renamed from: a */
    public static C15453a m49364a(C8254a c8254a) {
        return C12544n.m49365b(c8254a);
    }

    /* renamed from: b */
    public static C15453a m49365b(C8254a c8254a) {
        return (C15453a) C15521i.a(c8254a.m35238c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
