package com.tinder.injection.p261a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import rx.C2671a;

/* renamed from: com.tinder.injection.a.d */
public final class C13334d implements Factory<C2671a> {
    /* renamed from: a */
    private final C9707a f42307a;

    public /* synthetic */ Object get() {
        return m51594a();
    }

    /* renamed from: a */
    public C2671a m51594a() {
        return C13334d.m51592a(this.f42307a);
    }

    /* renamed from: a */
    public static C2671a m51592a(C9707a c9707a) {
        return C13334d.m51593b(c9707a);
    }

    /* renamed from: b */
    public static C2671a m51593b(C9707a c9707a) {
        return (C2671a) C15521i.a(c9707a.m40170a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
