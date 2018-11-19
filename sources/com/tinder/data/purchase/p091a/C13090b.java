package com.tinder.data.purchase.p091a;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.purchase.a.b */
public final class C13090b implements Factory<C3926a> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f41693a;

    public /* synthetic */ Object get() {
        return m50929a();
    }

    public C13090b(Provider<SubscriptionProvider> provider) {
        this.f41693a = provider;
    }

    /* renamed from: a */
    public C3926a m50929a() {
        return C13090b.m50927a(this.f41693a);
    }

    /* renamed from: a */
    public static C3926a m50927a(Provider<SubscriptionProvider> provider) {
        return new C3926a((SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C13090b m50928b(Provider<SubscriptionProvider> provider) {
        return new C13090b(provider);
    }
}
