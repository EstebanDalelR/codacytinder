package com.tinder.app.dagger.module.toppicks;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.f */
public final class C12536f implements Factory<ScrollStatusProvider> {
    /* renamed from: a */
    private final C8254a f40392a;
    /* renamed from: b */
    private final Provider<C16487f> f40393b;

    public /* synthetic */ Object get() {
        return m49335a();
    }

    public C12536f(C8254a c8254a, Provider<C16487f> provider) {
        this.f40392a = c8254a;
        this.f40393b = provider;
    }

    /* renamed from: a */
    public ScrollStatusProvider m49335a() {
        return C12536f.m49333a(this.f40392a, this.f40393b);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m49333a(C8254a c8254a, Provider<C16487f> provider) {
        return C12536f.m49332a(c8254a, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C12536f m49334b(C8254a c8254a, Provider<C16487f> provider) {
        return new C12536f(c8254a, provider);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m49332a(C8254a c8254a, C16487f c16487f) {
        return (ScrollStatusProvider) C15521i.a(c8254a.m35237b(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
