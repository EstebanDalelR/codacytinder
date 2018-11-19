package com.tinder.reactions.common;

import android.content.Context;
import com.tinder.reactions.gestures.viewmodel.C14679j;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.common.d */
public final class C17960d implements Factory<C14608a> {
    /* renamed from: a */
    private final Provider<C14679j> f55890a;
    /* renamed from: b */
    private final Provider<Context> f55891b;
    /* renamed from: c */
    private final Provider<C14613b> f55892c;

    public /* synthetic */ Object get() {
        return m65293a();
    }

    public C17960d(Provider<C14679j> provider, Provider<Context> provider2, Provider<C14613b> provider3) {
        this.f55890a = provider;
        this.f55891b = provider2;
        this.f55892c = provider3;
    }

    /* renamed from: a */
    public C14608a m65293a() {
        return C17960d.m65291a(this.f55890a, this.f55891b, this.f55892c);
    }

    /* renamed from: a */
    public static C14608a m65291a(Provider<C14679j> provider, Provider<Context> provider2, Provider<C14613b> provider3) {
        return new C14608a((C14679j) provider.get(), (Context) provider2.get(), (C14613b) provider3.get());
    }

    /* renamed from: b */
    public static C17960d m65292b(Provider<C14679j> provider, Provider<Context> provider2, Provider<C14613b> provider3) {
        return new C17960d(provider, provider2, provider3);
    }
}
