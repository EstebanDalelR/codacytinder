package com.tinder.reactions.gestures.p395c;

import com.tinder.reactions.p385c.C16288h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.c.g */
public final class C17984g implements Factory<C16347e> {
    /* renamed from: a */
    private final Provider<C16345a> f55915a;
    /* renamed from: b */
    private final Provider<String> f55916b;
    /* renamed from: c */
    private final Provider<C16288h> f55917c;

    public /* synthetic */ Object get() {
        return m65337a();
    }

    public C17984g(Provider<C16345a> provider, Provider<String> provider2, Provider<C16288h> provider3) {
        this.f55915a = provider;
        this.f55916b = provider2;
        this.f55917c = provider3;
    }

    /* renamed from: a */
    public C16347e m65337a() {
        return C17984g.m65335a(this.f55915a, this.f55916b, this.f55917c);
    }

    /* renamed from: a */
    public static C16347e m65335a(Provider<C16345a> provider, Provider<String> provider2, Provider<C16288h> provider3) {
        return new C16347e((C16345a) provider.get(), (String) provider2.get(), (C16288h) provider3.get());
    }

    /* renamed from: b */
    public static C17984g m65336b(Provider<C16345a> provider, Provider<String> provider2, Provider<C16288h> provider3) {
        return new C17984g(provider, provider2, provider3);
    }
}
