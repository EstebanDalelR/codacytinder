package com.tinder.module;

import com.tinder.ads.SourceMediator;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.module.w */
public final class C13502w implements Factory<SourceMediator> {
    /* renamed from: a */
    private final C9940d f43089a;

    public /* synthetic */ Object get() {
        return m52599a();
    }

    public C13502w(C9940d c9940d) {
        this.f43089a = c9940d;
    }

    /* renamed from: a */
    public SourceMediator m52599a() {
        return C13502w.m52596a(this.f43089a);
    }

    /* renamed from: a */
    public static SourceMediator m52596a(C9940d c9940d) {
        return C13502w.m52598c(c9940d);
    }

    /* renamed from: b */
    public static C13502w m52597b(C9940d c9940d) {
        return new C13502w(c9940d);
    }

    /* renamed from: c */
    public static SourceMediator m52598c(C9940d c9940d) {
        return (SourceMediator) C15521i.a(c9940d.m40859a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
