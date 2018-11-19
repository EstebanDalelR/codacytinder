package com.tinder.di;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import rx.C2671a;

/* renamed from: com.tinder.di.m */
public final class C13140m implements Factory<C2671a> {
    /* renamed from: a */
    private final C8842l f41799a;

    public /* synthetic */ Object get() {
        return m51055a();
    }

    public C13140m(C8842l c8842l) {
        this.f41799a = c8842l;
    }

    /* renamed from: a */
    public C2671a m51055a() {
        return (C2671a) C15521i.a(this.f41799a.m37601a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13140m m51054a(C8842l c8842l) {
        return new C13140m(c8842l);
    }
}
