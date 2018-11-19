package com.tinder.injection.p261a;

import com.tinder.common.reactivex.schedulers.Schedulers;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.injection.a.b */
public final class C13332b implements Factory<Schedulers> {
    /* renamed from: a */
    private final C9707a f42305a;

    public /* synthetic */ Object get() {
        return m51587a();
    }

    public C13332b(C9707a c9707a) {
        this.f42305a = c9707a;
    }

    /* renamed from: a */
    public Schedulers m51587a() {
        return C13332b.m51584a(this.f42305a);
    }

    /* renamed from: a */
    public static Schedulers m51584a(C9707a c9707a) {
        return C13332b.m51586c(c9707a);
    }

    /* renamed from: b */
    public static C13332b m51585b(C9707a c9707a) {
        return new C13332b(c9707a);
    }

    /* renamed from: c */
    public static Schedulers m51586c(C9707a c9707a) {
        return (Schedulers) C15521i.a(c9707a.m40172c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
