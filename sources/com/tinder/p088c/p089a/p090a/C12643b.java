package com.tinder.p088c.p089a.p090a;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.c.a.a.b */
public final class C12643b implements Factory<C3923a> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f40780a;

    public /* synthetic */ Object get() {
        return m49899a();
    }

    public C12643b(Provider<SubscriptionProvider> provider) {
        this.f40780a = provider;
    }

    /* renamed from: a */
    public C3923a m49899a() {
        return C12643b.m49897a(this.f40780a);
    }

    /* renamed from: a */
    public static C3923a m49897a(Provider<SubscriptionProvider> provider) {
        return new C3923a((SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C12643b m49898b(Provider<SubscriptionProvider> provider) {
        return new C12643b(provider);
    }
}
