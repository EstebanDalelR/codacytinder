package com.tinder.purchase.domain.model.p375a;

import com.tinder.purchase.domain.model.C14511f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.domain.model.a.b */
public final class C17819b implements Factory<C14503a> {
    /* renamed from: a */
    private final Provider<C14511f> f55631a;

    public /* synthetic */ Object get() {
        return m65106a();
    }

    public C17819b(Provider<C14511f> provider) {
        this.f55631a = provider;
    }

    /* renamed from: a */
    public C14503a m65106a() {
        return C17819b.m65104a(this.f55631a);
    }

    /* renamed from: a */
    public static C14503a m65104a(Provider<C14511f> provider) {
        return new C14503a((C14511f) provider.get());
    }

    /* renamed from: b */
    public static C17819b m65105b(Provider<C14511f> provider) {
        return new C17819b(provider);
    }
}
