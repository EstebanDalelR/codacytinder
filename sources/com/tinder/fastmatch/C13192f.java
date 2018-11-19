package com.tinder.fastmatch;

import com.tinder.recsgrid.C14782d;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.fastmatch.f */
public final class C13192f implements Factory<C14782d> {
    /* renamed from: a */
    private final C9370a f41892a;

    public /* synthetic */ Object get() {
        return m51157a();
    }

    public C13192f(C9370a c9370a) {
        this.f41892a = c9370a;
    }

    /* renamed from: a */
    public C14782d m51157a() {
        return C13192f.m51154a(this.f41892a);
    }

    /* renamed from: a */
    public static C14782d m51154a(C9370a c9370a) {
        return C13192f.m51156c(c9370a);
    }

    /* renamed from: b */
    public static C13192f m51155b(C9370a c9370a) {
        return new C13192f(c9370a);
    }

    /* renamed from: c */
    public static C14782d m51156c(C9370a c9370a) {
        return (C14782d) C15521i.a(c9370a.m39230c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
