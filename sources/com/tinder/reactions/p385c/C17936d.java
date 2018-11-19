package com.tinder.reactions.p385c;

import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.c.d */
public final class C17936d implements Factory<C16284c> {
    /* renamed from: a */
    private final Provider<ConfirmTutorialsViewed> f55844a;
    /* renamed from: b */
    private final Provider<bk> f55845b;

    public /* synthetic */ Object get() {
        return m65247a();
    }

    public C17936d(Provider<ConfirmTutorialsViewed> provider, Provider<bk> provider2) {
        this.f55844a = provider;
        this.f55845b = provider2;
    }

    /* renamed from: a */
    public C16284c m65247a() {
        return C17936d.m65245a(this.f55844a, this.f55845b);
    }

    /* renamed from: a */
    public static C16284c m65245a(Provider<ConfirmTutorialsViewed> provider, Provider<bk> provider2) {
        return new C16284c((ConfirmTutorialsViewed) provider.get(), (bk) provider2.get());
    }

    /* renamed from: b */
    public static C17936d m65246b(Provider<ConfirmTutorialsViewed> provider, Provider<bk> provider2) {
        return new C17936d(provider, provider2);
    }
}
