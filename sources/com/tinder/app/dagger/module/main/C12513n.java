package com.tinder.app.dagger.module.main;

import com.tinder.places.p156a.C7343b;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.main.n */
public final class C12513n implements Factory<C7343b> {
    /* renamed from: a */
    private final C8251a f40337a;

    public /* synthetic */ Object get() {
        return m49248a();
    }

    public C12513n(C8251a c8251a) {
        this.f40337a = c8251a;
    }

    /* renamed from: a */
    public C7343b m49248a() {
        return C12513n.m49245a(this.f40337a);
    }

    /* renamed from: a */
    public static C7343b m49245a(C8251a c8251a) {
        return C12513n.m49247c(c8251a);
    }

    /* renamed from: b */
    public static C12513n m49246b(C8251a c8251a) {
        return new C12513n(c8251a);
    }

    /* renamed from: c */
    public static C7343b m49247c(C8251a c8251a) {
        return (C7343b) C15521i.a(c8251a.m35214c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
