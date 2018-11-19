package com.tinder.data.purchase.p091a;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.purchase.a.d */
public final class C13091d implements Factory<C10985c> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f41694a;

    public /* synthetic */ Object get() {
        return m50932a();
    }

    public C13091d(Provider<SubscriptionProvider> provider) {
        this.f41694a = provider;
    }

    /* renamed from: a */
    public C10985c m50932a() {
        return C13091d.m50930a(this.f41694a);
    }

    /* renamed from: a */
    public static C10985c m50930a(Provider<SubscriptionProvider> provider) {
        return new C10985c((SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C13091d m50931b(Provider<SubscriptionProvider> provider) {
        return new C13091d(provider);
    }
}
