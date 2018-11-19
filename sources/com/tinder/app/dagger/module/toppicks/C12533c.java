package com.tinder.app.dagger.module.toppicks;

import com.tinder.recsgrid.C14782d;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.toppicks.c */
public final class C12533c implements Factory<C14782d> {
    /* renamed from: a */
    private final C8254a f40388a;

    public /* synthetic */ Object get() {
        return m49323a();
    }

    public C12533c(C8254a c8254a) {
        this.f40388a = c8254a;
    }

    /* renamed from: a */
    public C14782d m49323a() {
        return C12533c.m49320a(this.f40388a);
    }

    /* renamed from: a */
    public static C14782d m49320a(C8254a c8254a) {
        return C12533c.m49322c(c8254a);
    }

    /* renamed from: b */
    public static C12533c m49321b(C8254a c8254a) {
        return new C12533c(c8254a);
    }

    /* renamed from: c */
    public static C14782d m49322c(C8254a c8254a) {
        return (C14782d) C15521i.a(c8254a.m35239d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
