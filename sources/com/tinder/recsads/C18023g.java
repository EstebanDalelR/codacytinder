package com.tinder.recsads;

import com.tinder.recsads.analytics.C16440t;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.g */
public final class C18023g implements Factory<C16458f> {
    /* renamed from: a */
    private final Provider<C16440t> f55968a;

    public /* synthetic */ Object get() {
        return m65428a();
    }

    public C18023g(Provider<C16440t> provider) {
        this.f55968a = provider;
    }

    /* renamed from: a */
    public C16458f m65428a() {
        return C18023g.m65426a(this.f55968a);
    }

    /* renamed from: a */
    public static C16458f m65426a(Provider<C16440t> provider) {
        return new C16458f((C16440t) provider.get());
    }

    /* renamed from: b */
    public static C18023g m65427b(Provider<C16440t> provider) {
        return new C18023g(provider);
    }
}
