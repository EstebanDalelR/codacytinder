package com.tinder.screenshot;

import com.tinder.managers.bt;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.screenshot.f */
public final class C18048f implements Factory<C16569e> {
    /* renamed from: a */
    private final Provider<bt> f56055a;

    public /* synthetic */ Object get() {
        return m65523a();
    }

    public C18048f(Provider<bt> provider) {
        this.f56055a = provider;
    }

    /* renamed from: a */
    public C16569e m65523a() {
        return C18048f.m65521a(this.f56055a);
    }

    /* renamed from: a */
    public static C16569e m65521a(Provider<bt> provider) {
        return new C16569e((bt) provider.get());
    }

    /* renamed from: b */
    public static C18048f m65522b(Provider<bt> provider) {
        return new C18048f(provider);
    }
}
