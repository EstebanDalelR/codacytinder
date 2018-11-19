package com.tinder.reactions.chat.feature;

import com.tinder.reactions.chat.p386a.C14599c;
import com.tinder.reactions.chat.presenter.C14605d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.chat.feature.e */
public final class C17948e implements Factory<C16299d> {
    /* renamed from: a */
    private final Provider<C14605d> f55864a;
    /* renamed from: b */
    private final Provider<C14599c> f55865b;

    public /* synthetic */ Object get() {
        return m65273a();
    }

    public C17948e(Provider<C14605d> provider, Provider<C14599c> provider2) {
        this.f55864a = provider;
        this.f55865b = provider2;
    }

    /* renamed from: a */
    public C16299d m65273a() {
        return C17948e.m65271a(this.f55864a, this.f55865b);
    }

    /* renamed from: a */
    public static C16299d m65271a(Provider<C14605d> provider, Provider<C14599c> provider2) {
        return new C16299d((C14605d) provider.get(), (C14599c) provider2.get());
    }

    /* renamed from: b */
    public static C17948e m65272b(Provider<C14605d> provider, Provider<C14599c> provider2) {
        return new C17948e(provider, provider2);
    }
}
