package com.tinder.app.dagger.module.toppicks;

import com.tinder.recsgrid.C16487f;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.toppicks.e */
public final class C12535e implements Factory<C16487f> {
    /* renamed from: a */
    private final C8254a f40391a;

    public /* synthetic */ Object get() {
        return m49331a();
    }

    public C12535e(C8254a c8254a) {
        this.f40391a = c8254a;
    }

    /* renamed from: a */
    public C16487f m49331a() {
        return C12535e.m49328a(this.f40391a);
    }

    /* renamed from: a */
    public static C16487f m49328a(C8254a c8254a) {
        return C12535e.m49330c(c8254a);
    }

    /* renamed from: b */
    public static C12535e m49329b(C8254a c8254a) {
        return new C12535e(c8254a);
    }

    /* renamed from: c */
    public static C16487f m49330c(C8254a c8254a) {
        return (C16487f) C15521i.a(c8254a.m35240e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
