package com.tinder.fastmatch;

import com.tinder.recsgrid.C16487f;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.fastmatch.h */
public final class C13194h implements Factory<C16487f> {
    /* renamed from: a */
    private final C9370a f41895a;

    public /* synthetic */ Object get() {
        return m51165a();
    }

    public C13194h(C9370a c9370a) {
        this.f41895a = c9370a;
    }

    /* renamed from: a */
    public C16487f m51165a() {
        return C13194h.m51162a(this.f41895a);
    }

    /* renamed from: a */
    public static C16487f m51162a(C9370a c9370a) {
        return C13194h.m51164c(c9370a);
    }

    /* renamed from: b */
    public static C13194h m51163b(C9370a c9370a) {
        return new C13194h(c9370a);
    }

    /* renamed from: c */
    public static C16487f m51164c(C9370a c9370a) {
        return (C16487f) C15521i.a(c9370a.m39231d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
