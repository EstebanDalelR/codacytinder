package com.tinder.module;

import com.tinder.common.navigation.Screen;
import com.tinder.feed.p341b.C11695a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ah implements Factory<Screen> {
    /* renamed from: a */
    private final aa f42753a;
    /* renamed from: b */
    private final Provider<C11695a> f42754b;

    public /* synthetic */ Object get() {
        return m52078a();
    }

    /* renamed from: a */
    public Screen m52078a() {
        return m52077a(this.f42753a, this.f42754b);
    }

    /* renamed from: a */
    public static Screen m52077a(aa aaVar, Provider<C11695a> provider) {
        return m52076a(aaVar, (C11695a) provider.get());
    }

    /* renamed from: a */
    public static Screen m52076a(aa aaVar, C11695a c11695a) {
        return (Screen) C15521i.a(aaVar.m40773a(c11695a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
