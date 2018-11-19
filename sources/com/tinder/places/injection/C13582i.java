package com.tinder.places.injection;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.injection.i */
public final class C13582i implements Factory<ScrollStatusNotifier> {
    /* renamed from: a */
    private final C10215g f43324a;
    /* renamed from: b */
    private final Provider<C16487f> f43325b;

    public /* synthetic */ Object get() {
        return m53019a();
    }

    public C13582i(C10215g c10215g, Provider<C16487f> provider) {
        this.f43324a = c10215g;
        this.f43325b = provider;
    }

    /* renamed from: a */
    public ScrollStatusNotifier m53019a() {
        return C13582i.m53017a(this.f43324a, this.f43325b);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m53017a(C10215g c10215g, Provider<C16487f> provider) {
        return C13582i.m53016a(c10215g, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C13582i m53018b(C10215g c10215g, Provider<C16487f> provider) {
        return new C13582i(c10215g, provider);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m53016a(C10215g c10215g, C16487f c16487f) {
        return (ScrollStatusNotifier) C15521i.a(c10215g.m41536a(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
