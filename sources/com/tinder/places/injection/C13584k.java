package com.tinder.places.injection;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.injection.k */
public final class C13584k implements Factory<ScrollStatusProvider> {
    /* renamed from: a */
    private final C10215g f43327a;
    /* renamed from: b */
    private final Provider<C16487f> f43328b;

    public /* synthetic */ Object get() {
        return m53027a();
    }

    public C13584k(C10215g c10215g, Provider<C16487f> provider) {
        this.f43327a = c10215g;
        this.f43328b = provider;
    }

    /* renamed from: a */
    public ScrollStatusProvider m53027a() {
        return C13584k.m53025a(this.f43327a, this.f43328b);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m53025a(C10215g c10215g, Provider<C16487f> provider) {
        return C13584k.m53024a(c10215g, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C13584k m53026b(C10215g c10215g, Provider<C16487f> provider) {
        return new C13584k(c10215g, provider);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m53024a(C10215g c10215g, C16487f c16487f) {
        return (ScrollStatusProvider) C15521i.a(c10215g.m41538b(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
