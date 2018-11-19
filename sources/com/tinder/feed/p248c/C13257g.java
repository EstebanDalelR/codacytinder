package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.g */
public final class C13257g implements Factory<C8573a> {
    /* renamed from: a */
    private final C9461b f42004a;
    /* renamed from: b */
    private final Provider<C8573a> f42005b;

    public /* synthetic */ Object get() {
        return m51289a();
    }

    public C13257g(C9461b c9461b, Provider<C8573a> provider) {
        this.f42004a = c9461b;
        this.f42005b = provider;
    }

    /* renamed from: a */
    public C8573a m51289a() {
        return C13257g.m51287a(this.f42004a, this.f42005b);
    }

    /* renamed from: a */
    public static C8573a m51287a(C9461b c9461b, Provider<C8573a> provider) {
        return C13257g.m51286a(c9461b, (C8573a) provider.get());
    }

    /* renamed from: b */
    public static C13257g m51288b(C9461b c9461b, Provider<C8573a> provider) {
        return new C13257g(c9461b, provider);
    }

    /* renamed from: a */
    public static C8573a m51286a(C9461b c9461b, C8573a c8573a) {
        return (C8573a) C15521i.a(c9461b.m39556a(c8573a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
