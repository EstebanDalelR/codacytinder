package com.tinder.app.dagger.module.toppicks;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.d */
public final class C12534d implements Factory<ScrollStatusNotifier> {
    /* renamed from: a */
    private final C8254a f40389a;
    /* renamed from: b */
    private final Provider<C16487f> f40390b;

    public /* synthetic */ Object get() {
        return m49327a();
    }

    public C12534d(C8254a c8254a, Provider<C16487f> provider) {
        this.f40389a = c8254a;
        this.f40390b = provider;
    }

    /* renamed from: a */
    public ScrollStatusNotifier m49327a() {
        return C12534d.m49325a(this.f40389a, this.f40390b);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m49325a(C8254a c8254a, Provider<C16487f> provider) {
        return C12534d.m49324a(c8254a, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C12534d m49326b(C8254a c8254a, Provider<C16487f> provider) {
        return new C12534d(c8254a, provider);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m49324a(C8254a c8254a, C16487f c16487f) {
        return (ScrollStatusNotifier) C15521i.a(c8254a.m35232a(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
