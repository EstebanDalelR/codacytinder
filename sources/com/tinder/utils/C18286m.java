package com.tinder.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.utils.m */
public final class C18286m implements Factory<C15362l> {
    /* renamed from: a */
    private final Provider<Context> f56626a;

    public /* synthetic */ Object get() {
        return m66228a();
    }

    public C18286m(Provider<Context> provider) {
        this.f56626a = provider;
    }

    /* renamed from: a */
    public C15362l m66228a() {
        return C18286m.m66226a(this.f56626a);
    }

    /* renamed from: a */
    public static C15362l m66226a(Provider<Context> provider) {
        return new C15362l((Context) provider.get());
    }

    /* renamed from: b */
    public static C18286m m66227b(Provider<Context> provider) {
        return new C18286m(provider);
    }
}
