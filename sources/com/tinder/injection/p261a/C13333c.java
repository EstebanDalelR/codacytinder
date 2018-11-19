package com.tinder.injection.p261a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;

/* renamed from: com.tinder.injection.a.c */
public final class C13333c implements Factory<C15679f> {
    /* renamed from: a */
    private final C9707a f42306a;

    public /* synthetic */ Object get() {
        return m51591a();
    }

    public C13333c(C9707a c9707a) {
        this.f42306a = c9707a;
    }

    /* renamed from: a */
    public C15679f m51591a() {
        return C13333c.m51588a(this.f42306a);
    }

    /* renamed from: a */
    public static C15679f m51588a(C9707a c9707a) {
        return C13333c.m51590c(c9707a);
    }

    /* renamed from: b */
    public static C13333c m51589b(C9707a c9707a) {
        return new C13333c(c9707a);
    }

    /* renamed from: c */
    public static C15679f m51590c(C9707a c9707a) {
        return (C15679f) C15521i.a(c9707a.m40171b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
