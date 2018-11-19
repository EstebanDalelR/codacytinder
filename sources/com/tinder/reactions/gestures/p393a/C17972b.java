package com.tinder.reactions.gestures.p393a;

import com.tinder.reactions.gestures.p395c.C16346c;
import com.tinder.reactions.gestures.p395c.C16348h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.a.b */
public final class C17972b implements Factory<C14641a> {
    /* renamed from: a */
    private final Provider<C16346c> f55905a;
    /* renamed from: b */
    private final Provider<C16348h> f55906b;

    public /* synthetic */ Object get() {
        return m65319a();
    }

    public C17972b(Provider<C16346c> provider, Provider<C16348h> provider2) {
        this.f55905a = provider;
        this.f55906b = provider2;
    }

    /* renamed from: a */
    public C14641a m65319a() {
        return C17972b.m65317a(this.f55905a, this.f55906b);
    }

    /* renamed from: a */
    public static C14641a m65317a(Provider<C16346c> provider, Provider<C16348h> provider2) {
        return new C14641a((C16346c) provider.get(), (C16348h) provider2.get());
    }

    /* renamed from: b */
    public static C17972b m65318b(Provider<C16346c> provider, Provider<C16348h> provider2) {
        return new C17972b(provider, provider2);
    }
}
