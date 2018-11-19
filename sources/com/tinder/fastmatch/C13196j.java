package com.tinder.fastmatch;

import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.fastmatch.j */
public final class C13196j implements Factory<C15453a> {
    /* renamed from: a */
    private final C9370a f41898a;

    public /* synthetic */ Object get() {
        return m51173a();
    }

    public C13196j(C9370a c9370a) {
        this.f41898a = c9370a;
    }

    /* renamed from: a */
    public C15453a m51173a() {
        return C13196j.m51170a(this.f41898a);
    }

    /* renamed from: a */
    public static C15453a m51170a(C9370a c9370a) {
        return C13196j.m51172c(c9370a);
    }

    /* renamed from: b */
    public static C13196j m51171b(C9370a c9370a) {
        return new C13196j(c9370a);
    }

    /* renamed from: c */
    public static C15453a m51172c(C9370a c9370a) {
        return (C15453a) C15521i.a(c9370a.m39232e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
