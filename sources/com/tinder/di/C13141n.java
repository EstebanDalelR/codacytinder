package com.tinder.di;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import rx.C2671a;

/* renamed from: com.tinder.di.n */
public final class C13141n implements Factory<C2671a> {
    /* renamed from: a */
    private final C8842l f41800a;

    public /* synthetic */ Object get() {
        return m51057a();
    }

    public C13141n(C8842l c8842l) {
        this.f41800a = c8842l;
    }

    /* renamed from: a */
    public C2671a m51057a() {
        return (C2671a) C15521i.a(this.f41800a.m37602b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13141n m51056a(C8842l c8842l) {
        return new C13141n(c8842l);
    }
}
